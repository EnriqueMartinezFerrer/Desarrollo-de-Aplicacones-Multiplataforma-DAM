let elementos = [1,2,3,4,5,6,7,8,9,10, "Opcion"];
/**elementos.forEach(() => {
    console.log("ejecucion");
});*/
elementos.forEach((item, index) => {
    index % 2 && console.log(item);
});
