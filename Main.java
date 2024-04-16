
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ------------------  Selecciona la figura a calcular: ------------------ ");
        System.out.println("1. Círculo.");
        System.out.println("2. Triángulo.");
        System.out.println("3. Cuadrado.");

        int option = scanner.nextInt();

        Shape shape = null;
        switch (option) {
            case 1:
                System.out.print(" * Introduce el radio del círculo:  ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print(" * Introduce el lado 1 del triángulo:  ");
                double side1 = scanner.nextDouble();
                System.out.print(" * Introduce el lado 2 del triángulo:  ");
                double side2 = scanner.nextDouble();
                System.out.print(" * Introduce el lado 3 del triángulo:  ");
                double side3 = scanner.nextDouble();
                shape = new Triangle(side1, side2, side3);
                break;
            case 3:
                System.out.print(" * Introduce el lado del cuadrado:  ");
                double squareSide = scanner.nextDouble();
                shape = new Square(squareSide);
                break;
            default:
                System.out.println("------------------ Opción no válida.------------------ ");
                return;
        }

        System.out.println("------------------ Selecciona la propiedad a calcular:------------------ ");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        int property = scanner.nextInt();

        double result = 0;
        switch (property) {
            case 1:
                result = shape.getArea();
                System.out.println(" * El área es: " + result);
                System.out.println(" ------------------ Fin del programa ------------------");
                break;
            case 2:
                result = shape.getPerimeter();
                System.out.println(" * El perímetro es: " + result);
                System.out.println(" ------------------ Fin del programa ------------------ ");
                break;
            default:
                System.out.println("------------------ Opción no válida.------------------ ");
        }

        scanner.close();

        }
    }
