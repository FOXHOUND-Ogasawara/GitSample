package kaisetsu.keishoKaisetsu;

public class Place {
    private int x;
    private int y;
    private int z;

    public Place(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public void showPlace() {
        System.out.println("現在の座標(x,y,z):" + this.x + "," + this.y + "," + this.z);
    }

}
