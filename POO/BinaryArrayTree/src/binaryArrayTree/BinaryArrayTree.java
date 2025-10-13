package binaryArrayTree;

import java.util.function.Predicate;

public class BinaryArrayTree<T> {
    private No<T>[] tree = new No[1];
    private int indexNode = 0;

    public BinaryArrayTree(T data) {
        this.tree[0] = new No<T>();
        this.tree[0].data = data;
        this.tree[0].left = 0;
        this.tree[0].right = 0;
    }

    public BinaryArrayTree() {
        this.tree[0] = new No<T>();
        this.tree[0].left = 0;
        this.tree[0].right = 0;
    }

    public No<T>[] array() {
        return this.tree;
    }

    public BinaryArrayTree<T> data(T data) {
        this.tree[this.indexNode].data = data;
        return this;
    }

    public T data() {
        return this.tree[this.indexNode].data;
    }

    public BinaryArrayTree<T> back() {
        for (int i = 0; i < this.tree.length; i++) if (this.tree[i].left == this.indexNode || this.tree[i].right == this.indexNode) {
            this.indexNode = i;
            break;
        }

        return this;
    }

    public BinaryArrayTree<T> left(T data) {
        No<T>[] newTree = new No[this.tree.length + 1];
        int cont = 0;
        for (No<T> n : this.tree) {
            newTree[cont] = new No<T>();
            newTree[cont].data = n.data;
            newTree[cont].left = n.left;
            newTree[cont].right = n.right;
            cont++;
        }
        newTree[cont] = new No<T>();
        newTree[cont].data = data;
        newTree[cont].left = 0;
        newTree[cont].right = 0;

        this.tree = newTree;
        this.tree[this.indexNode].left = cont;

        return this;
    }

    public BinaryArrayTree<T> right(T data) {
        No<T>[] newTree = new No[this.tree.length + 1];
        int cont = 0;
        for (No<T> n : this.tree) {
            newTree[cont] = new No<T>();
            newTree[cont].data = n.data;
            newTree[cont].left = n.left;
            newTree[cont].right = n.right;
            cont++;
        }
        newTree[cont] = new No<T>();
        newTree[cont].data = data;
        newTree[cont].left = 0;
        newTree[cont].right = 0;

        this.tree = newTree;
        this.tree[this.indexNode].right = cont;

        return this;
    }

    public BinaryArrayTree<T> left() {
        this.indexNode = this.tree[this.indexNode].left;
        return this;
    }

    public BinaryArrayTree<T> right() {
        this.indexNode = this.tree[this.indexNode].right;
        return this;
    }

    public boolean contains(T value) {
        boolean res = false;
        for (No<T> n : this.tree) {
            if (n.data == value) {
                res = true;
                break;
            }
        }
        return res;
    }

    public boolean where(Predicate<T> pred) {
        boolean res = false;
        for (No<T> n : this.tree) {
            if (pred.test(n.data)) {
                res = true;
            }
        }

        return res;
    }

    @Override
    public String toString() {
        String res = "{";
        for (int i = 0; i < this.tree.length; i++) {
            if (i < this.tree.length - 1) res += ((i == this.indexNode) ? "> " : "") + "(data: " + this.tree[i].data + ", left: " + this.tree[i].left + ", right: " + this.tree[i].right + "),\n";
            else res += ((i == this.indexNode) ? "> " : "") + "(data: " + this.tree[i].data + ", left: " + this.tree[i].left + ", right: " + this.tree[i].right + ")}";
        }

        return res;
    }
}