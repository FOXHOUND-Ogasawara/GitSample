package kaisetsu.override_kaisetsu;

class Execution {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // 拡張 for 文の場合
        for (Polygon polygon : shape.polygons) {
            polygon.introduction();
        }
        // for 文の場合
        for (int i = 0; i < shape.polygons.length; i++) {
            // String str = shape.polygons[i].introduction();
            System.out.println(shape.polygons[i].introduction());
        }
    }
}
