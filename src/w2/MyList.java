package w2;

public class MyList {
    Element head;

    public void add(String str) {
        Element tmp = new Element();

        tmp.data = str;
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
