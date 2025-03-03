package siglas;
public class Asociacion {
  	/* atributos */
	final public String NOMBRE;
	private int socios = 0;
	private float cuota = 0;
	private String presidente = "";
	private static int creados = 0;
	
	/* constructores */
	static
	{
		creados = 0;
	}
	
	public Asociacion(String nombre, String presidente, int socios, float cuota)
	{
		NOMBRE = setNombre(nombre);
		setPresidente(presidente);
		setSocios(socios);
		setCuota(cuota);
		
		creados++;
	}
		
	public Asociacion(String nombre, String presidente)
	{
		this(nombre,presidente,0,100F);
	}
	
	/* metodos get */
	public int getSocios()
	{
		return socios;
	}
	
	public float getCuota()
	{
		return cuota;
	}
	
	public String getPresidente()
	{
		return presidente;
	}
	
	public static int getCreados()
	{
		return creados;
	}
	
	/* metodos set */
	public Asociacion setSocios(int socios)
	{
		if(socios<0) throw new RuntimeException("En numero de socios no puede ser negativo");
		this.socios = socios;
		return this;
	}
	
	public Asociacion setCuota(float cuota)
	{
		if(cuota<=0) throw new RuntimeException("La cuota debe ser positiva");
		this.cuota = cuota;
		return this;
	}
	
	public Asociacion setPresidente(String presidente)
	{
		if(presidente.equals("")) throw new RuntimeException("No puede ser vacio el nombre del presidente");
		this.presidente = presidente;
		return this;
	}
	
	private String setNombre(String nombre)
	{
		if(nombre.equals("")) throw new RuntimeException("No puede ser vacio el nombre de la asociación");
		return nombre;
	}
		
	/* metodos de cambio de estado */
	public Asociacion incrementar(int socios)
	{
		return setSocios(getSocios()+socios);
	}
	
	public Asociacion incrementar(float cuota)
	{
		return setCuota(getCuota()+cuota);
	}
 }

