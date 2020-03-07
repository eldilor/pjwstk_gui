package w1;

public class Main {
    public static void main(String[] args) {
        A a = new MyClass();

        // =====
        Computer computer = new Computer();
        Device device = new Device();

        computer.connect(device);
        computer.work();

        // =====
        D d1 = new D("10 PLN");
        D d2 = new D("20 EUR");
    }
}

interface A {
    public void method();
}

class MyClass implements A {
    public void method() {

    }
}

interface USB {
    public String receive();

    public void send(String s);
}

class Computer {
    USB port;

    public void connect(USB dev) {
        this.port = dev;
    }

    public void work() {
        if (this.port != null) {
            this.port.send("init");
            String res = this.port.receive();
        }
    }
}

class Device implements USB {
    @Override
    public String receive() {
        return "Hello!";
    }

    @Override
    public void send(String s) {
        System.out.println(s);
    }
}

class D {
    String price;

    public D(String price) {
        this.price = price;
    }
}