package w2;

public class MyList<T> {
    Element head;

    public void add(T data) {
        Element<T> tmp = new Element<>();

        tmp.data = data;
        tmp.next = head;
        head = tmp;
    }

    public void show() {
        Element tmp = head;

        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
