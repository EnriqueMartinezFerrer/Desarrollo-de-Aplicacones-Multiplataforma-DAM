<?php
session_start();
unset($_SESSION);
session_destroy();
echo "sesión destruida"
var_export($_SESSION);
?>