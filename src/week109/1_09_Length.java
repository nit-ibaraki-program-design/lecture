//辺の長さを表すクラス
class Length {
    protected int height; //高さ
    protected int width;  //幅
    //heightのアクセッサ
    public void setHeight(int h) {
        height = h;
    }
    public int getHeight() {
        return height;
    }
    //widthのアクセッサ
    public void setWidth(int w) {
        width = w;
    }
    public int getWidth() {
        return width;
    }
}
