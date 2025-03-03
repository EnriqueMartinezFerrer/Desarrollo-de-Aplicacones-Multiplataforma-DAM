import fsg.in;

class EJ9 
   {
   public static void main(String[] args)
      {
      double A = in.leerDouble("Numero [-100/100]: ");
      double B = in.leerDouble("Numero [-100/100]: ");
      double C = in.leerDouble("Numero [-100/100]: ");
      double D = '\0';
     
      if((A >= -100 && A <= 100) && (B >= -100 && B <= 100) && (C >= -100 && C <= 100)){
         if(A != 0){
            D += 1/A;
         }
         if(n2 != 0){
            D += 1/B;
            }
         if(n3 != 0){
            D += 1/C;
         }         
         
         double rRedondeado = (int) (D * 100000 + 0.5) / 100000.0;
         
         System.out.println(rRedondeado);
      } else {
         System.out.println("Algún numero no esta entre -100 y 100");
      }      
   }
}