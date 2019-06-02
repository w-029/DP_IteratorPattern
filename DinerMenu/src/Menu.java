/**
 * Menu接口是为了统一不同菜单的类型，
 * 这样Waitress在使用菜单时就可以针对统一的Menu接口，而不是具体的实现类
 */
public interface Menu {
    public Iterator createIterator();
}
