package kaisetsu.override_kaisetsu;

class Shape {
    // Polygon 型で配列を用意
    public Polygon[] polygons = new Polygon[3];
    public Polygon polygon;
    public Square square;
    public Triangle triangle;

    public Shape() {
        polygon = new Polygon();
        square = new Square();
        triangle = new Triangle();
        polygons[0] = new Polygon();
        polygons[1] = new Square();
        polygons[2] = new Triangle();
    }
}