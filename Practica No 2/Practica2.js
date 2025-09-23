
const productos = [ 
    { nombre: "Laptop", precio: 1500 },
    { nombre: "Teclado", precio: 1200},
    { nombre: "Mouse", precio: 50},
    { nombre: "Monitor", precio: 300},
    { nombre: "Tablet", precio: 800}
]; 

const productosCaros = productos
    .filter(producto => producto.precio > 1000)
    .map(producto => producto.nombre); 

console.log(productosCaros); 