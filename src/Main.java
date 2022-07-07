import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Charge charge = new Charge();
        Scanner scanner = new Scanner(System.in);

        Employees funcionario1 = new Employees("Rodolfo", 1300, "Manhã");
        Employees funcionario2 = new Employees("Vitor", 1400, "Tarde");
        Employees funcionario3 = new Employees("André", 1500, "Noite");

        System.out.println("Digite o número do funcionário responsável pela operação:");
        System.out.println("1-Rodolfo");
        System.out.println("2-Vitor");
        System.out.println("3-André");

        //Employees x = funcionario1;
        //Employees y = funcionario2;
        //Employees z = funcionario3;
        Employees funcionarioEscolhido = null;
        int scanEmploy = scanner.nextInt();

        if (scanEmploy == 1) {
            funcionarioEscolhido = funcionario1;
            System.out.println("Funcionário Rodolfo é o responsável pela operação.");
            //System.out.println(funcionarioEscolhido); Imprimindo o HashCode
        }
        if (scanEmploy == 2) {
            funcionarioEscolhido = funcionario2;
            System.out.println("Funcionário Vitor é o responsável pela operação");
            //System.out.println(funcionarioEscolhido); Imprimindo o HashCode
        } else if (scanEmploy == 3) {
            funcionarioEscolhido = funcionario3;
            System.out.println("Funcionário André é o responsável pela operação");
            //System.out.println(funcionarioEscolhido); Imprimindo o HashCode
        } else {
            System.out.println("Funcionário não listado");
        }
        Car carA = new Car("Sportage", "Kia", "WSD-3123", 2017);
        Car carB = new Car("Logan", "Renault", "QRE-2315", 2015);
        Car carC = new Car("XC 60", "Volvo", "DER-4323", 2019);
        //System.out.println(carA.getMarca());
        client.name();
        System.out.println("Opções de carro: ");
        System.out.println("1-Kia Sportage");
        System.out.println("2-Renault Logan");
        System.out.println("3-Volvo XC 60");
        System.out.println("Por favor, digite o número do carro que deseja.");

        //Scanner scanner = new Scanner(System.in);
        int scanNumber = scanner.nextInt();
        Car a = carA;
        Car b = carB;
        Car c = carC;
        Car carroEscolhido = null;

        if (scanNumber == 1) {
            System.out.println("Carro escolhido: Kia Sportage");
            carroEscolhido = a;
        } else if (scanNumber == 2) {
            System.out.println("Carro escolhido: Renault Logan");
            carroEscolhido = b;
        } else if (scanNumber == 3) {
            System.out.println("Carro escolhido: Volvo XC 60");
            carroEscolhido = c;
        } else {
            System.out.println("Carro não listado");
        }

        System.out.println("O cliente escolheu o " + carroEscolhido.getModelo());
        System.out.println("O funcionário " + funcionarioEscolhido.getNome() + " realizou a operação");
        charge.value();
        double i = charge.horaSaida();

        if (i >= 6) {
            System.out.println("Rodolfo finalizou a operação");
        } else if (i >= 12) {
            System.out.println("Vitor finalizou a operação");
        } else {
            System.out.println("André finalizou a operação");
        }

    }
}




