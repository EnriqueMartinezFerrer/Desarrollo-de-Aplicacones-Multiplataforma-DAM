package poo;

public class Mascota implements Cloneable, Comparable<Mascota> {
   @Override
   public int compareTo(Mascota o){
      if(nombre == o.getNombre()) return 1;
      else return -1;
   }
   
   @Override
   public String toString(){
      return "NOMBRE: "+ nombre +"\nANIMAL: "+ animal;
   }

   @Override
   public Mascota clone(){
      try {
         return (Mascota) super.clone();
      } catch(CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return null;
   }
   
   @Override 
   public boolean equals(Object o){
      if(!(o instanceof Mascota)) return super.equals(o);
      Mascota v = (Mascota) o;
      return nombre == v.nombre;
   }
      
   //ENUMERADO
   public enum Animal {
      perro,
      gato,
      tortuga,
      hamster,
      pajaro,
      pez
   }
   
   //ATRIBUTOS
   private String nombre = "";
   private Animal animal = Animal.perro;
   
   //METODOS GET
   public String getNombre(){return nombre;}
   public Animal getAnimal(){return animal;}
   
   //METODOS SET
   public Mascota setNombre(String nombre){
      if(nombre == "" || !nombre.toLowerCase().matches("[a-zñáéíóú]+")) throw new IllegalArgumentException("Cadena vacía o no es del tipo cadena");
      
      this.nombre = nombre;
      return this;
   }
   
   public Mascota setAnimal(Animal animal){
      this.animal = animal;
      return this;
   }
   
   //METODOS CONSTRUCTORES
   public Mascota(String nombre, Animal animal) {
      setNombre(nombre);
      setAnimal(animal);
   }
   
   public Mascota(String nombre){this(nombre, Animal.perro);}
   public Mascota(Animal animal){this("", animal);}   
}