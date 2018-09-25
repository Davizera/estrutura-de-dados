
package listacomarray;


public class ClasseNo {
        protected Object element;
        protected ClasseNo next,previous;
        public ClasseNo(Object e, ClasseNo n) {
            element=e;
            next=n;
            previous=null;
        }
    
        public Object getElement() {
            return element;
        }
        
        public ClasseNo getNext() {
            return next;
        }
        
        public void setElement(String newElem) {
            element=newElem;
        }
        
        public void setNext(ClasseNo newNext) {
            next=newNext;
        }
}


