import binaryArrayTree.BinaryArrayTree;
public class App {
    public static void main(String[] args) throws Exception {
        BinaryArrayTree<String> t = new BinaryArrayTree<>();
        /*
         *            a
         *           / \
         *          c  >b
        */          
        t.init("a").left("c").right("b").right();
        System.out.println(t);

        /*
         *             a
         *            / \
         *           c   b
         *              / \
         *            >d   e
         */
        t.left("d").right("e").left();
        System.out.println(t);

        System.out.println(t.data());

        t.back();
        /*
         *             a
         *            / \
         *           c  >b
         *              / \
         *             d   e
         */
        System.out.println(t);

        t.remove("a");
        System.out.println(t);

        /*
         *           d
         *          / \
         *         c  >b
         *              \
         *               e
        */
    }
}