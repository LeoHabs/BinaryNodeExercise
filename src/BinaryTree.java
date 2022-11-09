public class BinaryTree<T> {
    Node root;

    public void add(Integer value) {
        if (root == null) {
            root = new Node<T>(value);
            return;
        }
        Node currentNode = root;

        while (true) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = new Node<>(value);
                    break;
                }
                currentNode = currentNode.left;
                continue;
            }
            if (currentNode.right == null) {
                currentNode.right = new Node<>(value);
                break;
            }
            currentNode = currentNode.right;
        }
    }

    public Integer max() {
        Node<Integer> currentNode = root;
        if (root == null || root.right == null) {
            root = new Node<T>(0);
            return root.value;
        }
        while (currentNode.right != null) {
            currentNode = currentNode.right;
        }
        return currentNode.value;
    }


    public Integer min() {
        Node<Integer> currentNode = root;
        if (root == null || root.left == null) {
            root = new Node<T>(0);
            return root.value;
        }
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
    
}



