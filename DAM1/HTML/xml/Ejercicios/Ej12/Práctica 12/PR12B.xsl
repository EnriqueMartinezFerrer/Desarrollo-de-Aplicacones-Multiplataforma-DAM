<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" indent="yes"
	doctype-public="-//W3C//DTD XHTML 1.1//ES"
	doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
	<xsl:template match="/">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
			<head><title>PR12B</title></head>
			<body>
				<h1 align="center">Agenda Personal</h1>
				<table cellspacing="2"  border="1" text-align="center" width="100%">
					<xsl:for-each select="personas/persona">
						<td align="center"><xsl:value-of select="apellidos"/>,
							<xsl:value-of select="nombre"/></td>
        <td align="center"><xsl:value-of select="@relacion"/></td>
        <td align="center"><xsl:value-of select="nacimiento/@dia"/> de 
          <xsl:value-of select="nacimiento/@mes"/> de 
          <xsl:value-of select="nacimiento/@anio"/></td><td>
        <ul>
          <xsl:for-each select="direcciones/direccion">
            <li><xsl:value-of select="@tipo"/>)
              <xsl:value-of select="calle"/>.
              <xsl:value-of select="cpostal"/>.
              <xsl:value-of select="poblacion"/>.
              <xsl:value-of select="provincia"/>.</li>
          </xsl:for-each>
</ul>
</td>
<tr/>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>