package override;

import java.awt.Polygon;

public class Execution {
    public static void main(String[] args) {
        Shape shape = new Shape();

        Polygon p = new Polygon();

        p.setCorner(5);

        System.out.println("この多角形の角の数は"+ p.getCorner());

        // shape.p.introduction();
        // shape.s.introduction();

        // 拡張 for 文の場合
        // for (Polygon polygon : shape.polygons) {
        //     polygon.introduction();
        // }

        // for 文の場合
        for (int i = 0; i < shape.polygons.length; i++) {
            shape.polygons[i].introduction();
        }

    }
}