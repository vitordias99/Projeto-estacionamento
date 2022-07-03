import java.util.Scanner;

public class Client {

   public void name() {
        Scanner scanner = new Scanner(System.in);
        //PrintStream save = new PrintStream(System.out);
        System.out.println("Cliente: ");
        String client = scanner.next();
        System.out.println(client);
    }

    public void car() {
        Scanner scanner = new Scanner(System.in);
        //PrintStream save = new PrintStream(System.out);
        System.out.println("Modelo do carro: ");
        String car = scanner.next();
        System.out.println(car);
    }

    public void licensePlate() {
        Scanner scanner = new Scanner(System.in);
        //PrintStream save = new PrintStream(System.out);
        System.out.println("Placa do carro: ");
        String licensePlate = scanner.next().toUpperCase();
        System.out.println(licensePlate);
    }

    public int time() {
        Scanner scanner = new Scanner(System.in);
        //PrintStream save = new PrintStream(System.out);
        System.out.println("Tempo de estadia: ");
        int time = scanner.nextInt();
        System.out.println(time);
        return time;
    }

    public int value() {
        int number = time();
        System.out.println("Valor a ser cobrado: " + number * 10);
        return number;
    }



}



