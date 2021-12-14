
package boletín.pkg9;

import javax.swing.JOptionPane;

public class Numeros {
    
    //primero inicializamos el numero que vamos a introducir y los contadores
   
   int posi=0, neg=0, cer=0;
   
   
    public void amosarFor(){
        int numero;
        //int posi=0, neg=0, cer=0;
        //numero=lerNum();
        //int posi=0, neg=0, cer=0;
        //utilizamos un condicional for
        for(int contador=0;contador<10;contador++){
            //leemos el numero
           
           
            numero=lerNum();
            // y realizamos el bloque de sentencias
            if(numero<0){
            
              neg++;
              
              //JOptionPane.showInputDialog(null, " hay "+ neg + " números negativos");
            }
            
            else if(numero>0){
                
                posi++;
                
                //JOptionPane.showInputDialog(null, "hay " + posi + " números positivos");
                
            //numero = lerNum();
                
            }
            else if (numero==0){
                
            cer++;
            
            //JOptionPane.showInputDialog(null, " hay " + cer + " ceros ");
            //numero = lerNum();
            
        }
            
        }
        JOptionPane.showMessageDialog(null, " hay " + neg + " números negativos" + "," +  posi+ " números positivos " +  " y "+  cer +" ceros ");
        
        
    }
    
    
    public int lerNum(){
     int numero=Integer.parseInt(JOptionPane.showInputDialog(" introduce un número "));
     return numero;
    }
    
}
