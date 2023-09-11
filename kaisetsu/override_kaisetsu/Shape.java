package kaisetsu.override_kaisetsu;

class Shape {
    // Polygon 型で配列を用意
    public Polygon[] polygons = new Polygon[3];

    public Shape() {
        polygons[0] = new Polygon();
        polygons[1] = new Square();
        polygons[2] = new Triangle();
    }
}