from typing import Generic, TypeVar, List, Optional

T = TypeVar('T')

class ColaPrioridad(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []
        self.prioridades: List[int] = []

    def esta_vacia(self) -> bool:
        return len(self.elementos) == 0

    def cantidad(self) -> int:
        return len(self.elementos)

    def agregar(self, elemento: T, prioridad: int):
        if self.esta_vacia():
            self.elementos.append(elemento)
            self.prioridades.append(prioridad)
        else:
            inserted = False
            for i in range(len(self.prioridades)):
                if prioridad > self.prioridades[i]:
                    self.elementos.insert(i, elemento)
                    self.prioridades.insert(i, prioridad)
                    inserted = True
                    break
            if not inserted:
                self.elementos.append(elemento)
                self.prioridades.append(prioridad)

    def extraer_mayor_prioridad(self) -> Optional[T]:
        if self.esta_vacia():
            return None
        self.prioridades.pop(0)
        return self.elementos.pop(0)

    def consultar_mayor_prioridad(self) -> Optional[T]:
        if self.esta_vacia():
            return None
        return self.elementos[0]

    def mostrar_cola(self):
        print("Cola de prioridad:")
        for i in range(len(self.elementos)):
            print(f"Prioridad: {self.prioridades[i]}, Elemento: {self.elementos[i]}")

def sistema_gestion_emergencias():
    cola = ColaPrioridad[str]()

    cola.agregar("Suministrar medicamento programado", 1)
    cola.agregar("Intubación de paciente con dificultad respiratoria", 3)
    cola.agregar("Reducción de fractura abierta", 2)
    

    cola.mostrar_cola()

    print("\nExtrayendo atención de mayor prioridad:")
    while not cola.esta_vacia():
        tarea = cola.extraer_mayor_prioridad()
        print(f"Atendiendo: {tarea}")

    print(f"\n¿La cola está vacía?: {cola.esta_vacia()}")
    print(f"Cantidad de elementos en la cola: {cola.cantidad()}")

if __name__ == "__main__":
    print("Sistema de Gestión de Emergencias")
    sistema_gestion_emergencias()