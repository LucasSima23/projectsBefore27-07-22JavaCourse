package academico;
import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno : ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a nota 1 (35) : ");
		aluno.n1 = sc.nextDouble();
		System.out.println("Digite a nota 2 (30) : ");
		aluno.n2 = sc.nextDouble();
		System.out.println("Digite a nota 3 (30) : ");
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("Nota FINAL : %.2f %n", aluno.notaFinal());
		
		if(aluno.notaFinal() < 60.0) {
			
			System.out.println("FAILED ");
			System.out.printf("FALTOU %.2f POINTS %n", aluno.resultado());
		}
		else {
			System.out.println("PASS ");
		}

}
	
}
