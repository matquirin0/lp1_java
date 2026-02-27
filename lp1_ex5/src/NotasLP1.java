public class NotasLP1 {
    private double p1, e1, e2, x, sub, api, exf;

    public NotasLP1(double p1, double e1, double e2, double x, double sub, double api, double exf) {
        this.p1 = p1;
        this.e1 = e1;
        this.e2 = e2;
        this.x = x;
        this.sub = sub;
        this.api = api;
        this.exf = exf;
    }

    public double calcularMediaFinal() {
        double termoBase = (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15);

        double diff = termoBase - 5.9;
        double interruptor = (diff > 0) ? 1.0 : 0.0;

        double calculoComBonus = (termoBase * 0.5) + (interruptor * api * 0.5);

        return Math.min(10.0, Math.max(calculoComBonus, exf)); // Math.min limita a 10
    }
}