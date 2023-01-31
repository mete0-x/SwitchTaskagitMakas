
import java.util.Scanner;
public class lol {
public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     
    //  int computer = (int)(Math.random()*3);
  System.out.println("oyuncu 1 == makas (0), taş (1), kağıt (2) :");
       int computer = scanner.nextInt();


       System.out.println("oyuncu 2 == makas (0), taş (1), kağıt (2) :");
       int user = scanner.nextInt();

        System.out.println("The computer is");
        switch (computer) {
        case 0:
            System.out.println("makas .");
            break;
          case 1:
              System.out.println("taş .");
            break;
         case 2:
             System.out.println("kağıt .");
            break;
       
    }
          System.out.println(" you are");
        switch (user) {
        case 0:
            System.out.println("makas .");
            break;
          case 1:
              System.out.println("taş .");
            break;
         case 2:
             System.out.println("kağıt .");
            break;
    }
    if(computer == user){
        System.out.println("beraberlik");
     }
     else{
      boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
              if(win){
                  System.out.println("you win");
               }
                else{
                  System.out.println("you lose");
                 }
     }
   }
    
}
