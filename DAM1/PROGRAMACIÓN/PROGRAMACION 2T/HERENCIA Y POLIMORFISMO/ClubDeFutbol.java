package siglas.deportes;
public class ClubDeFutbol {
	
	/* atributos */
	private String entrenador = "";
	private int ultras = 0;
   private static int creadosClubs = 0;
	
	/* constructores */
	static
	{
		creadosClubs = 0;
	}
   
   public static int getCreadosClubs()
	{
		return creadosClubs;
	}
	
	/* metodos get */
	public String getEntrenador()
	{
		return entrenador;
	}
	
	public int getUltras()
	{
		return ultras;
	}
	
	/* metodos set */
	public ClubDeFutbol setEntrenador(String entrenador)
	{
		this.entrenador = entrenador;
		return this;
	}
	
	public ClubDeFutbol setUltras(int ultras)
	{
		this.ultras = ultras;
		return this;
	}
}

