/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Carlos Francés Sánchez
 */
public class Autor implements Cloneable
{
    private String nombre="";
    private String apellidos="";
    private String nacionalidad="";
    private int edad=40;
    private int librosEscritos=1;
    
    //<editor-fold defaultstate="collapsed" desc="metodos get y set">
    public String getNombre() {
        return nombre;
    }

    public Autor setNombre(String nombre) {
        if(nombre.length()>14)
            throw new IllegalArgumentException("El nombre debe tener menos de 15 letras");
        this.nombre = nombre;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Autor setApellidos(String apellidos) {
        if(apellidos.length()>29)
            throw new IllegalArgumentException("Los apellidos deben tener menos de 30 letras");
        this.apellidos = apellidos;
        return this;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Autor setNacionalidad(String nacionalidad) {
        if(nacionalidad.length()>20)
            throw new IllegalArgumentException("La nacionalidad debe tener menos de 20 letras");           
        this.nacionalidad = nacionalidad;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Autor setEdad(int edad) {
        if(edad>100||edad<15)
            throw new IllegalArgumentException("Edad incorrecta");
        this.edad = edad;
        return this;
    }

    public int getLibrosEscritos() {
        return librosEscritos;
    }

    public Autor setLibrosEscritos(int librosEscritos) {
        if(librosEscritos<0)
            throw new IllegalArgumentException("El autor debe haber escrito al menos un libro");
        this.librosEscritos = librosEscritos;
        return this;
    }
    //</editor-fold>
    
    //Costructor
    
    public Autor(String nom,String ape,String nac,int ed,int cant){
        setNombre(nom);
        setApellidos(ape);
        setNacionalidad(nac);
        setEdad(ed);
        setLibrosEscritos(cant);
    }
    
    //Clone
    @Override
   public Autor clone() 
   {
      Autor a = null;
      try
      {
          a = (Autor) super.clone();
      }
      catch(CloneNotSupportedException ex)
      {
         ex.printStackTrace();
      }
      return a;
   }

    public Autor() {
    }
   
}
