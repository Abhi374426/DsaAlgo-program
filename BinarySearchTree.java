public class BinarySearchTree {
    public static void main(String[] args) {
        BST s1=new BST();
        s1.insert(10);
        s1.insert(20);
        s1.insert(30);
        s1.insert(40);
        s1.insert(50);
        s1.insert(60);
        s1.insert(70);
        s1.insert(80);
        s1.inorder();
        s1.delete(30);
        System.out.println();
        s1.inorder();
    }
}

/**
 * 
 */
class BST {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;
    }

    Boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        Node n = new Node();
        Node ptr = null;
        n.data = data;
        n.left = null;
        n.right = null;

        if (isEmpty()) {
            root = n;
        } else {
            ptr = root;
            while (ptr.data != n.data) {
                if (n.data < ptr.data) {
                    if (ptr.left != null) {
                        ptr = ptr.left;
                    } else {
                        ptr.left = n;
                        break;
                    }
                } else {
                    if (ptr.right != null) {
                        ptr = ptr.right;
                    } else {
                        ptr.right = n;
                        break;
                    }
                }
            }
        }
    }

    void postorderrec(Node ptr) {
        if (ptr != null) {
            postorderrec(ptr.left);
            postorderrec(ptr.right);
            System.out.println(" " + ptr.data);

        }
    }

    void postorder() {
        postorderrec(root);
    }

    void preorderrec(Node ptr) {
        if (ptr != null) {
            System.out.println(" " + ptr.data);
            preorderrec(ptr.left);
            preorderrec(ptr.right);
        }
    }

    void preorder() {
        preorderrec(root);
    }

    void inorderrec(Node ptr) {
        if (ptr != null) {
            inorderrec(ptr.left);
            System.out.print(" " + ptr.data);
            inorderrec(ptr.right);
        }
    }

    void inorder() {
        inorderrec(root);
    }

    Node search(int data) {
        Node ptr;
        ptr = root;
        while (ptr != null) {
            if (ptr.data == data) {
                return ptr;
            } else if (ptr.data > data) {
                ptr = ptr.left;
            } else {
                ptr = ptr.right;
            }
        }
        return null;
    }

    void delete(int data) {
        root = deleteNode(root, data);
    }

    Node deleteNode(Node ptr, int data) {
        if (ptr == null) {
            return null;
        }
        if (ptr.data > data) {
            ptr.left = deleteNode(ptr.left, data);
        } else if (ptr.data < data) {
            ptr.right = deleteNode(ptr.right, data);
        } else {
            if (ptr.left == null && ptr.right == null) {
                return null;
            }
            if (ptr.left == null) {
                return ptr.right;
            } else if (ptr.right == null) {
                return ptr.left;
            }

            Node predecessor = findPredecessor(ptr.left);
            ptr.data = predecessor.data;
            ptr.left = deleteNode(ptr.left, predecessor.data);
        }
        return ptr;
    }

    Node findPredecessor(Node node) {
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }
}
