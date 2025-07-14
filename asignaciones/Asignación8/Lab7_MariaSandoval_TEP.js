
// Utilizando Callbacks
function hervirAguaCallback(callback) {
    console.log("Hirviendo agua...");
    setTimeout(() => {
        console.log("Agua hervida");
        callback();
    }, 2000);
}

function prepararCafeCallback(callback) {
    console.log("Preparando café...");
    setTimeout(() => {
        console.log("Café preparado");
        callback();
    }, 1500);
}

function servirCafeCallback() {
    console.log("Sirviendo café...");
    setTimeout(() => {
        console.log("Café servido");
    }, 1000);
}

function prepararCafeConCallbacks() {
    console.log("\nPreparar café con callbacks");
    hervirAguaCallback(() => {
        prepararCafeCallback(() => {
            servirCafeCallback();
        });
    });
}

// Utilizando Promises
function hervirAguaPromise() {
    console.log("Hirviendo agua...");
    return new Promise(resolve => {
        setTimeout(() => {
            console.log("Agua hervida.");
            resolve();
        }, 2000);
    });
}

function prepararCafePromise() {
    console.log("Preparando café...");
    return new Promise(resolve => {
        setTimeout(() => {
            console.log("Café preparado.");
            resolve();
        }, 1500);
    });
}

function servirCafePromise() {
    console.log("Sirviendo café...");
    return new Promise(resolve => {
        setTimeout(() => {
            console.log("Café servido");
            resolve();
        }, 1000);
    });
}

function prepararCafeConPromises() {
    console.log("\nPreparar café con promises");
    hervirAguaPromise()
        .then(() => prepararCafePromise())
        .then(() => servirCafePromise());
}

// Utilizando async/await
async function prepararCafeConAsyncAwait() {
    console.log("\nPreparar café con async/await");
    await hervirAguaPromise();
    await prepararCafePromise();
    await servirCafePromise();
}

setTimeout(() => {
    prepararCafeConCallbacks();
    setTimeout(() => prepararCafeConPromises(), 5000);
    setTimeout(() => prepararCafeConAsyncAwait(), 10000);
}, 8000);
