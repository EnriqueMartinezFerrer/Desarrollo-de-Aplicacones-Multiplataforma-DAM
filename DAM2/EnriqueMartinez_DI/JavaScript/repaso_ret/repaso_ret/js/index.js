let inputNombre = document.querySelector("#input_nombre");
/* console.log(inputNombre); */

let url = "https://jsonplaceholder.typicode.com/posts";
let arrayPosts = [];
fetch(url)
  .then((ok) => {
    if (ok.status == 200) {
      console.log("Conexion correcta, parseando datos");
      return ok.json();
    } else {
      console.log("Conexion correcta, url no codificada");
    }
  })
  .then((ok1) => {
    ok1.forEach((element) => {
      let post = {
        title: element.title,
        body: element.body,
      };
      arrayPosts.push(post);
    });
  })
  .catch((err) => {
    console.log("La conexion no se ha podido producir");
  })
  .finally(() => {
    console.log(arrayPosts.length);
  });
