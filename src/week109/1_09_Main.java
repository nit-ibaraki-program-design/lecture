class Pd9Base {
    public static void main(String[] args) {
        //Baseはフィールドnumに自由に値を設定できる
        Base b1 = new Base();
        b1.setNum(12);
        b1.showNum();
        b1.setNum(5);
        b1.showNum();
        //Evenはnumに偶数のみ設定できる
        Even e1 = new Even();
        e1.setEven(12);
        e1.showNum();
        e1.setEven(5);
        e1.showNum();
        //Oddの動作確認
        Odd o1 = new Odd();
        o1.setOdd(12);
        o1.showNum();
        o1.setOdd(5);
        o1.showNum();
    }
}

class Pd9Length {
    public static void main(String[] args) {
        //四角形のインスタンスで面積を求める
        Rectangle r1 = new Rectangle();
        r1.setHeight(10);
        r1.setWidth(20);
        r1.area();
        //三角形のインスタンスで面積を求める
        Triangle t1 = new Triangle();
        t1.setHeight(30);
        t1.setWidth(15);
        t1.area();
    }
}
