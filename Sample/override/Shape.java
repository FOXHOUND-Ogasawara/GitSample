package Sample.override;

public class Shape {

    public Polygon p = new Polygon();
    public Square s = new Square();
    public Triangle t = new Triangle();

    // Polygon 型で配列を用意
    public Polygon[] polygons = new Polygon[3];

    public Shape() {
        polygons[0] = new Polygon();
        polygons[1] = new Square();
        polygons[2] = new Triangle();
    }
}
