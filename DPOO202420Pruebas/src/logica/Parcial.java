package logica;

public class Parcial {
    public double[] resolverEcuacion(double a, double b, double c) throws Exception {
        if (a == 0) {
            throw new Exception("El coeficiente 'a' no puede ser cero en una ecuación cuadrática");
        }
        double discriminante = (b * b) - 4 * a * c;
        
        if (discriminante < 0) {
            throw new Exception("El discriminante es negativo. Las raíces serían complejas");
        }

        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        return new double[]{raiz1, raiz2};
    }
}
