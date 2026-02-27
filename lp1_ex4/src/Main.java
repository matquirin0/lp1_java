//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Balanco balanco;

        Balanco balanco1 = new Balanco();
        int soma = balanco1.soma(15000, 23000, 17000);
        double calcMedia = balanco1.calcMedia(soma);

        System.out.println("A despesa total no trimestre foi de: " + soma);
        System.out.printf("A média de gastos no trimestre foi de: %.2f ",calcMedia);
    }
}