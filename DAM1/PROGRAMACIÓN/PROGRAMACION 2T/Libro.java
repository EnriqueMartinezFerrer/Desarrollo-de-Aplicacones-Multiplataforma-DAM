
package clases;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Carlos Francés Sánchez
 */
public class Libro implements Cloneable,AutoCloseable,Comparable<Libro>
{
    //<editor-fold defaultstate="collapsed" desc="Atributos del objeto">
    private enum generos{
        fantasia,
        romantica,
        epica,
        drama,
        fabula,
        lirica,
        documental,
        cientifica        
    }
    private PropertyChangeSupport pcs= new PropertyChangeSupport(this);
    public void addPropertyChangeListener(String propiedad, PropertyChangeListener Listener){
       pcs.addPropertyChangeListener(propiedad, Listener);
    }
    public final static String PROP_NOMBRE="nombre";
    public final static String PROP_NUMERODEPAGINAS="numero de paginas";
    public final static String PROP_RECOMENDADO="recomendado";
    public final static String PROP_GENERO="genero";
    public final static String PROP_AUTOR="autor";
    private String nombre="";
    private int numeroDePaginas=0;
    private boolean recomendado=false;
    private generos genero=generos.fantasia;
    private String[] premios=new String[0];
    private Autor autor=new Autor();
    private boolean cerrado=false;
    //Atributos estáticos
    private static int creadosLibro;
    private static int vivosLibro;
    private static int totalPaginas;
    private static int totalRecomendados;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos get y set">

    public String getNombre() {
        return nombre;
    }

    public Libro setNombre(String nombre) {
        if(cerrado) 
         throw new NullPointerException("El objeto está cerrado");
        if(nombre.matches("^([A-ZÑÁÉÍÓÚÜ][a-zñáéíóúü]*)"))
            throw new IllegalArgumentException("El nombre debe empezar por mayúscula");
        String nombreAnterior=this.nombre;
        this.nombre = nombre;
        pcs.firePropertyChange(PROP_NOMBRE, nombreAnterior, this.nombre);
        return this;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public Libro setNumeroDePaginas(int numeroDePaginas) {
        if(cerrado) 
            throw new NullPointerException("El objeto está cerrado");
        if(numeroDePaginas<10||numeroDePaginas>3000)
            throw new IllegalArgumentException("Número de páginas no válido");
        int numeroDePaginasAnterior=this.numeroDePaginas;
        this.numeroDePaginas =numeroDePaginas;
        totalPaginas+=numeroDePaginas;       
        pcs.firePropertyChange(PROP_NUMERODEPAGINAS, numeroDePaginasAnterior, this.numeroDePaginas);
        return this;
    }

    public boolean isRecomendado() {
        return recomendado;
    }

    public Libro setRecomendado(boolean recomendado) {
        if(cerrado) 
         throw new NullPointerException("El objeto está cerrado");
        boolean recomendadoAnterior=this.recomendado;
        this.recomendado=recomendado;
        if(recomendado)totalRecomendados++;
        pcs.firePropertyChange(PROP_RECOMENDADO, recomendadoAnterior, this.recomendado);
        return this;
    }

    public generos getGenero() {
        return genero;
    }

    public Libro setGenero(generos genero) {
        if(cerrado) 
         throw new NullPointerException("El objeto está cerrado");
        generos generoAnterior=this.genero;
        this.genero = genero;
        pcs.firePropertyChange(PROP_GENERO, generoAnterior, this.genero);
        return this;
    }

    public boolean isCerrado() {
        return cerrado;
    }
    public Autor getAutor(){
        return autor;
    }
    public Libro setAutor(Autor a){
        if(cerrado) 
         throw new NullPointerException("El objeto está cerrado");
         if(a==null)
             throw new IllegalArgumentException("El valor no puede ser nulo");
        Autor autorAnterior=this.autor;
        this.autor = a;     
        pcs.firePropertyChange(PROP_AUTOR, autorAnterior, this.autor);
        return this;
    }
    public String[] getPremios(){
        return premios.clone();
    }
    public String getPremios(int i){
        return premios[i];
    }
    public Libro setPremios(String[] premios)
   {
      if(cerrado) 
         throw new NullPointerException("El objeto está cerrado");
      if(premios==null) 
      {
         this.premios = new String[0];
         return this;
       }
       
        this.premios= premios.clone();
        
        return this;
   }
    public Libro setPremios(int i, String premio)
   {
      if(cerrado) 
         throw new NullPointerException("El objeto está cerrado");
      String[] s = premios.clone();
      s[i]=premio;
      setPremios(s);
      return this;
   }
    public int getVivosLibro(){
        return vivosLibro;
    }
    public int getCreadosLibro(){
        return creadosLibro;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos premios">
    
    public Libro addPremio(String premio)
   {
      //notas
      String[]s = new String[premios.length+1];
      System.arraycopy(premios,0,premio,0,premios.length);
      s[premios.length]=premio;
      setPremios(s);
      return this;
   }
    public Libro removePremio(int i)
   {
      String[]s = new String[premios.length-1];
      System.arraycopy(premios,0,s,0,i);
      System.arraycopy(premios,i+1,s,i,s.length-i);
      setPremios(s); 
      return this;
   }
    public int lengthPremios(){
        return premios.length;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos contador (creados y vivos)">
   @Override
   protected void finalize()
   {
      close();
   }
   public void close()
   {  
      if(cerrado==true) return; 
      vivosLibro--;
      if(recomendado)totalRecomendados--;
      cerrado = true;
      totalPaginas-=numeroDePaginas;
   }
   public boolean estaCerrado(){
       return cerrado;
   }
   public boolean estaAbierto(){
       return !cerrado;
   }
   //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos de cálculo">
    public double mediaPaginas(){
       return totalPaginas/vivosLibro;
    }
    public double mediaRecomendados(){
       return totalRecomendados/vivosLibro;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos de cambios de estado">
    public Libro agregarPaginas(int cantidad){
        if(cantidad<1||cantidad>3000)
            throw new IllegalArgumentException("Cantidad de páginas a añadir no válida");
        totalPaginas+=cantidad;
        return this.setNumeroDePaginas(numeroDePaginas+cantidad);
    }
    public Libro quitarPaginas(int cantidad){
        if(cantidad<numeroDePaginas)
            throw new IllegalArgumentException("No se pueden quitar más páginas de las que tiene el libro");
        totalPaginas-=cantidad;
        return this.setNumeroDePaginas(numeroDePaginas-cantidad);
    }
    public Libro cambiarRecomendacion(){
        if(recomendado)totalRecomendados--;
        else totalRecomendados++;
        return this.setRecomendado(!recomendado);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos de consulta">
    public boolean esRecomendado(){
        return recomendado;
    }
    public boolean esPremiado(){
        return premios.length>=1;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos Override (Sobreescritos)">
    @Override
    public String toString()
    {
       if(cerrado) 
          throw new NullPointerException("El objeto está cerrado");
         
       return "Nombr del libro: "+nombre+
              "\nAutor: "+autor+
              "\nGénero: "+genero+
              "\nNúmero de Páginas: "+numeroDePaginas;             
    }
    @Override
    public Libro clone() 
    {
       if(cerrado) 
          throw new NullPointerException("El objeto está cerrado");
         
       Libro l = null;
       try
       {
           l = (Libro) super.clone();
           creadosLibro++;
           vivosLibro++;
           totalPaginas+=l.numeroDePaginas;
           if(l.recomendado)
            totalRecomendados++;
       }
       catch(CloneNotSupportedException ex)
       {
          ex.printStackTrace();
       }
       return l;
    }
    @Override
    public boolean equals(Object o)
    {
       if(!(o instanceof Libro)) return false;
       Libro l = (Libro) o;
       return nombre.equals(l.nombre) && autor == l.getAutor();
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos de comparación">
    static public int porPaginas(Libro a,Libro b){
        if(a==null && b==null) return 0;
        if(a==null)  return -1;
        if(b==null) return 1;
        if(a.numeroDePaginas>b.numeroDePaginas)return 1;
        if(a.numeroDePaginas==b.numeroDePaginas)return 0;
        return -1;
    }
    static public int porPremios(Libro a,Libro b){
        if(a==null && b==null) return 0;
        if(a==null)  return -1;
        if(b==null) return 1;
        if(a.premios.length>b.premios.length)return 1;
        if(a.premios.length==b.premios.length)return 0;
        return -1;
    }
    static public int porRecomendado(Libro a,Libro b){
        if(a==null && b==null) return 0;
        if(a==null)  return -1;
        if(b==null) return 1;
        if(a.recomendado&&!b.recomendado)return 1;
        if(a.recomendado&&b.recomendado)return 0;
        if(!a.recomendado&&!b.recomendado)return 0;
        return -1;
    }
    @Override
    public int compareTo(Libro l)
    {
       if(l==null) return 1;
       if(numeroDePaginas<l.numeroDePaginas) return -1;
       if(numeroDePaginas==l.numeroDePaginas) return 0;     
       return 1;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodos de construcción">
    public Libro(String nombre, int numeroDePaginas,boolean recomendado,generos genero,String[] premios,Autor autor){
        setNombre(nombre);
        setNumeroDePaginas(numeroDePaginas);
        setRecomendado(recomendado);
        genero=genero;
        setPremios(premios);
        setAutor(autor);
        creadosLibro++;
        vivosLibro++;
        totalPaginas+=numeroDePaginas;
        if(recomendado)totalRecomendados++;
    }
    //</editor-fold>
}
