const pila = ["C","T","P","D"];
const barajaDesordenado = [];
for (let i = 1; i < pila.length; i++) {
    for (let j = 1; j < 14; j++) {
        barajaDesordenado.push(j + pila[i]);
        
    }
    
}
let elementoEncontrado = barajaDesordenado.find

barajaDesordenado = _.shuffle(barajaDesordenado);