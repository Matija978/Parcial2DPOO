package presentacion;

import logica.Parcial;

public class Presentacion {

    public static void main(String[] args) {
        Parcial p = new Parcial();

        // Caso 1: Ecuación con raíces distintas
        try {
            long t1 = System.currentTimeMillis();
            double[] resultado1 = p.resolverEcuacion(1, -3, 2);
            long t2 = System.currentTimeMillis();
            System.out.println("Caso 1 - Raíz 1: " + resultado1[0]);
            System.out.println("Caso 1 - Raíz 2: " + resultado1[1]);
            System.out.println("Tiempo de ejecución Caso 1: " + (t2 - t1));
        } catch (Exception e) {
            System.out.println("Error en Caso 1: " + e.getMessage());
        }

        // Caso 2: Ecuación con raíces iguales
        try {
            long t1 = System.currentTimeMillis();
            double[] resultado2 = p.resolverEcuacion(1, -2, 1);
            long t2 = System.currentTimeMillis();
            System.out.println("Caso 2 - Raíz 1: " + resultado2[0]);
            System.out.println("Caso 2 - Raíz 2: " + resultado2[1]);
            System.out.println("Tiempo de ejecución Caso 2: " + (t2 - t1));
        } catch (Exception e) {
            System.out.println("Error en Caso 2: " + e.getMessage());
        }

        // Caso 3: Ecuación con a = 0
        try {
            long t1 = System.currentTimeMillis();
            double[] resultado3 = p.resolverEcuacion(0, -3, 2);
            long t2 = System.currentTimeMillis();
            System.out.println("Caso 3 - Raíz 1: " + resultado3[0]);
            System.out.println("Caso 3 - Raíz 2: " + resultado3[1]);
            System.out.println("Tiempo de ejecución Caso 3: " + (t2 - t1));
        } catch (Exception e) {
            System.out.println("Error en Caso 3: " + e.getMessage());
        }

        // Caso 4: Ecuación con discriminante negativo
        try {
            long t1 = System.currentTimeMillis();
            double[] resultado4 = p.resolverEcuacion(1, 2, 5);
            long t2 = System.currentTimeMillis();
            System.out.println("Caso 4 - Raíz 1: " + resultado4[0]);
            System.out.println("Caso 4 - Raíz 2: " + resultado4[1]);
            System.out.println("Tiempo de ejecución Caso 4: " + (t2 - t1));
        } catch (Exception e) {
            System.out.println("Error en Caso 4: " + e.getMessage());
        }
    }
}


