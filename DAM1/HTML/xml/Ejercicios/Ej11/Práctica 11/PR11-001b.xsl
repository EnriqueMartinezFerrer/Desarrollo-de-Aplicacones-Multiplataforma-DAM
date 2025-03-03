<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/><title>Listado de libros ordenado alfabeticamente de Mario Vargas Llosa</title> </head>
<body> 
  <table border="1">
  <tr><th>Autor</th><th>Libro</th><th>Fecha de publicación</th></tr>
  <xsl:for-each select="/biblioteca/libro">
  <xsl:sort select="titulo" data-type="text" order="ascending"/>
  <tr>
  <td><xsl:value-of select="titulo"/></td>
  <td><xsl:value-of select="autor"/></td>
  <td><xsl:value-of select="fechaPublicacion"/></td>
  </tr>
  </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>


