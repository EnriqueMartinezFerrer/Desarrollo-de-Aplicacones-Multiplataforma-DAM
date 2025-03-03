<!DOCTYPE html>
<html>
  <head>
    <title>Administrador</title>
    <style>
        .container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
  background-color: #f7f7f7;
}

.heading {
  font-size: 36px;
  font-weight: bold;
  margin-bottom: 40px;
}

.buttons {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.button-87 {
  margin: 10px;
  padding: 15px 30px;
  text-align: center;
  text-transform: uppercase;
  transition: 0.5s;
  background-size: 200% auto;
  color: white;
  border-radius: 10px;
  display: block;
  border: 0px;
  font-weight: 700;
  box-shadow: 0px 0px 14px -7px #f09819;
  background-image: linear-gradient(45deg, #FF512F 0%, #F09819  51%, #FF512F  100%);
  cursor: pointer;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
}

.button-87:hover {
  background-position: right center;
  /* change the direction of the change here */
  color: #fff;
  text-decoration: none;
}

.button-87:active {
  transform: scale(0.95);
}
    </style>
  </head>
  <body>
    <div class="container">
      <h1 class="heading">Bienvenido al administrador</h1>

      <div class="buttons">
        <form action="admin.php" method="get">
          <p>
            <input type="submit" name="administrar_mazos" value="Administrar mazos" class="button-87">
          </p>
        </form>

        <form action="cartas.php" method="get">
          <p>
            <input type="submit" name="administrar_cartas" value="Administrar cartas" class="button-87">
          </p>
        </form>
      </div>
    </div>
  </body>
</html>
