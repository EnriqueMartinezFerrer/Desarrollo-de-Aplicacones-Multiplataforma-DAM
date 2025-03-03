<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes" 
		doctype-public="-//W3C//DTD XHTML 1.1//EN" 
		doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
	<xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
			<head>
				<title>Ejercicio 2</title>
			</head>
			<body>
				<h1>Libros</h1>
				<ul>
					<xsl:for-each select="/catalogo/libro">
						<li><xsl:value-of select="titulo"/></li>
						<ul>
							<xsl:for-each select="autores/autor">
								<li><xsl:value-of select="text()"/></li>
							</xsl:for-each>
						</ul>
					</xsl:for-each>
				</ul>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>