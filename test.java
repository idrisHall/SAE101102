import java.util.*;

public class test{

  public static void main(String[] args) {
    //Pyramide
    for (int i=0; i<4; i++) {

      // Ecartement par rapport a la marge
      for (int j = 0; j < 4-i;j++ ) {
        System.out.print(" ");
      }

      // Nombre de caractère de la ligne
      for (int k=0; k<=i ; k++) {
        System.out.print("* ");
      }
      System.out.println("");

    }

    // Corps du terrain
    for(int i=0; i<5; i++){
        System.out.print(" ");

        for(int j=0; j<7; j++){
            if(i%2==0){
                System.out.print(" ");
            }


            if(j%2==0){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println("");
    }

    //Pyramide inversé
    for (int i=4; i>0; i--) {

      // Ecartement par rapport a la marge
      for (int j=0; j<4-i; j++) {
        System.out.print(" ");
      }

      // Nombre de caractère de la ligne
      for (int k=0 ; k<i ; k++ ) {
        System.out.print(" *");
      }
      System.out.println("");
    }

  }

}



// IF  si la condition imparité de la ligne --> vrai
//   print (" ")
// ELSE
// for *
