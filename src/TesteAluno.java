import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        System.out.println("Digite o nome do aluno");
        String nome = leitura.nextLine();
        aluno1.nome = nome;

        System.out.println("Digite a idade dele");
        int idade = leitura.nextInt();
        aluno1.idade = idade;

        System.out.println(aluno1.exibeInformacoes());
    }
}
