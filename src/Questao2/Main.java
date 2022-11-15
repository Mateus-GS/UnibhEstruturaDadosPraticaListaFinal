package Questao2;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(5);
		a1.adicionar("Mateus ", 1, " TI");
		a1.adicionar("Mateus ", 2, " TI");
		a1.adicionar("Mateus ", 3, " TI");
		a1.adicionar("Mateus ", 4, " TI");
		a1.adicionarPrimeiro("Mateus ", 5, " TI");
		
		a1.removerAluno("1");
		a1.printVetor();

	}

}
