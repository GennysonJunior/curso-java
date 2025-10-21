import binaryArrayTree.BinaryArrayTree;
public class App {
    public static void main(String[] args) throws Exception {
        BinaryArrayTree<String> t = new BinaryArrayTree<>();
        /*
         *            a
         *           / \
         *          b  >c
        */          
        t.data("a").left("b").right("c").right();
        System.out.println(t);

        /*
         *             a
         *            / \
         *           b   c
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
         *           b  >c
         *              / \
         *             d   e
         */
        System.out.println(t);

        BinaryArrayTree<Integer> n = t.<Integer>map(s -> 2);
        System.out.println(n);
    }
}