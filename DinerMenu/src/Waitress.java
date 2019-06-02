
/**
 * 女招待只需要接收实现了Menu接口的对象（而不必在乎传进来的是哪一个具体的实现菜单），
 * 同时在遍历菜单的时候，女招待也只是通过Iterator接口来进行顺序访问每一条菜单条目，而不必在乎菜单内部是使用哪种聚合（数组、列表等）来表示，
 * 这样通过迭代器模式，就将女招待与具体的菜单以及菜单内部的具体结构进行了解耦。
 */

/**
 * 但这里还存在一个问题：就是每增加一个菜单时，女招待都要创建一个对应的迭代器对象并遍历它，
 * 要想解决这个问题，就应该使用“组合模式”，请另外参见“组合模式”。
 */

public class Waitress {
    Menu pancakeMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeMenu, Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);

        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + ", ");
            System.out.println(item.getDescription());
        }
    }
}
