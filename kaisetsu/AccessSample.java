package kaisetsu;
public class AccessSample {
    // フィールド
    private int tate;
    private int yoko;

    // メソッド
    public AccessSample(int tate, int yoko){
        this.tate = tate;
        this.yoko = yoko;
    }

    public int calc(){
        return this.tate * this.yoko;
    }

    public int getTate(){
        this.sample();
        return this.tate;
    }

    public int getYoko(){
        return this.yoko;
    }

    public void setTate(int tate){
        this.tate = tate;
    }

    private void sample(){

    }

}
