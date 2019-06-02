public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeMenu, dinerMenu);

        waitress.printMenu();
    }
}
