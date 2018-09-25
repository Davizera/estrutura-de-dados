
public class ListaEncadeada2 {
    // Representação
    private ListNode head; 
    private ListNode tail;
    private ListNode previous;
    private ListNode header;
    private int size,pos; 
    private Comparable[] elements;	// array de objetos
    private int capacity=5;	
    private class ListNode {
        private Comparable element;
        private ListNode next;
        private ListNode(Comparable e, ListNode n) {
            element=e; ListNode
            next=n;
            
        }
    }
   
    
    // Construtores
    public ListaEncadeada2() {
        header=new ListNode(null, null);
        size=0;
    }
    // Métodos
    public int size() {
        return size;
    } 
    public boolean isEmpty() {
        return (header.next==null);        
    }
    public void addElement (Comparable elem) {
       if (size==0) {
                elements[size]=elem;  
                size++;
            }
            else {
                int pos=0;
                while (pos<size) {
                    if (elements[pos].compareTo(elem)>0) {
                        insertElementAt(elem, pos);
                        return;
                    }
                    pos++;
                } 
                increaseCapacityIfNecessary();
                elements[size]=elem;
                size++;
            }
        
    }
    public int indexOf (Comparable elem ) {
        ListNode itr=header.next;
        previous=header;
        for (int i=0;i<size;i++) {
            if (itr.element.equals(elem)) {
                return i;
            } 
            else {
                previous=itr;
                itr=itr.next;
            } 
        } 
        
        return -1;
    }
   
    public Comparable ElementAt (int index) {
        if (index<0 || index>size-1)
            return null;
          ListNode itr=header.next;
          for (int i=0;i<index;i++){
              itr=itr.next;
          }
          return itr.element;
    }
    public boolean removeElement (Comparable elem) {
    if (isEmpty() || indexOf(elem)<0) // Lista vazia ou o elemento nao esta na lista
      return false;
     previous.next=previous.next.next;
     size--;
     return true;
         
        
    }
    public void removeAllElements() {
        header.next=null;
        size=0;
    }
    public void insertElementAt (Comparable elem, int index) {
        if (index<0 || index>size-1) 
            return;
        else {
            findPrevious(index);
            ListNode newElement=new ListNode(elem,previous.next);
            previous.next=newElement;
            
        }
        size++;
    }
    public boolean removeElementAt (int index) {
        if (index<0 || index>size-1)
            return false;
        else {
           findPrevious(index);
           previous.next=previous.next.next;
           size--;
        }
        return true;
    }
    public void printList() {
        if (this.isEmpty())  return;
            ListNode itr=header.next;
            while (itr!=null) {
                System.out.println(itr.element);
                itr=itr.next;
            }
    }
    
    private boolean findPrevious (int index){
        ListNode itr=header.next;
        previous=header;
        for (int i=0;i<size;i++){
            if(i==index)
              return true;
            previous=itr;
            itr=itr.next;
        }
        return false;
    }
  private void increaseCapacityIfNecessary() {
        // se não houver mais espaço no array, cria um novo array com o dobro da 
        // capacidade e repassa os elementos atualmente na lista para o novo array
        if  (size==capacity) {
            Comparable[] newElements=new Comparable[capacity*2];
            for (int i=0;i<size;i++) 
                newElements[i]=elements[i];
            elements=newElements;
            capacity*=2;
        }    
    }         
}

