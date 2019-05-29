//ここに番号と名前を入れる
class Car {
    private int num;
    private double gas;
    public Car() {
        num = 0; gas = 0.0;
    }
    public Car(int n, double g) {
        num = n; gas = g;
    }
    public void show() {
        System.out.println("(num)" + num + " (gas)" + gas);
    }
}

class Person {
    private String name; //名前
    private int age;     //年齢
    public Person() {
        name = "anonymous";
        age = 20;
    }
    public void setNA(String n, int a) {
        name = n;
        age = a;
    }
    public void show() {
        System.out.printf("%s(%d)\n", name, age);
    }
}

class Pd5test {
    public static void main(String[] args) {
        Person p1; Car c1;
        c1 = new Car(1234, 50);
        c1.show();

        p1 = new Person();
        p1.setNA("Bob", 35);
        c1.setOwner(p1);
        c1.show();
    }
}
