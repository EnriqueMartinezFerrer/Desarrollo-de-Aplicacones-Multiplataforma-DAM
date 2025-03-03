<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"
	doctype-public="-//W3C//DTD XHTML 1.1//EN"
	doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
	<xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
			<head><title>LISTADO DE ALUMNOS</title></head>
			<body>
				<h1>RESPUESTAS PR12A</h1>
				<ul><li><xsl:value-of select="sum(alumnos/alumno/edad)"/></li>
					<li><xsl:value-of select="sum(alumnos/alumno/edad)"/></li>
					<li><xsl:value-of select="count(//apellidos)"/></li>
					<li><xsl:value-of select="count(alumnos/alumno)"/></li></ul>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>