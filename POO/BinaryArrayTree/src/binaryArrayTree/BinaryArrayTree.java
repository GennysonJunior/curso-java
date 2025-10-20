package binaryArrayTree;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class BinaryArrayTree<T> {
    private No<T>[] tree = new No[1];
    private int indexNode = 0;
    private int size = 1;
    private int capacity = 1;

    public BinaryArrayTree(T data) {
        this.tree[0] = new No<T>();
        this.tree[0].data = data;
        this.tree[0].parent = -1;
        this.tree[0].left = -1;
        this.tree[0].right = -1;
    }

    public BinaryArrayTree() {
        this.tree[0] = new No<T>();
        this.tree[0].parent = -1;
        this.tree[0].left = -1;
        this.tree[0].right = -1;
    }

    private void garanteEspaco() {
        if (this.size >= this.capacity) {
            this.capacity *= 2;
            No<T>[] newTree = new No[capacity];
            for (int i = 0; i < size; i++) {
                newTree[i] = tree[i];
            }
            tree = newTree;
        }
    }

    public No<T>[] array() {
        return Arrays.copyOfRange(this.tree, 0, this.size);
    }

    public BinaryArrayTree<T> data(T data) {
        this.tree[this.indexNode].data = data;
        return this;
    }

    public T data() {
        return this.tree[this.indexNode].data;
    }

    public BinaryArrayTree<T> back() throws BinaryArrayTreeError {
        if (this.tree[this.indexNode].parent != -1) this.indexNode = this.tree[this.indexNode].parent;
        else throw new BinaryArrayTreeError("Não existe 'No' a cima do 'No' raiz!");
        return this;
    }

    public BinaryArrayTree<T> left(T data) {
        this.garanteEspaco();
        this.tree[this.size] = new No<T>();
        this.tree[this.size].data = data;
        this.tree[this.size].left = -1;
        this.tree[this.size].right = -1;
        this.tree[this.size].parent = this.indexNode;

        this.tree[this.indexNode].left = size;
        size++;

        return this;
    }

    public BinaryArrayTree<T> right(T data) {
        this.garanteEspaco();
        this.tree[this.size] = new No<T>();
        this.tree[this.size].data = data;
        this.tree[this.size].left = -1;
        this.tree[this.size].right = -1;
        this.tree[this.size].parent = this.indexNode;

        this.tree[this.indexNode].right = size;
        size++;

        return this;
    }

    public BinaryArrayTree<T> left() throws BinaryArrayTreeError {
        if (this.tree[this.indexNode].left != -1) this.indexNode = this.tree[this.indexNode].left;
        else throw new BinaryArrayTreeError("Não existe 'No' em 'left'!");
        return this;
    }

    public BinaryArrayTree<T> right() throws BinaryArrayTreeError {
        if (this.tree[this.indexNode].right != -1) this.indexNode = this.tree[this.indexNode].right;
        else throw new BinaryArrayTreeError("Não existe 'No' em 'right'!");
        return this;
    }

    public boolean contains(T value) {
        boolean res = false;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(this.tree[i].data, value)) {
                res = true;
                break;
            }
        }
        return res;
    }

    public boolean where(Predicate<T> pred) {
        boolean res = false;
        for (int i = 0; i < size; i++) {
            if (pred.test(this.tree[i].data)) {
                res = true;
            }
        }

        return res;
    }

    @Override
    public String toString() {
        String res = "{";
        for (int i = 0; i < this.size; i++) {
            if (i < this.size - 1) res += ((i == this.indexNode) ? "> " : "") + "(data: " + this.tree[i].data + ", left: " + this.tree[i].left + ", right: " + this.tree[i].right + "),\n";
            else if (i == this.size - 1) res += ((i == this.indexNode) ? "> " : "") + "(data: " + this.tree[i].data + ", left: " + this.tree[i].left + ", right: " + this.tree[i].right + ")}";
        }

        return res;
    }
}