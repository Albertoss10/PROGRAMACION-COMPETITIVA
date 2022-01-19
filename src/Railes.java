//@albertoss1, @daxen00 y @Happy_by_7

import java.util.*;

public class Railes {

    static Scanner scan = new Scanner(System.in);
    public static void main (String[] arg){
        int numVagones, primerVagon;
        boolean resultado;

        while(true){
            numVagones = scan.nextInt();
            if(numVagones == 0){
                break;
            }
            int [] vagones = new int [numVagones];
            while(true){
                primerVagon = scan.nextInt();
                if(primerVagon == 0){
                    break;
                }
                vagones[0] = primerVagon;
                for(int x = 1; x < numVagones; x++){
                    vagones[x] = scan.nextInt();
                }
                resultado = comprobarVagones(vagones, numVagones);
                if (resultado){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
            System.out.println();

        }



    }
    public static boolean comprobarVagones(int [] vagones, int N){
        int numMeter = 1, numVagon = 0;
        Stack<Integer> pila = new Stack<>();

        while(numVagon < N){
            if(!pila.isEmpty() && pila.peek() == vagones[numVagon]){
                pila.pop();
                numVagon++;
            }
            else{
                if(numMeter > N){
                    return false;
                }
                else{
                    pila.push(numMeter);
                    numMeter++;
                }
            }
        }
        return  true;
    }
}
