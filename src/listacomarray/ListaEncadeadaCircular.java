
package listacomarray;

public class ListaEncadeadaCircular {
    private int size;
    private ClasseNo head,tail,previous,next;
    public ListaEncadeadaCircular(){
        size=0;
        head=tail=previous=null;
    }
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return (head==null);
    }
    
    public void addElement(Object Element){
        ClasseNo newElement = new ClasseNo(Element,null);
        if(head==null){
            head = newElement;
            tail=newElement;
           
        }
        else{
            tail.next=newElement;
           


        }
        tail=newElement;
        size++;
    }
    
    public int indexOf(Object Element){
        ClasseNo iteracoes = head;
        previous = null;
        for(int i=0;i<size;i++){
            if(iteracoes.element.equals(Element)){
               return i;
            }else{
                previous = iteracoes;
                iteracoes = iteracoes.next;
        }
        }
        previous=null;
        return -1;
    }
    
    private ClasseNo findPrevious(int index){
        ClasseNo iteracoes = head;
        previous = null;    
        for(int i=0;i<size;i++){
            if(i==index){
                return iteracoes.previous;
            }
            previous=iteracoes;
            iteracoes = iteracoes.next;
        }
        return tail.previous;
    }
  
    public Object elementAt(int index){
        if(index<0 || index>size) return null;
        if(index==0){
            return head.element;
        }
        ClasseNo tmp = findPrevious(index);
        return tmp.next.element;
    }
    public void printList() {
        if (this.isEmpty())  return;
            ClasseNo itr=head;
            while (itr!=null) {
                System.out.println(itr.element);
                itr=itr.next;
            }
    }
    public boolean verificaValor(Object Element){
        if(indexOf(Element) >=0){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean removeElement(Object Element){
        if(isEmpty() || indexOf(Element)<0){
            return false;
        } 
        else {
            tail = (ClasseNo) tail.next;
            return true;
        }
        
    }
    public void getTail(){
        System.out.println(tail.element);
    }
    public void getHead(){
        System.out.println(head.element);
    }
    
}

