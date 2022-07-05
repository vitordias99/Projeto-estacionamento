import java.util.Scanner;
public class Charge {

    public int horaEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora de entrada: ");
        int horaEntradaScan = scanner.nextInt();
        return horaEntradaScan;
    }
    public int horaSaida(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora de saída: ");
        int horaSaidaScan = scanner.nextInt();
        return horaSaidaScan;
    }
    public void value(){
        int y = horaEntrada();
        int x = horaSaida();
        int z = (x - y);
        System.out.println("O valor a ser cobrado é: R$" + z * 10);
    }

}