package calc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations n1 = new Operations();
        Operations n2 = new Operations();
        Operations rum = new Operations();
        Scanner scanner = new Scanner(System.in);

        rum.info();

        while (true) {
            int option;
            option = scanner.nextInt();
            if (option == 5){
                System.out.println("saindo da calculadora...");
                break;
            }
            switch (option) {
                case 1:
                    System.out.println("SOMA\n");
                    System.out.println("digite o primeiro valor: ");n1.setValor(scanner.nextInt());
                    System.out.println("digite o segundo valor: "); n2.setValor(scanner.nextInt());
                    System.out.println("---> RESULTADO DA SOMA: " + rum.soma(n1.getValor(), n2.getValor()));
                    System.out.println();
                    rum.info2();
                    break;
                    case 2:
                    System.out.println("SUBTRACAO\n");
                    System.out.println("digite o primeiro valor: ");n1.setValor(scanner.nextInt());
                    System.out.println("digite o segundo valor: ");n2.setValor(scanner.nextInt());
                    System.out.println("---> RESULTADO DA SUBTRACAO: " + rum.meno(n1.getValor(), n2.getValor()));
                    System.out.println();
                    rum.info2();
                    break;
                    case 3:
                    System.out.println("DIVISAO\n");
                    System.out.println("digite o primeiro valor: "); n1.setValor(scanner.nextInt());
                    System.out.println("digite o segundo valor: ");n2.setValor(scanner.nextInt());
                    System.out.println("---> RESULTADO DA DIVISAO: " + rum.div(n1.getValor(), n2.getValor()));
                    System.out.println();
                    rum.info2();
                    break;
                    case 4:
                    System.out.println("MULTIPLICACAO\n");
                    System.out.println("digite o primeiro valor: ");n1.setValor(scanner.nextInt());
                    System.out.println("digite o segundo valor: ");n2.setValor(scanner.nextInt());
                    System.out.println("---> RESULTADO DA MULTIPLICACAO: " + rum.mult(n1.getValor(), n2.getValor()));
                    System.out.println();
                    rum.info2();
                    break;
                default:
                    System.out.println("opcao invalida");
                    rum.info2();
            }
            System.out.println();
        }
      scanner.close();
    }
}