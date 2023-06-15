public class Main {
    public static void main(String[] args) {
        House house = new House("My House", 2, 4);
        house.show();
        house.open();
        house.close();

        System.out.println("----");

        OfficeBuilding officeBuilding = new OfficeBuilding("City Tower", 20, 100);
        officeBuilding.show();
        officeBuilding.open();
        officeBuilding.close();
    }
}
