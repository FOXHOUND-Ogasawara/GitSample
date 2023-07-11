public class House extends Building {
    private int numRooms;

    public House(String name, int floors, int numRooms) {
        super(name, floors);
        this.numRooms = numRooms;
    }

    public int getNumRooms() {
        return numRooms;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(this.numRooms + "部屋あります。");
    }

    @Override
    public void open() {
        System.out.println("家のドアを開けて入室します。");
    }

    @Override
    public void close() {
        System.out.println("家のドアを閉めて退出します。");
    }
}