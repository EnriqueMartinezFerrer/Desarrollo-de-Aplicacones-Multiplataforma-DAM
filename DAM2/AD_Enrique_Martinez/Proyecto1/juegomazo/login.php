<?php
if (isset($_POST['roles'])) {
  if ($_POST['role'] == 'Jugador') {
    header('Location: jugador.php');
  } elseif ($_POST['role'] == 'Admin') {
    header('Location: admin.php');
  }
}
?>