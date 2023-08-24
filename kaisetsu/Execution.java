package kaisetsu;
class Execution {
    public static void main(String[] args) {
        // 以下に出力処理をコーディングする
        Hanoi hanoi = new Hanoi();
        System.out.println("円盤数 : " + hanoi.disks.length + "枚");
        hanoi.moveDisk(hanoi.disks.length, hanoi.start, hanoi.goal, hanoi.tmp);
        System.out.println("移動回数 : " + hanoi.moveCount + "回");
    }
}