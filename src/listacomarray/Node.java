/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacomarray;

/**
 *
 * @author davik
 */
public class Node {
    private Object element;
    private ListNode header,tail,head,trailer,previous;
    private int size;
    
    private class ListNode{
        private Object element;
        private ListNode next,previous;
        //construtor
        private ListNode(Object element, ListNode n, ListNode m){
            this.element=element;
            this.next=null;
            this.previous=null;
        }
    }
    //construtor
   public Node() {
      header = new ListNode(null,null,null);
      trailer = new ListNode(null,null,null);
      this.element = null;
      this.head=null;
      this.tail=null;
      this.size=0;
      
   }

   public void setElement(Object element) {
      this.element = element;
   }
   
   public Object getElement() {
      return element;
   }

   public int size(){
       return this.size;
   }
   public boolean isEmpty(){
       return (head==null);
   }
   public void addElement(Object Element){
       ListNode newElement = new ListNode(Element,null,null);
       ListNode tmp=tail;
       if(head==null){
           head = newElement;
           tail = newElement;
           header.next=head;
           trailer.previous=tail;
       }else{
           trailer.previous = newElement;
           tail.next=newElement;   
       }
       tail=newElement;
       tail.previous=tmp;
       size++;
   }
   public int indexOf (Object elem) {
        ListNode itr = header.next;
        previous=header;
        for (int i=0; i<size; i++) {
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
   public void removeAllElements(){
       header.next=null;
       trailer.previous=null;
       size=0;
   }
   public boolean removeElement(Object Element){
       if(isEmpty() || indexOf(Element)<0){
           return false;
       }
       previous.next=previous.next.next;
       size--;
       return true;
   }
   
   public void insertElementAt(Object Element, int index){
       if(index<0 || index>size-1)
           return ;
       else{
           ListNode newElement = new ListNode(element,null,null);
           if(index==0){
               header.next = newElement;
               ListNode tmp = head;
               ListNode tmp2=head.next;
               head = newElement;
               head.previous=header;
               head.next=tmp;
               tmp.next=tmp2;
               tmp.previous=head;
           }
       }
   }
   
   public void printList() {
        if (this.isEmpty())  return;
            ListNode itr=header.next;
            while (itr!=null) {
                System.out.println(itr.element);
                itr=itr.next;
            }
    }
   public void getTail(){
        System.out.println(tail.element);
    }
    public void getHead(){
        System.out.println(head.previous);
    }
    public Object ElementAt (int index) {
        if (index<0 || index>size-1) {
            System.out.println("Indice nao encontrado.");
        }
        ListNode itr = header.next;
        for (int i=0; i<index; i++) {
            itr=itr.next;
            System.out.println(i);
        }
        return itr.element;
    }
    
    public boolean removeElementAt (int index) {
        ListNode itr = header.next;
        ListNode aux,aux2;
        if (index<0 || index>size-1) {
            System.out.println("Índice não encontrado");
            return false;
        }
        else {
            for (int i=0; i<size; i++) {
                if (index==0) {
                    header.next = header.next.next;
                    head=header.next;
                    size--;
                    return true;
                }
                if (index == size-1) {
                    trailer.previous = trailer.previous.previous;
                    tail=trailer.previous;
                    tail.next = trailer;                    
                    size--;
                    return true;
                }
                if (i==index) {
                    aux = itr.next;
                    aux2 = itr.previous;
                    aux.previous = aux.previous.previous;
                    aux2.next = aux2.next.next;
                    size--;
                }
                itr=itr.next;
            }
        }
        return true;
    }
}
