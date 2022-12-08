package Questao3;

public class Main {

	public static void main(String[] args) {
		Lista A1 = new Lista();
		Aluno A2 = new Aluno("Vini", 5, "CC;");
		Aluno A3 = new Aluno("Mateus", 6, "CC;");
		Aluno A4 = new Aluno("HB", 7, "CC");
		
		A1.insereInicio(A2);
		A1.insereInicio(A3);
		System.out.println(A1.exibeLista()); 
		A1.insereFinal(A4);
		System.out.println(A1.exibeLista()); 
	}

}
