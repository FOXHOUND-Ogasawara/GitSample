public class OfficeBuilding extends Building {
    private int numOffices;

    public OfficeBuilding(String name, int floors, int numOffices) {
        super(name, floors);
        this.numOffices = numOffices;
    }

    public int getNumOffices() {
        return numOffices;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(this.numOffices + "個のテナントが入っています。");
    }

    @Override
    public void open() {
        System.out.println("オフィスビルのエントランスを開けて入室します。");
    }

    @Override
    public void close() {
        System.out.println("オフィスビルのエントランスを閉めて退出します。");
    }
}