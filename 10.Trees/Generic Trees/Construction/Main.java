import java.util.*;

//topic:  How Tree is being made in Java 
class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    // constructor
    public TreeNode() {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class Main {

    // function to construct a Tree
    public static TreeNode constructTree(int[] dataArray) {

        // Since TreeNodes will be maintained in stack
        Stack<TreeNode> st = new Stack<>();
        TreeNode root = null;

        for (int i = 0; i < dataArray.length; i++) {

            // if -1 comes that means you have to pop
            if (dataArray[i] == -1) {
                st.pop();
            } else {
                // if not -1 , it means you have to add then make a new TreeNode now
                TreeNode newnode = new TreeNode(dataArray[i]);

                // if currently the stack size is 0 , that means it is the root element
                if (st.size() == 0) {
                    root = newnode;
                } else {
                    st.peek().children.add(newnode);
                }

            }

        }
        return root;

    }

    // topic : Display

    public static void displayTree(TreeNode root) {

        System.out.println(root.data + "->");

        // root children
        for (TreeNode child : root.children) {
            System.out.println(child.data + " , ");
        }

        // // for loop
        // for (int i = 0; i < root.children.size(); i++) {
        // displayTree(root.children.get(i));
        // }

        System.out.println();

        for (TreeNode child : root.children) {
            displayTree(child);
        }

    }

    // topic : SIZE

    public static int getSize(TreeNode root) {

        int totalSize = 0;

        for (TreeNode child : root.children) {
            totalSize = totalSize + getSize(child);
        }

        return totalSize + 1;

    }

    // topic: MAXIMUM OF TREE




    //topic : MINIMUM OF TREE 




    //topic : HEIGHT of TREE (Height in terms of Node and Edges)


    



    public static void main(String... args) {

        int[] dataArray = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, -1, 40, 80, -1, 90, 110, -1, 120, -1, -1, 100, -1,
                -1, -1 };

        TreeNode root = constructTree(dataArray);

        displayTree(root);
    }

}
