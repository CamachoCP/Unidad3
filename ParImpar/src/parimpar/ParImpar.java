
package parimpar;

import java.util.Scanner;


public class ParImpar {

   
    public static void main(String[] args) {
     Scanner ent=new Scanner(System.in);
     
     int N, OP, R;
        System.out.println("Introduce el numero");
       N=ent.nextInt();
       
    if(N % 2 == 0 ){    
    System.out.println("Es Par");
        }
    else{
    
        System.out.println("Es Impar");
    }
    ent.close();
    
    
    }}