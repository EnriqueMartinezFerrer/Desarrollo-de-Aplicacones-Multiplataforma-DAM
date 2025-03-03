<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"
doctype-public="-//W3C//DTD XHTML 1.1//EN"
doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
<xsl:template match="/">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
<head><title>Notas de Matematicas</title></head>
			<body>
				<h1>Notas de matemáticas</h1>
				<ul>
					<xsl:for-each select="/matematicas/alumno">
						<xsl:sort select="nombre" data-type="text" order="ascending"/>
						<li>
							<xsl:value-of select="nombre"/>
							(Expediente: <xsl:value-of select="expediente"/>)<br/>
							Nota Final: <xsl:value-of select="notafinal"/><br/><br/>
						</li>
					</xsl:for-each>
				</ul>
			</body>
		</html>
</xsl:template>
</xsl:stylesheet>