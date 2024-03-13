import java.util.Scanner;
public class AlunoTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        //Ler os dados: nome, nota gs, cp e challenge
        System.out.println("Digite o nome:");
        aluno.nome = scanner.next() + scanner.nextLine();
        System.out.println("Digite a nota da gs");
        aluno.gs = scanner.nextFloat();
        System.out.println("Digite a nota do cp");
        aluno.cp = scanner.nextFloat();
        System.out.println("Digite a nota do challenge ");
        aluno.challenge = scanner.nextFloat();

        //Calcular e exibir a media do aluno

        aluno.mediaFinal();
        float media = aluno.mediaFinal();
        System.out.println(aluno.nome + " a sua média final é: " + media);
    }
}
