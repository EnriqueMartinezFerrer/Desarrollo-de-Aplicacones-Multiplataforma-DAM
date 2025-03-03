<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"
	doctype-public="-//W3C//DTD XHTML 1.1//EN"
	doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
	<xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
			<head>
				<title>Red Social</title>
			</head>
			<body>
				<h1>Comentarios en Red Social</h1>
				<ul>
					<xsl:for-each select="/redsocial/comentario">
						<xsl:sort select="nombre" data-type="text" order="ascending"/>
						<li>
							<xsl:value-of select="autor"/>:
							<xsl:value-of select="mensaje"/>
							<br/>
							A <xsl:value-of select="megusta/@numero"/>
							personas les gusta esto.<br/><br/>
						</li>
					</xsl:for-each>
				</ul>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>