import java.awt.*;

/*
 * 为了隐藏菜单的具体内部实现方法（使用数组、堆栈、列表、散列表），需要将items菜单统一实现对外的Iterator接口；
 * 这里是将数组MenuItem[]转换为Iterator接口；
 */

/*
 * 这个类存在一个问题：当菜单对象内部使用的聚合方式改变时（比如由MenuItem[]数组改变为ArrayList时），
 * 或者当遍历的方式改变了（比如由顺序访问每一个元素改变为倒序访问每一元素时），这个类就要改变；
 * 也就是说这个类有两个可能的改变原因，这不符合“单一责任”原则。
 *
 * OO设计原则九——单一责任：
 * 一个类应该只有一个引起变化的原因。
 * 然而，区分设计中的责任，是最困难的事情之一。
 * 唯一的方法，就是要努力不懈地检查我们的设计，随时观察有没有迹象显示某个类改变的原因超出一个。
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

/*
 * OO迭代器模式——提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。
 */