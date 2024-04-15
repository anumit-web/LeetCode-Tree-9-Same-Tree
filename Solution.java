/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Base case: if both trees are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q == null) return true;

        // If only one tree is null or the values are different, they are not identical
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Recursively check if the left and right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

}
