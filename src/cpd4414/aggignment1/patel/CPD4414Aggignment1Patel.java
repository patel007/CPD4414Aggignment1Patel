/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.aggignment1.patel;

/**
 *
 * @author c0664341
 */
public class CPD4414Aggignment1Patel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    }
      public static String stringPower(String str, int x)
        {
           if (str==""){
               return "";
           }
           else if(x==1)
           {
               return str;
           }
           else if(x==2)
           {
               for(int i = 0; i< x-1; i++){
                   str+=str;
               }
               
               System.out.println(str);
               return str;
           }
           else return str;
        }
    
}
