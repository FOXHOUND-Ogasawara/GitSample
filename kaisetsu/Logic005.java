public class Logic005 {
    int num = 7;
    int sum = 0;

    public void main(String[] args) {
        // int num = 7;
        // int sum = (num * (num + 1)) / 2;
        // System.out.println("n = " + num);
        // System.out.println("合計値：" + sum);
        // int sum = 0;

        // int num = 7;
        System.out.println("n = " + this.num);
        System.out.println("合計値：" + sum());
    }

    public static int sum() {

        while (Logic005.num > 0) {
            Logic005.sum += Logic005.num;
            Logic005.num--;
        }
        Logic005.num = 7;
        return Logic005.sum;
    }
}
