public class Balanco {
    private int jan;
    private int fev;
    private int mar;

    public Balanco(){
    }

    public int getJan(){
        return jan;
    }

    public int getFev(){
        return fev;
    }

    public int getMar(){
        return mar;
    }

    public void setJan(int jan){
        this.jan = jan;
    }

    public void setFev(int fev){
        this.fev = fev;
    }

    public void setMar(int mar){
        this.mar = mar;
    }

    public int soma(int jan, int fev, int mar){
        return (jan + fev + mar);

    }

    public double calcMedia(int soma){
        return (double) soma / 3;
    }
}
