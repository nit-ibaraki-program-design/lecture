//ここに番号と名前を入れる
class Base {
    protected int num;
    public Base() {
        num = 0;
    }
    public Base(int n) {
        num = n;
    }
    public void setNum(int n) {
        num = n;
    }
    public int getNum() {
        return num;
    }
    public void showNum() {
        System.out.printf("num: %d\n", num);
    }
}


class Pd10test {
    public static void main(String[] args) {
        //インスタンスを作成する
        Base b1 = new Base();
        Base b2 = new Positive();
        //showNumの動作確認
        System.out.println("--- b1 ---");
        b1.showNum();
        System.out.println("--- b2 ---");
        b2.showNum();
        //setNumの動作確認
        System.out.println("--- 正の値の場合 ---");
        b2.setNum(7);
        b2.showNum();
        System.out.println("--- 負の値の場合 ---");
        b2.setNum(-3);
        b2.showNum();
    }
}
