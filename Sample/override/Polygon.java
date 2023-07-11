package Sample.override;

import Sample.Sample.CalcSample;

class Polygon {

    private int corner;

    public Polygon(){}

    public void introduction() {
        System.out.println("多角形です。");
    }

    public int getCorner() {
        return corner;
    }

    public void setCorner(int corner) {
        this.corner = corner;
    }
}
