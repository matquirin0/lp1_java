package Farmacia;

import Farmacia.ArCondicionado;
import Farmacia.Remedio;

public class Main {
    public static void main(String[] args){
        // Instanciando Ar Condicionado e testando métodos de ação
        ArCondicionado a = new ArCondicionado("LG", 0);
        a.ligarAr();
        a.aumentarTemperatura(20);
        System.out.println(a.getTemperatura());

        //Instanciando Remedio e testando métodos de ação
        Remedio dipirona = new Remedio("Dipirona", 15.0, false);
        Remedio xarope = new Remedio("Xarope Antigripal", 60.0, false);
        Remedio amoxicilina = new Remedio("Amoxicilina", 120.0, true);

        double precoDipirona = dipirona.desconto(dipirona.getPreco());
        System.out.println(dipirona.getPreco() + " -> Com desconto: R$" + precoDipirona);

        double precoXarope = xarope.desconto(xarope.getPreco());
        System.out.println("Xarope: R$" + xarope.getPreco() + " -> Com desconto: R$" + precoXarope);

        dipirona.realizarVenda(false);
        amoxicilina.realizarVenda(false);
        amoxicilina.realizarVenda(true);
    }
}