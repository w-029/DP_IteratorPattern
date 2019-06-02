/*
 * 这个接口对外提供统一的遍历方法，
 * 它可以隐藏菜单的内部实现（无论是数组、堆栈、列表、散列表）；
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}
