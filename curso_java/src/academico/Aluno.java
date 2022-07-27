package academico;

/* ler 3 notas - n1 vale 30, n2, n3 vale 35, se nao atingir 60,
  dizer failer e quanto faltou pra atingir, or passed  */
public class Aluno {
	
	public String nome;
	public double n1, n2, n3;
	
	public double notaFinal()
	{
		return n1+n2+n3;
	}
	
	public double resultado() {
		if(notaFinal() < 60.0 ) {
			return 60.0 - notaFinal();
		}
		else { return 0.0;
		}
		
	}
	

}
