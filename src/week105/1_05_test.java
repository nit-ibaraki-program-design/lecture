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
