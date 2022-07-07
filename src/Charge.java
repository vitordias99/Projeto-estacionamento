import java.util.Scanner;

public class Charge {
    private double a = horaEntrada();
    private double b = horaSaida();

    public double horaEntrada() {
        if (a > 24) {
            System.out.println("Horário não permitido");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora de entrada: ");
        a = Double.parseDouble(scanner.nextLine());
        return a;
    }

    public double horaSaida() {
        if (b > 24) {
            System.out.println("Horário não permitido");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora de saída: ");
        b = Double.parseDouble(scanner.nextLine());
        return b;
    }

    public void value() {
        double y = horaEntrada();
        double x = horaSaida();
        double z = (x - y);
        if (z < 0) {
            z += 24;
            System.out.println("O valor a ser cobrado é: R$" + Math.floor(z) * 10);
        } else if (z < 1) {
            System.out.println("O valor a ser cobrado é R$5.0");
        } else {
            System.out.println("O valor a ser cobrado é: R$" + Math.floor(z) * 10);
        }

    }

}
