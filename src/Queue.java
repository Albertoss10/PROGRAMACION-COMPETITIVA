//@albertoss1

import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] arg) {

        LinkedList<Integer> cola = new LinkedList<>(); //Creo la cola
        HashMap<Integer, Integer> m = new HashMap<>();

        String EncolarDesencolar;
        int n_grupos, n_elementos, elemento, n_escenario = 1, numero, j;
        int contadorequipo0 = 0;
        boolean non_stop, repetir = true;

        Scanner scan = new Scanner(System.in);
        while(repetir){
            n_grupos = scan.nextInt();
            if (n_grupos == 0) {
                repetir = false;
                return;
            }
            j = 0;
            for (int i = 0; i < n_grupos; i++) {
                n_elementos = scan.nextInt();
                for (int x = 0; x < n_elementos; x++) {
                    elemento = scan.nextInt();
                    m.put(elemento, j);
                }
                j++;
            }
            System.out.println("Scenario #" + n_escenario);
            n_escenario++;

            non_stop = true;
            while (non_stop) {
                EncolarDesencolar = scan.next();
                switch (EncolarDesencolar) {
                    case "ENQUEUE": {
                        int aux = scan.nextInt();
                        int team = m.get(aux);
                        if (m.containsKey(aux) && team == 0) {
                            cola.add(contadorequipo0,aux);
                            contadorequipo0++;
                        }
                        else if (m.containsKey(aux) && team == 1) {
                            cola.add(aux);
                        }
                        break;
                    }
                    case "DEQUEUE": {
                        if(!cola.isEmpty()) {
                            numero = cola.element();
                            cola.remove();
                            contadorequipo0--;
                            System.out.println(numero);
                        }
                        break;
                    }
                    default: {
                        non_stop = false;
                        cola.clear();
                        m.clear();
                        contadorequipo0 = 0;
                    }
                }
            }
        }
    }
}