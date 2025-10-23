package binaryArrayTree;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class BinaryArrayTree<T> {
    @SuppressWarnings("unchecked")
    private No<T>[] tree = new No[1];
    private int indexNode = 0;
    private int size;
    private int capacity = 1;

    public BinaryArrayTree(T data) {
        this.tree[0] = new No<T>();
        this.tree[0].data = data;
        this.tree[0].parent = -1;
        this.tree[0].left = -1;
        this.tree[0].right = -1;
        this.size = 1;
    }

    public BinaryArrayTree() {
        this.size = 0;
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

    public BinaryArrayTree<T> root() {
        this.indexNode = 0;
        return this;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        this.tree = new No[1];
        this.size = 0;
        this.capacity = 1;
        this.indexNode = 0;
    }

    public BinaryArrayTree<T> remove(T value) throws BinaryArrayTreeError {
    for (int i = 0; i < this.size; i++) {
        if (Objects.equals(tree[i].data, value)) {
            removeNode(i);
        }
    }
    return this;
    }

    public BinaryArrayTree<T> remove() throws BinaryArrayTreeError {
        removeNode(this.indexNode);
        return this;
    }

    public BinaryArrayTree<T> removeIf(Predicate<T> pred) throws BinaryArrayTreeError {
        for (No<T> x : this.tree) if (x != null && x.data != null && pred.test(x.data)) this.remove(x.data);
        return this;
    }

    private void removeNode(int index) throws BinaryArrayTreeError {
        No<T> node = tree[index];
        if (node == null || node.data == null) throw new BinaryArrayTreeError("Nó inexistente ou já removido!");

        // Verifica se tem filhos
        boolean temEsq = node.left != -1 && tree[node.left] != null && tree[node.left].data != null;
        boolean temDir = node.right != -1 && tree[node.right] != null && tree[node.right].data != null;

        // Caso 1: Nó é folha
        if (!temEsq && !temDir) {
            if (node.parent != -1) {
                No<T> pai = tree[node.parent];
                if (pai.left == index) pai.left = -1;
                else if (pai.right == index) pai.right = -1;
            }
            node.data = null;
        }
        // Caso 2: Nó tem apenas um filho
        else if (temEsq ^ temDir) {
            int filho = temEsq ? node.left : node.right;
            No<T> pai = node.parent != -1 ? tree[node.parent] : null;

            if (pai != null) {
                if (pai.left == index) pai.left = filho;
                else if (pai.right == index) pai.right = filho;
            }
            tree[filho].parent = node.parent;

            node.data = null;
            node.left = -1;
            node.right = -1;
        }
        // Caso 3: Nó tem dois filhos
        else {
            // Estratégia: substituir pelo menor nó da subárvore direita (in-order successor)
            int sucessor = node.right;
            while (tree[sucessor].left != -1 && tree[tree[sucessor].left].data != null) {
                sucessor = tree[sucessor].left;
            }

            // Substitui dados
            node.data = tree[sucessor].data;

            // Remove recursivamente o sucessor
            removeNode(sucessor);
        }
    }

    private void garanteEspaco() {
        if (this.size >= this.capacity) {
            this.capacity *= 2;
            @SuppressWarnings("unchecked")
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

    public BinaryArrayTree<T> init(T data) {
        if (this.tree[this.indexNode] != null) this.tree[this.indexNode].data = data;
        else {
            this.tree[this.indexNode] = new No<T>();
            this.tree[this.indexNode].data = data;
            this.tree[this.indexNode].parent = -1;
            this.tree[this.indexNode].left = -1;
            this.tree[this.indexNode].right = -1;
            this.size++;
        }
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

    public BinaryArrayTree<T> left(T data) throws BinaryArrayTreeError {
        if (this.tree[this.indexNode].left != -1) throw new BinaryArrayTreeError("O nó já possui filho à esquerda!");
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

    public BinaryArrayTree<T> right(T data) throws BinaryArrayTreeError {
        if (this.tree[this.indexNode].right != -1) throw new BinaryArrayTreeError("O nó já possui filho à direita!");
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
    
    public <R> BinaryArrayTree<R> map(Function<T, R> act) {
        @SuppressWarnings("unchecked")
        No<R>[] newNo = new No[this.size];
        for (int i = 0; i < this.size; i++) {
            newNo[i] = new No<R>();
            newNo[i].data = act.apply(this.tree[i].data);
            newNo[i].left = this.tree[i].left;
            newNo[i].right = this.tree[i].right;
            newNo[i].parent = this.tree[i].parent;
        }
        BinaryArrayTree<R> newTree = new BinaryArrayTree<R>(newNo, this.indexNode, this.size, this.size);
        return newTree;
    }

    public BinaryArrayTree<T> forEach(Function<T, T> act) {
        for (int i = 0; i < this.size; i++) {
            this.tree[i].data = act.apply(this.tree[i].data);
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