package recursion;


public class Tree {
    recursion.Tree left;
    recursion.Tree right;
    int value;


    Tree(int value, recursion.Tree left, recursion.Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    Tree(int value) {
        this(value, null, null);
    }
}
