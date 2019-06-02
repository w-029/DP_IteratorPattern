import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList items;

    public PancakeHouseMenu() {
        items = new ArrayList();

        addItem("皮蛋瘦肉粥","中国的传统美食",false,6);
        addItem("肯德基早餐套餐","美国特色早餐",false,8);
        addItem("豆浆油条","中国的传统早餐",true,5);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeMenuIterator(items);
    }
}
