//@albertoss1

import java.util.Scanner;

public class Surfaces {
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        int numerofilas;
        String fila;

        do{
            numerofilas = scan.nextInt();
            scan.nextLine();
            int [] cantidad = new int [numerofilas];
            int mayor = 0, numerodehuecos = 0;
            for(int x = 0; x < numerofilas; x++){
                fila = scan.nextLine();
                int contadorx = 0;
                for(int j = 0; j < 25; j++){
                    if(fila.charAt(j) == 'X'){
                        contadorx++;
                    }
                }
                cantidad[x] = contadorx;
                if(cantidad[x] > mayor){
                    mayor = cantidad[x];
                }
            }
            for(int k = 0; k < cantidad.length; k++){
                numerodehuecos += mayor - cantidad[k];
            }
            if (numerofilas != 0) {
                System.out.println(numerodehuecos);
            }
        }while(numerofilas != 0);
    }
}
