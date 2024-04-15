/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // A binary tree's maximum depth is the number of nodes along the 
        // longest path from the root node down to the farthest leaf node.

        System.out.println("Same Tree");
        System.out.println("");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();
        TreeNode root1 = tree1.getTree();

        BuildTree1 tree2 = new BuildTree1();
        TreeNode root2 = tree1.getTree();

        boolean are_they_both_same_tree = solution.isSameTree(root1, root2);
        
        System.out.println("Output true or false = (Same Tree) = " + are_they_both_same_tree); // how to print tree

    }

}
