import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        client();
        car();
        licensePlate();
        time();
        value();
    }

    static void client() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cliente: ");
        String client = scanner.next();
    }

    static void car() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modelo do carro: ");
        String car = scanner.next();
    }

    static void licensePlate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Placa do carro: ");
        String licensePlate = scanner.next().toUpperCase();
    }

    static int time() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tempo de estadia: ");
        int time = scanner.nextInt();
        return time;
    }

    static void value(){
        int number = time();
        System.out.println("Valor a ser cobrado: " + number * 10);
    }

}
