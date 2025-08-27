class TNode {
    int data;
    TNode left, right;

    TNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Tree {
    TNode root;

    Tree() {
        root = null;
    }

    public void preorder(TNode node) {
        if(node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(TNode node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void postorder(TNode node) {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class TreeExample {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TNode(1);
        tree.root.left = new TNode(2);
        tree.root.right = new TNode(3);
        tree.root.left.left = new TNode(4);
        tree.root.left.right = new TNode(5);
        System.out.println("Preorder : ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("InOrder : ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("PostOrder : ");
        tree.postorder(tree.root);
        System.out.println();
    }
}

/* Tree Structure
             1
            / \
           2   3
          / \
         4   5
*/