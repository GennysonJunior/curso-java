package binaryArrayTree;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class BinaryArrayTree<T> {
    private No<T>[] tree = (No<T>[]) new No<?>[1];
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

    private BinaryArrayTree(No<T>[] newTree, int newIndexNode, int newSize, int newCapacity) {
        this.tree = newTree;
        this.indexNode = newIndexNode;
        this.size = newSize;
        this.capacity = newCapacity;
    }

    public void node(int value) throws BinaryArrayTreeError {
        if (value >= 0 && value < size) this.indexNode = value;
        else throw new BinaryArrayTreeError("Valor está fora do rage 0 - " + (size - 1));
    }

    public int node(){
        return this.indexNode;
    }

    private void garanteEspaco() {
        if (this.size >= this.capacity) {
            this.capacity *= 2;
            No<T>[] newTree = new No[capacity];
            for (int i = 0; i < size; i++) {
                newTree[i] = tree[i];
            }
            this.tree = newTree;
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
    
    public <R> BinaryArrayTree<R> map(Function<T, R> pred) {
        No<R>[] newNo = new No[this.size];
        for (int i = 0; i < this.size; i++) {
            newNo[i] = new No<R>();
            newNo[i].data = pred.apply(this.tree[i].data);
            newNo[i].left = this.tree[i].left;
            newNo[i].right = this.tree[i].right;
            newNo[i].parent = this.tree[i].parent;
        }
        BinaryArrayTree<R> newTree = new BinaryArrayTree<R>(newNo, this.indexNode, this.size, this.size);
        return newTree;
    }

    public BinaryArrayTree<T> forEach(Function<T, T> pred) {
        for (int i = 0; i < this.size; i++) {
            this.tree[i].data = pred.apply(this.tree[i].data);
        }
        return this;
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