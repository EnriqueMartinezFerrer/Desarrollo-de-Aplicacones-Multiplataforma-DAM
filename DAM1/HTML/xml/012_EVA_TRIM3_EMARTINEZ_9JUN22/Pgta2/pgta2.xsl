<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"
         doctype-public="-//W3C//DTD XHTML 1.1//EN"
         doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
   <xsl:template match="/">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
<head>
<title >pgta2</title>
</head>
       <body>
       <h1 align="center">MIS LIBROS</h1> 
       	<!--  ESCRIBE AQUI TU PLANTILLA RESPUESTA  XPATH / XLS -->
         <table align="center" bgcolor="orange" width="75%" border="1">
           <th>TITULO</th>
           <th>AUTOR</th>
           <th>PRECIO</th>
           <xsl:for-each select="libros/libro[Titulo]">
           <xsl:sort select="Titulo" data-type="Text" order="ascending">
           <tr>
            <td><xsl:value-of select="Titulo"/></td>
            <td><xsl:value-of select="autor"/></td>
            <td><xsl:value-of select="precio"/></td>
           </tr>
           <xsl:for-each select="libros/libro">
           <xsl:sort select="Titulo" data-type="Text" order="ascending">
           <tr>
            <td><xsl:value-of select="Titulo"/></td>
            <td><xsl:value-of select="Autor"/></td>
            <td><xsl:value-of select="Precio"/></td>
           </tr>
           <xsl:for-each select="libros/libro">
          <xsl:sort select="Titulo" data-type="Text" order="ascending">
           <tr>
            <td><xsl:value-of select="Titulo"/></td>
            <td><xsl:value-of select="Autor"/></td>
            <td><xsl:value-of select="Precio"/></td>
           </tr>
          </xsl:sort>
           </xsl:for-each>
        </table>
    </body>
  </html>
  </xsl:template>
  </xsl:stylesheet>



