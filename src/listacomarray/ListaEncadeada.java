
package listacomarray;

public class ListaEncadeada {
    // Representação
    private ListNode head; 
    private ListNode tail;
    private ListNode previous;
    private ListNode header;
    private int size; 
    private class ListNode {
        private Object element;
        private ListNode next;
        private ListNode(Object e, ListNode n) {
            element=e; 
            next=n;
            
        }
    }
   
    
    // Construtores
    public ListaEncadeada() {
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
    public void addElement (Object elem) {
        ListNode newElement = new ListNode(elem,null);
        ListNode itr=header;
        while(itr.next!=null){
        itr=itr.next;
    }
        itr.next=newElement;
    }
    public int indexOf (Object elem ) {
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
   
    public Object ElementAt (int index) {
        if (index<0 || index>size-1)
            return null;
          ListNode itr=header.next;
          for (int i=0;i<index;i++){
              itr=itr.next;
          }
          return itr.element;
    }
    public boolean removeElement (Object elem) {
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
    public void insertElementAt (Object elem, int index) {
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
    
    private ListNode findPrevious (int index) {
        ListNode itr=header.next;
        previous=header;
        for (int i=0;i<size;i++) {
           if (i==index)
              return header;
           previous=itr;
           itr=itr.next;
        }
        return null;
    }

  
}
