<?xml version="1.0" ?>
<!-- Ejemplo: PR11-002.xsl -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"
         doctype-public="-//W3C//DTD XHTML 1.1//EN"
         doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
   <xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es"> 
			<head><h1>LISTADO DE ALUMNOS</h1></head>
			<body>
				<h1>Listado De Los 10 Primeros Alumnos</h1>
        <ul><xsl:for-each select="alumnos/alumno[position() &lt; 11]"><ul>
              <li><xsl:value-of select="position()"/>.-<xsl:value-of select="apellidos"/>,<xsl:value-of select="nombre"/>
              (<xsl:value-of select="localidad"/>)</li>
        </ul>
          </xsl:for-each>
        </ul>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>