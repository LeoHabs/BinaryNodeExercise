public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree =new BinaryTree<>();
        tree.add(10);
        tree.add(7);
        tree.add(20);
        tree.add(4);
        tree.add(50);
        tree.add(50);
        tree.add(1);
        System.out.println(tree.max());
        System.out.println(tree.min());
    }
}