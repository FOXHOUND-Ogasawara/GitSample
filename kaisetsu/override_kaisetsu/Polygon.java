package kaisetsu.override_kaisetsu;

class Polygon {

    int num;

    public String introduction() {
        System.out.println(this.num);
        this.test();
        return "多角形です。";
    }

    public void test() {
        System.out.println("test");
    }
}
