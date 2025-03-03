<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"     doctype-public="-//W3C//DTD XHTML 1.1//EN" 
doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
 <xsl:template match="/">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
<head>
<title align="center">pgta1</title> 
</head>
<body>
		
		<h1 align="center"> COLEGIO RETAMAR </h1>
		
		
		<!--  ESCRIBE AQUI TU PLANTILLA RESPUESTA  XPATH / XLS -->
   <h3 align="center">Pagina web:  <xsl:value-of select="/centro/@web"/></h3>
		
	      <table border="1" cellpadding="10" align="center" width="75%">
          <tr >
          <th bgcolor="green">Nombre del Ciclo</th>
            <th bgcolor="green">Grado</th>
              <th bgcolor="green">Año del Titulo</th>
          </tr>
      <xsl:for-each select="/centro/ciclos/ciclo">
      <xsl:sort select ="grado" data-type="text" order="descending"/>
      <tr>
      <td align="center"><xsl:value-of select="nombre"/></td>
            <td align="center"><xsl:value-of select="grado"/></td>
             <td align="center"><xsl:value-of select="decretoTitulo/@año"/></td>
      </tr>
      </xsl:for-each>
      </table>
</body>
</html>
  </xsl:template>
</xsl:stylesheet>
	

