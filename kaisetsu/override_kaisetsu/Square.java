package kaisetsu.override_kaisetsu;

class Square extends Polygon {

    int num2;

    @Override
    public String introduction() {
        System.out.println(this.num2);
        System.out.println(super.num);
        return "正方形です。";
    }
}