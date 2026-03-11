package Farmacia;

public class ArCondicionado {
    private String modelo;
    private int temperatura;
    private boolean estaLigado;


    public ArCondicionado(String modelo, int temperatura){
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public int getTemperatura(){
        return temperatura;
    }

    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }

    public int aumentarTemperatura(int temperatura){
        if (!estaLigado){
            System.out.println("O ar condicionado está desligado. Para aumentar a temperatura necessário ligar.");
        }
        return this.temperatura += temperatura;
    }

    public int diminuirTemperatura(int temperatura){
        if (!estaLigado){
            System.out.println("O ar condicionado está desligado. Para diminuir a temperatura necessário ligar.");
        }
        return this.temperatura -= temperatura;
    }

    public boolean ligarAr(){
        return this.estaLigado = true;
    }

    public boolean desligarAr(){
        setTemperatura(0);
        return this.estaLigado = false;
    }

}

