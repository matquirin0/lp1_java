import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Balanco balanco;

        Balanco balanco1 = new Balanco();
        int soma = balanco1.soma(15000, 23000, 17000);
        double calcMedia = balanco1.calcMedia(soma);


        System.out.println("A despesa total no trimestre foi de: " + soma);
        System.out.printf("A média de gastos no trimestre foi de: %.2f ",calcMedia);

        //Inserindo os gastos manualmente

        int jan, fev, mar;

        Scanner sc = new Scanner(System.in);

        Balanco balanco2 = new Balanco();
        System.out.print("Digite o gasto em Janeiro: ");
        jan = sc.nextInt();
        System.out.print("Digite o gasto em Fevereiro: ");
        fev = sc.nextInt();
        System.out.print("Digite o gasto em Março: ");
        mar = sc.nextInt();

        int soma2 = balanco2.soma(jan, fev, mar);
        double calcMedia2 = balanco2.calcMedia(soma2);

        System.out.println("A despesa total no trimestre foi de: " + soma2);
        System.out.printf("A média de gastos no trimestre foi de: %.2f ",calcMedia2);

        sc.close();
    }
}