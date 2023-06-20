public class Building {
    private String name;
    private int floors;

    public Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getName() {
        return this.name;
    }

    public int getFloors() {
        return this.floors;
    }

    public void show(){
        System.out.println("建物の名称：" + this.name);
        System.out.println(this.floors + "階建ての建物です。");
    }

    public void open() {
        System.out.println("建物がオープンしました。");
    }

    public void close() {
        System.out.println("建物がクローズしました。");
    }
}
