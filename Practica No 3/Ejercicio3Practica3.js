function simularPeticionAPI() {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve("Datos recibidos correctamente");
        }, 5600);
    });
}

async function obtenerDatos() {
    try {
        console.log("Realizando petición a la API...");
        const resultado = await simularPeticionAPI();
        console.log(resultado);
        console.log("Proceso completado");
    } catch (error) {
        console.error("Error:", error);
    }
}

// Usar la función async
console.log("=== SIMULACIÓN DE API CON ASYNC/AWAIT ===");
obtenerDatos();