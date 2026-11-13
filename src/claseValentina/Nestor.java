package claseValentina;

import java.util.ArrayList;
import java.util.List;

public class Nestor {

	public static void main(String[] args) {
        List<Integer> primos = primerosPrimos(1000);
        
        System.out.println("Cantidad: " + primos.size());
        System.out.println("Primero: " + primos.get(0));
        System.out.println("Último: " + primos.get(primos.size() - 1));
        System.out.println(primos);
        
        List<Integer> diferencias =  diferenciasConsecutivas(primos);
        
        diferencias.forEach(item ->System.out.println(item));
	}
	
	public static List<Integer> primerosPrimos(int n) {
        List<Integer> primos = new ArrayList<>(n);
        int candidato = 2;

        while (primos.size() < n) {
            if (esPrimo(candidato, primos)) {
                primos.add(candidato);
            }
            candidato++;
        }

        return primos;
    }

    private static boolean esPrimo(int x, List<Integer> primosConocidos) {
        for (int p : primosConocidos) {
            if ((long) p * p > x) {
                break;
            }
            if (x % p == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static List<Integer> diferenciasConsecutivas(List<Integer> primos) {
        if (primos == null) {
            throw new IllegalArgumentException("La lista no puede ser null");
        }

        List<Integer> salida = new ArrayList<>();

        for (int i = 0; i < primos.size() - 1; i++) {
            int actual = primos.get(i);
            int siguiente = primos.get(i + 1);

            // (i+1) - i, es decir: siguiente primo - primo actual
            salida.add(siguiente - actual);
        }

        return salida;
    }
    
    
}
