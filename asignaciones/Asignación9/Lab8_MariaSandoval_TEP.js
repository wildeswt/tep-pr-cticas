const libros = [
    { titulo: "Cien años de soledad", autor: "Gabriel García Márquez" },
    { titulo: "El Principito", autor: "Antoine de Saint-Exupéry" },
    { titulo: "1984", autor: "George Orwell" },
    { titulo: "Rayuela", autor: "Julio Cortázar" }
];

function descargarLibro(libro) {
    return new Promise((resolve) => {
        const tiempo = Math.floor(Math.random() * 3000) + 1000; // 1s a 4s
        console.log(`Iniciando descarga de: ${libro.titulo} de ${libro.autor}`);
        setTimeout(() => {
            console.log(`Descarga completada: ${libro.titulo}`);
            resolve(libro);
        }, tiempo);
    });
}

async function descargaSecuencial() {
    console.log("\nDescarga secuencial: ");
    for (const libro of libros) 
        await descargarLibro(libro);
    
}

async function descargaParalela() {
    console.log("\nDescarga paralela:  ");
    await Promise.all(libros.map(descargarLibro));
}

(async () => {
    await descargaSecuencial();
    await descargaParalela();
})();