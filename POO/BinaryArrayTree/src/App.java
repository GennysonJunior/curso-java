import binaryArrayTree.BinaryArrayTree;
public class App {
    public static void main(String[] args) throws Exception {
        BinaryArrayTree<String> t = new BinaryArrayTree<>();
        /*
         *            a
         *           / \
         *          b  >c
        */          
        t.data("a");
        t.left("b");
        t.right("c");
        t.right();
        System.out.println(t);

        /*
         *             a
         *            / \
         *           b   c
         *              / \
         *            >d   e
         */
        t.left("d");
        t.right("e");
        t.left();
        System.out.println(t);

        System.out.println(t.data());

        t.back();
        /*
         *             a
         *            / \
         *           b  >c
         *              / \
         *             d   e
         */
        System.out.println(t);

    }
}