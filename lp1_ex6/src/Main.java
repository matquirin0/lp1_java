import Concessionaria.Carro;
import Farmacia.Medicamento;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2024, 150000.0, true);
        meuCarro.exibirDetalhes();
        meuCarro.aplicarDesconto(5.0); // 5% de desconto

        System.out.println("--------------------");

        Medicamento remedio = new Medicamento("Amoxicilina", "Amoxicilina Tri-hidratada", 45.50, true, 100);
        remedio.verificarAlertaReceita();
        remedio.vender(2);
    }
}