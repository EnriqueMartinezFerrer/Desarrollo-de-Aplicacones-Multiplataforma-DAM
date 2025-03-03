package clases;
import clases.enumerados.Profesion;
public class Persona
{
   /* TIPOS */
   public enum EstadoCivil
   {
      soltero,
      casado,
      separado,
      divorciado,
      viudo
   }
   
   /* CONSTANTES */
   final public String NOMBRE;
   final public int EDAD_INICIAL;
   
   /* ATRIBUTOS */
   private int edad = 0;
   private double altura = 0.5;
   private double peso = 2.5;
   private EstadoCivil estadoCivil = EstadoCivil.soltero;
   private Profesion profesion;
   
   /* METODOS GET */
   public int getEdad()
   {
      return edad;
   }
   
   public double getAltura()
   {
      return altura;
   }
   
   public double getPeso()
   {
      return peso;
   }
   
   public EstadoCivil getEstadoCivil()
   {
      return estadoCivil;
   }
   
   public Profesion getProfesion()
   {
      return profesion;
   }
   
   /* METODOS SET */
   public Persona setEdad(int edad)
   {
        if(0>edad || edad>120)
            throw new IllegalArgumentException("La edad tiene que estar entre 0 y 120");
            
         this.edad = edad;
         return this;
   }
   
   public Persona setAltura(double altura)
   {
        if(altura<0.3 || altura>2.2 || (int)(altura*100)/100.0!=altura)
            throw new IllegalArgumentException("La altura tiene que estar entre 0.3 y 2,2 y tener como maximo dos decimales");
            
         this.altura = altura;
         return this;
   }
   
   public Persona setPeso(double peso)
   {
        if(peso<1.7 || peso>140)
            throw new IllegalArgumentException("El peso tiene que estar entre 1.7 y 140");
        if((int)(peso*10)/10.0 != peso)
            throw new IllegalArgumentException("El peso tiene que tener como maximo un decimal");        
            
         this.peso = peso;
         return this;
   }
   
   public Persona setEstadoCivil(EstadoCivil estadoCivil)
   {
      if(estadoCivil==null)
         throw new IllegalArgumentException("El estado civil no puede ser nulo");
      this.estadoCivil = estadoCivil;
      return this;
   }
   
   public Persona setProfesion(Profesion profesion)
   {
      this.profesion = profesion;
      return this;
   }

   
   /* METODOS SET DE CONSTANTES */
   private String setNOMBRE(String nombre)
   {
      if(!nombre.matches("[A-ZÑÁÉÍÓÚ¨]+"))
         throw new IllegalArgumentException("El nombre no es correcto");
       
       return nombre;
   }

   /* CONSTRUCTORES */
   public Persona(String nombre, int edad, double altura, double peso)
   {
	   NOMBRE = setNOMBRE(nombre);
   	setEdad(edad);
   	setAltura(altura);
   	setPeso(peso);
   
   	EDAD_INICIAL = edad;
   }
   
   public Persona()
   {
      //this("DESCONOCIDO");
      NOMBRE = "DESCONOCIDO";
      EDAD_INICIAL = 0;
   }
   
   public Persona(String nombre)
   {
   	NOMBRE = setNOMBRE(nombre);
   
   	EDAD_INICIAL = 0;
   }
   
   public Persona(String nombre, int edad)
   {
   	NOMBRE = setNOMBRE(nombre);
   	setEdad(edad);
   	
   	EDAD_INICIAL = edad;
   }
   
   public Persona(String nombre, double altura)
   {
   	NOMBRE = setNOMBRE(nombre);
   	setAltura(altura);
   
   	EDAD_INICIAL = edad;
   }
   
   public Persona(String nombre, int edad, double peso)
   {
      this(nombre,edad,0.5,peso);
   }
   
   public Persona(String nombre, double peso, int edad)
   {
      this(nombre,edad,peso);
   }
   
   public Persona(int edad, String nombre, double peso)
   {
      this(nombre,edad,peso);
   }
   
   public Persona(double peso, String nombre, int edad)
   {
      this(nombre,edad,peso);
   }
   
   public Persona(int edad, double peso, String nombre)
   {
      this(nombre,edad,peso);
   }
   
   public Persona(double peso, int edad, String nombre)
   {
      this(nombre,edad,peso);
   }

   /* METODOS DE CALCULO */
   public double imc()
   {
      return peso/(altura*altura);
   }
   
   /* METODOS DE CONSULTA */
   public boolean serInfantil()
   {
      return edad>=0 && edad<=6;
   }
   
   public boolean serNiño()
   {
      return edad>=7 && edad<=11;
   }
   
   public boolean serAdolescente()
   {
      return edad>=12 && edad<=18;
   }
   
   public boolean serJoven()
   {
      return edad>=19 && edad<=25;
   }
   
   public boolean serAdulto()
   {
      return edad>=26 && edad<=64;
   }
   
   public boolean serAnciano()
   {
      return edad>=65;
   }
   
   /* METODOS CAMBIO DE ESTADO */
   public Persona cumplir()
   {
      return setEdad(edad+1);
   }
   
   public Persona engordar(double cantidad)
   {
      if(cantidad<0)
         throw new IllegalArgumentException("La cantidad no puede ser negativa");
         
      return setPeso(peso+cantidad);
   }
   
   public Persona engordar()
   {
      return engordar(1.0);
   }
   
   public Persona adelgazar()
   {
      return adelgazar(1.0);
   }
   
   public Persona adelgazar(double cantidad)
   {
      if(cantidad<0)
         throw new IllegalArgumentException("La cantidad no puede ser negativa");
         
      setPeso(peso-cantidad);
      return this;
   }
   
   /* METODOS DE CONVERSION A CADENA */
   @Override
   public String toString()
   {
      String prof = "";
      if(profesion==null)
         prof="Ninguna";
      else 
         prof=profesion.name();
         
      return super.toString()+
             "\nNOMBRE: "+NOMBRE+
             "\nEDAD INICIAL: "+EDAD_INICIAL+
             "\nEDAD: "+edad+
             "\nALTURA: "+altura+
             "\nPESO: "+peso+
             "\nESTADO CIVIL: "+estadoCivil.name()+
             "\nPROFESION: " + prof;
   }







}