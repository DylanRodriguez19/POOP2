package pryarbol;
import java.util.Scanner;

public class PryArbol{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ponga el limite de hojas del arbol: ");
        int limite = scanner.nextInt();

 
        int AnchoTronco= (limite  *2 ) / 3;
        int AltoTronco = limite/2 ; 
        int AltoBase = limite / 3; 


        for (int i = 1; i <= limite; i++) {
                    for (int j = 1; j <= limite + i - 1; j++) {
                        
                if (j <= limite - i) {
                    System.out.print(" "); 
                } else {
                    System.out.print("*"); 
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= AltoTronco; i++) {
            for (int j = 1; j <= (limite * 2  - 1); j++) {
                
                if (j <= ((limite * 2 ) - AnchoTronco) / 2 || 
                        j > ((limite * 2) + AnchoTronco) / 2) {
                    System.out.print(" "); 
                } else {
                    System.out.print("*"); 
                }
            }
            System.out.println();
        }

        
        for (int i = 1; i <= AltoBase; i++) {
            for (int j = 1; j <= (limite * 2  - 1); j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
