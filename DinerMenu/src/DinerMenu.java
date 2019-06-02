import java.awt.*;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] items;

    public DinerMenu() {
        items = new MenuItem[MAX_ITEMS];

        addItem("扬州炒饭","将各种蔬菜、肉类切末炒饭",false,12.0);
        addItem("盖浇饭","将炒菜浇盖到饭上",false,18.0);
        addItem("手抓饭","这个可能是印度的传统吃法",false,15.0);
        addItem("泡菜饭","就着泡菜来吃饭",false,5.0);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("对不起，菜单已满，无法再添加条目");
        } else {
            items[numberOfItems] = item;
            numberOfItems++;
        }
    }

    /**
     * 返回迭代器接口：客户就不会知道具体实现的细节（是用的数组而不是其他）；
     * 创建具体的子类，返回统一的迭代器接口（针对接口编程）；
     * 返回迭代器接口方法，代替传统的getter()方法；*/
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(items);
    }

}
