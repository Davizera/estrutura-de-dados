
package listacomarray;

public class Teste1 {
    public static void main(String[] args) {
        
        //Roteiro para o teste.
        // 1) Adicione 6 objetos Alunos a Lista e imprima a lista.  
        Lista list=new Lista();
        list.addElement(new Aluno("João","111"));
        list.addElement(new Aluno("Maria","222"));       
        list.addElement(new Aluno("José","333"));         
        list.addElement(new Aluno("André","000"));         
        list.addElement(new Aluno("Carlos","555"));  
        list.addElement(new Aluno("Pedro","666")); 
        list.printList();
        // 2)Apague o objeto na posição 5 e imprima a lista.
        list.removeElementAt(5);
        list.printList();
        // 3)Apague o objeto na posição 5 novamente e imprima a lista. Explique o que ocorreu?
        list.removeElementAt(5);
        list.printList();       
        // 4)Apague o objeto na posição 1 e imprima a lista.
        list.removeElementAt(1);
        list.printList();        
        // 5) Modifique a classe Lista de forma que os elementos da lista possam ser ordenados. 
        
        // 6)Solicite a lista que ordene os elementos e imprima.  
        
      
        // TODO code application logic here
    }
    
}
