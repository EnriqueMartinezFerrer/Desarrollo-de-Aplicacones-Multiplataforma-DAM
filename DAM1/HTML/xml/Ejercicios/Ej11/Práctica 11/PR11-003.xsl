<?xml version="1.0" ?>
<!-- Ejemplo: pr11-003.xsl -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"
	doctype-public="-//W3C//DTD XHTML 1.1//EN"
	doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
	<xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
			<head>
				<title>Productos</title> 
			</head>
			<body> 
				<h1>Productos</h1>
				<ul>
					<xsl:for-each select="/almacen/producto">
					<li>
						<xsl:value-of select="descripcion"/><br/>
						<xsl:value-of select="seccion"/><br/>
						Pasillo: <xsl:value-of select="pasillo"/><br/><br/>
						</li>
					</xsl:for-each>
				</ul>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>