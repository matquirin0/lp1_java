public class Main {
    public static void main(String[] args) {
        NotasLP1 notasMatheus = new NotasLP1(8.0, 1.0, 7.5, 1.0, 0, 9.0, 0);

        Aluno aluno = new Aluno("Matheus Quirino", notasMatheus);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média Atual: %.2f%n", aluno.getMediaFinal());
    }
}