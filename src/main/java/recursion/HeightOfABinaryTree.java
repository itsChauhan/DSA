package recursion;

import javax.swing.plaf.ProgressBarUI;

public class HeightOfABinaryTree {

    public static int getHeightOfABinaryTree(Tree root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        return Math.max(getHeightOfABinaryTree(root.left), getHeightOfABinaryTree(root.right))+1;

    }

    public static void main(String[] args) {
        Tree tree = new Tree(10);
        tree.left = new Tree(11);
        tree.right = new Tree(12);
        tree.left.left = new Tree(5);
        tree.left.left.left = new Tree(15);

        System.out.println(getHeightOfABinaryTree(tree));


    }



}




