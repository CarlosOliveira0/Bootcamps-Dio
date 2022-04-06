package dio.terceiroexercicio;

public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilateros.area(5d);
        System.out.println("A área do quadrado é: " + areaQuadrado);

        double areaTriangulo = Quadrilateros.area(7d,4d);
        System.out.println("A área do triangulo é: " + areaTriangulo);

        double areaTrapezio = Quadrilateros.area(9,5,8);
        System.out.println("A área do trapezio é: " + areaTrapezio);

        double areaLosango = Quadrilateros.area(8f, 6f);
        System.out.println("A área do losango é: " + areaLosango);
    }
}
