import java.util.Scanner;

public class Main {



    public static class Cube {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Geben Sie die Länge der Kante des Quaders ein: ");
            double edge = scanner.nextDouble();
            double surfaceArea = 6 * edge * edge;
            double volume = edge * edge * edge;
            double perimeter = 4 * edge;
            System.out.println("Die Oberfläche des Quaders beträgt: " + surfaceArea);
            System.out.println("Das Volumen des Quaders beträgt: " + volume);
            System.out.println("Die Summe der Kantenlängen des Quaders beträgt: " + perimeter);
        }
    }

}