package Questao3;

public class Lista {
	
    private static class No{
        public No prox;
        public Aluno aluno;
        
        public No (Aluno elem ){
        	aluno = elem; 
        	prox = null;
        }
    }
    
    private No inicio;
    
    public Lista(){
        inicio = null;
    }

  public boolean isEmpty(){
    return inicio == null;
  }
    
  public boolean search( Aluno elem){
    for(No nodo = inicio; nodo != null; nodo = nodo.prox)
       if (elem == nodo.aluno) return true;
    return false;
            
  }

  public void insereInicio(Aluno elem){ 
        No novoNo = new No(elem);
        novoNo.prox = inicio;
        inicio = novoNo;
    }
  
  public void insereFinal(Aluno elem){
        No novoNo = new No(elem);
        novoNo.prox = inicio ;
    }
    
    public void removeInicio(){
        inicio = inicio.prox;
    }
    
    public String exibeLista(){
        if(isEmpty()) return "Lista vazia\n";
        String str = "Lista Encadeada: ";
        for (No nodo = inicio; nodo != null; nodo = nodo.prox)
            str+= " "+ nodo.aluno;
        return str + "\n";
    }


}
