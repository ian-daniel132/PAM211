function verificarUsuario(usuario) {
    return new Promise((resolve, reject) => {
        if (usuario === "admin") {
            resolve("Acceso concedido");
        } else {
            reject("Acceso denegado");
        }
    });
}

// Pprobamos ambos estados de la promesa, cuando se cumple y cuando no 
console.log("=== PRUEBAS DE VERIFICAR USUARIO ===");

// Este es para el caso de que se cunmpla
verificarUsuario("admin")
    .then(res => console.log(res)) 
    .catch(err => console.error(err));
    // Acceso concedido

// Este caso es para cuando no se cumple la promesa
verificarUsuario("ivan")
    .then(res => console.log(res))
    .catch(err => console.error(err)); 
    // Acceso denegado
