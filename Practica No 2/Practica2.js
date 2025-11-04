
const personas = [
    { nombre: "Ian", edad: 21 },
    { nombre: "Sergio", edad: 29 },
    { nombre: "Goku", edad: 37 }
];

// 1. Buscar a Goku utilizando un .find 
const personaGoku = personas.find(persona => persona.nombre === "Goku");
console.log("Persona encontrada:", personaGoku);

// 2. Usamos .forEach para imprimir el nombre y edad de cada persona del arreglo
console.log("\nLista de personas:");
personas.forEach(persona => {
    console.log(persona.nombre + " tiene " + persona.edad + " años"); 
});

// 3.- Utilizar un .reduce para sumar todas las edades y obtener un total
const totalEdades = personas.reduce((acumulador, persona) => acumulador + persona.edad, 0);
console.log("\nTotal de edades: " + totalEdades); 