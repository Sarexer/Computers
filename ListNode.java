/**
 * Created by shaka on 14.10.2017.
 */
public class ListNode<E> {
    Node<E> first;
    Node<E> last;
    int size = 0;

    void addEnd(E a){
        Node<E> tmp = new Node<>();
        tmp.next = null;
        tmp.data = a;
        if(first != null){
            tmp.prev = last;
            last.next = tmp;
            last = tmp;
        }else{
            tmp.prev = null;
            last = tmp;
            first = tmp;
        }
        size++;
    }
    void addHead(E a){
        Node<E> tmp = new Node();
        tmp.next = first;
        tmp.data = a;
        if(first != null){
            if(size == 1){
                last.prev = tmp;
            }
            tmp.prev = null;
            first.prev = tmp;
            first = tmp;

        }else{
            tmp.prev = null;
            last = tmp;
            first = tmp;
        }
        size++;
    }
    void insertNode(int pos, int value){
        Node tmp = new Node();
        tmp.data = value;
        if(first != null){
            Node head = first;
            int count = 0;
            while(head != null){
                if(count == pos-2){
                    head.next.prev = tmp;
                    tmp.next = head.next;
                    tmp.prev = head;
                    head.next = tmp;
                    break;
                }
                head = head.next;
                count++;
            }
        }else{
            tmp.prev = null;
            tmp.next = null;
            first = tmp;
            last = tmp;
        }
    }
    void deleteNode(int index){
        Node<E> tmp = first;
        int count = 0;
        while(tmp != null){
            if(count == index){
                if(index == 0){
                    tmp.next.prev = null;
                    first = tmp.next;
                }else if(index == size - 1){
                    tmp.prev.next = null;
                    last = tmp.prev;
                }else{
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                }
            }
            tmp = tmp.next;
            count++;
        }
    }
    void deleteAll(){
        first = null;
        last = null;
        size = 0;
    }
    Node find(int index){
        Node<E> tmp = first;
        int count = 0;
        while(tmp != null){
            if(count == index){
                return tmp;
            }
            tmp = tmp.next;
            count++;
        }
        return null;
    }
    /*Node findByValue(int value){
        Node<E> tmp = first;
        int count = 0;
        while(tmp != null){
            if(tmp.data == value){
                return tmp;
            }
            tmp = tmp.next;
            count++;
        }
        return null;
    }*/
    void show(){
        Node<E> tmp = first;
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }



    boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }


}
