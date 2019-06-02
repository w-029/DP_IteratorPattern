import java.util.ArrayList;

/**
 * 为了隐藏菜单的具体内部实现方法（使用数组、堆栈、列表、散列表），需要将items菜单统一实现对外的Iterator接口；
 * 这里是将列表ArrayList转换为Iterator接口；
 */
public class PancakeMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem item = (MenuItem) items.get(position);
        position++;
        return item;
    }

    @Override
    public boolean hasNext() {
        while (position >= items.size()) {
            return false;
        }
        return true;
    }
}
