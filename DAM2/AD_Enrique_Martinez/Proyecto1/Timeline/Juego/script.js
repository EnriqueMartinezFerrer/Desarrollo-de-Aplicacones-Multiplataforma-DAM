//areglo para saber cuales divs ya estan ocupados
let arreglo = ["", "", "","","","",""];

//funcion que evita que se abra como enlace al clicar foto ?¿
function allowDrop(ev){
  ev.preventDefault();
}

//lo que sucede cuando se arrastra un elemento
function drag(ev){
  //metodo que establece el tipo de datos y el valor de dato arrastrado
  //en este caso el datos es texto y el valor es el id del elemento arrastrado   
  ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev){
  // mediante ev.target.id tomo el nombre del id del div que puede ser 0 o 1 o 2
  //si el sarreglo en dicha posicion esta vacio significa que no tiene nada
  //osea puedo soltar ahi algo, de lo contrario ya tiene un elemento
  if(arreglo[parseInt(ev.target.id)]==""){
    //obtengo los datos arrastradi con el metodo dataTrasfer.getData(). este metodo
    //devolvera cualquier dato que se haya establecido en el mismo tipo en metodo setData().
    var data = ev.dataTransfer.getData("text")
    //agrego al arreglo el nombre del id
    arreglo[parseInt(ev.target.id)] = data;
    //agrgo el elementi arrastradi ak elemento soltado
    ev.target.appendChild(document.getElementById(data));

  }
}


