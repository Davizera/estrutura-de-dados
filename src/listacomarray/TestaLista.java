
package listacomarray;

public class TestaLista {
    public static void main(String[] args) {
       
        //Roteiro para o teste.
        // 1) Adicione 6 objetos Alunos a Lista e imprima a lista.  
        Node list = new Node();
        Aluno merda = new Aluno("Linda","2324");
        Aluno xerece = new Aluno("Xerecuda","6969");
        list.addElement(new Aluno("Davi","222"));
        list.addElement(xerece);
        list.addElement(new Aluno("Caio","333"));
        list.addElement(new Aluno("Jair","2424"));
        list.addElement(merda);
        list.addElement(new Aluno("José","1234"));
        list.addElement(new Aluno("Pica","1234"));
        
        System.out.println("\n\n"
                + "printando dps de add");
        
        list.addElement(xerece);
        System.out.println("\n\n"
                + "removendo xerece");
        
        list.removeElement(xerece);
        list.printList();
        
        list.removeElementAt(6);
        System.out.println(list.size());
        System.out.println("\n\n"
                + "?");
        list.printList();
        
       
      
    } 
}
