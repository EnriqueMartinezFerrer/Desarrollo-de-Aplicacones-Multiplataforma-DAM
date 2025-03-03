let elementosAny = [];
const elementosPalabra = ["Palabra 1", "Palabra 2"];
    //Obtener elementos
console.log(elementosPalabra[1]);
console.log(elementosPalabra[5]);
//Cambiar
elementosPalabra[0] = "Palabra 1 modificada";
elementosPalabra[2] = "Palabra 3 ";
elementosPalabra[10] = "Palabra 10";
// ["Palabra 1, Palabra 2", "Palabra 3"]

console.log(elementosPalabra.length);
elementosPalabra.forEach((element) => {
    console.log(element);
} );