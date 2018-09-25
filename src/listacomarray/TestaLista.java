
package listacomarray;

public class TestaLista {
    public static void main(String[] args) {
       
        //Roteiro para o teste.
        // 1) Adicione 6 objetos Alunos a Lista e imprima a lista.  
        Node list = new Node();
        Aluno merda = new Aluno("Linda","2324");
        Aluno teste = new Aluno("Anabele","6969");
        list.addElement(new Aluno("Davi","222"));
        list.addElement(teste);
        list.addElement(new Aluno("Caio","333"));
        list.addElement(new Aluno("Jair","2424"));
        list.addElement(merda);
        list.addElement(new Aluno("José","1234"));
        list.addElement(new Aluno("Pica","1234"));
        
        System.out.println("\n\n"
                + "printando dps de add");
        
        list.addElement(teste);
        System.out.println("\n\n"
                + "removendo teste");
        
        list.removeElement(teste);
        list.printList();
        
        
       
        System.out.println("\n\n"
                + "?");
        list.insertElementAt(new Aluno("Betinho","666"), 0);
        list.printList();
        
       
      
    } 
}
