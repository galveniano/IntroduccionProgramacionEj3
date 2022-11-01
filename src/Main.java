package src;

public class Main {
    public static void main(String[] args) {
        // Primera parte
        int resultado = SumarValores(1,2,3);
        System.out.println("Suma de valores: " + resultado);

        // Segunda parte

        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();

        System.out.println("Numero de puertas: " + miCoche.numeroPuertas);

    }

    public static int SumarValores (int valor1, int valor2, int valor3) {
    return valor1+valor2+valor3;

    }

    public static class Coche {

        int numeroPuertas;

        public void incrementarPuerta(){
            numeroPuertas++;

        }


    }

}

