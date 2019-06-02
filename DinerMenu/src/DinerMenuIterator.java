import java.awt.*;

/**
 * 为了隐藏菜单的具体内部实现方法（使用数组、堆栈、列表、散列表），需要将items菜单统一实现对外的Iterator接口；
 * 这里是将数组MenuItem[]转换为Iterator接口；
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public boolean hasNext() {
        // 注意：数组不一定是满的，务必检查下一项是否为null
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}
