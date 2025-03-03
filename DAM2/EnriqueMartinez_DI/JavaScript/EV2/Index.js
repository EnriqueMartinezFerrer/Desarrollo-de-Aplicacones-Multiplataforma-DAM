/**
 * Nada mas arrancar la pagina, aparece un cuadro pidiendo el nombre
 * Si he metido nombre, aparece un cuadro de dialogo indicando que introduzca un operador
 * Aparece un cuadro de dialogo indicando que introduzca un operador
 * Aparece un cuadro de dialogo de confirmación con el texto "nombre", quieres ver todas las operaciones entre "4" y "7"
 *      - En el caso de pulsar SI
 *          - Se mostrara un cuadro de dialogo de alerta con cada una de las oepraciones x+y = resultado
 *          - Se mostrara un cuadro de dialogo de alerta con cada una de las oepraciones x-y = resultado
 *          - Se mostrara un cuadro de dialogo de alerta con cada una de las oepraciones x*y = resultado
 *          - Se mostrara un cuadro de dialogo de alerta con cada una de las oepraciones x/y = resultado
 *          - Se mostrara un cuadro de dialogo de alerta con cada una de las oepraciones x%y = resultado
 *      - En el caso de pulsar NO
 *          - Se mostrara un cuadro de alerta indicando que el proceso termina
 *
 * Comprobación de errores:
 *      - Si no introduzco nombre o uno de los operandos no es un numero, no deberia continuar con el proceso
 */
let nombre = prompt("Porfavor Introduce Nombre");
if (nombre.length > 0 || nombre > null) {
    //He introduce un nombre
    let operandoUno = parseInt(prompt("Introduce el primer operador"))
    let operandoDos = parseInt(prompt("Introduce el primer operador"))

        if (!isNaN(operandoUno) && !isNaN(operandoDos)) {
            //Cuando los dos operandos son numeros
            alert(`${nombre}, hay un fallo en alguno de los datos `);
            }else {
            alert(`${operandoUno} + ${operandoDos} = ${operandoUno + operandoDos}`);
            alert(`${operandoUno} - ${operandoDos} = ${operandoUno - operandoDos}`);
            alert(`${operandoUno} * ${operandoDos} = ${operandoUno * operandoDos}`);
            alert(`${operandoUno} / ${operandoDos} = ${operandoUno / operandoDos}`);
            alert(`${operandoUno} % ${operandoDos} = ${operandoUno % operandoDos}`);
        }
}