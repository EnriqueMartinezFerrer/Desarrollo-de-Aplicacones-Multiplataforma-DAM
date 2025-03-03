<html>
<head>
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>
    <form method= "POST" action="e.php">

        <?php echo"Numero: "?><input name="numero"/> <br/><br/>
        <?php echo"Simbolo: "?><input name="simbolo"/> <br/><br/>
        <?php echo"Operador: "?>
        <select name="oper" id="oper">
            <option value="suma">suma</option>
            <option value="mult">multiplicación</option>
        </select><br/><br/>
        <input type="submit" name="dame"/>
    </form>
    <script type="text/javascript">Swal.fire({
  icon: 'error',
  title: 'Oops...',
  text: 'Something went wrong!',
  footer: '<a href="">Why do I have this issue?</a>'
})</script>
</body>

</html>
