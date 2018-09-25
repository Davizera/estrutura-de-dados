
package listacomarray;

public class TestaLista {
    public static void main(String[] args) {
       
        //Roteiro para o teste.
        // 1) Adicione 6 objetos Alunos a Lista e imprima a lista.  
        ListaEncadeadaCircular list = new ListaEncadeadaCircular();
       
        list.addElement(new Aluno("Davi","222"));
        list.addElement(new Aluno("Caio","333"));
        list.addElement(new Aluno("Jair","2424"));
        Aluno merda = new Aluno("Linda","2324");
        list.addElement(merda);
        list.printList();
        System.out.println("\n\n\n");
        list.removeElement(merda);
        list.printList();
       
       
      
    } 
}
