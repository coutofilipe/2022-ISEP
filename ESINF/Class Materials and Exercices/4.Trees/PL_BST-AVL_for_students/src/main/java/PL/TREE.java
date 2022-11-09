package PL;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <E>
 * @author DEI-ESINF
 */

public class TREE<E extends Comparable<E>> extends BST<E> {

    /**
     * @param element A valid element within the tree
     * @return true if the element exists in tree false otherwise
     */
    public boolean contains(E element) {
        if (element == null) return false;
        else {
            return find(root(), element) != null;
        }
    }


    public boolean isLeaf(E element) {
        if (element == null) return false;
        Node<E> node = find(root(), element);
        return (node != null && (node.getLeft() == null && node.getRight() == null));
    }

    /**
     * build a list with all elements of the tree. The elements in the
     * left subtree in ascending order and the elements in the right subtree
     * in descending order.
     *
     * @return returns a list with the elements of the left subtree
     * in ascending order and the elements in the right subtree is descending order.
     */
    public Iterable<E> ascdes() {
        List<E> arrayList = new ArrayList<>();
        if (root() != null) {
            ascSubtree(root().getLeft(), arrayList);
            arrayList.add(root().getElement());
            desSubtree(root().getRight(), arrayList);
        }
        return arrayList;
    }

    private void ascSubtree(Node<E> node, List<E> snapshot) {
        // In-order crescente
        if (node != null) {
            ascSubtree(node.getLeft(), snapshot);
            snapshot.add(node.getElement());
            desSubtree(node.getRight(), snapshot);
        }
    }


    private void desSubtree(Node<E> node, List<E> snapshot) {
        // In-order decrescente
        if (node != null) {
            desSubtree(node.getRight(), snapshot);
            snapshot.add(node.getElement());
            desSubtree(node.getLeft(), snapshot);
        }
    }

    /**
     * returns a new binary search tree, identical to the original, but
     * without the leaves.
     *
     * @return tree without leaves
     */
    public BST<E> autumnTree() {
        TREE<E> t = new TREE<>();
        t.root = autumnTree(root());
        return t;
    }

    private Node<E> autumnTree(Node<E> node) {
        if (node == null) return null;
        if (node.getLeft() == null && node.getRight() == null) { // leaf node
            return null;
        }

        return new Node<>(node.getElement(), autumnTree(node.getLeft()), autumnTree(node.getRight()));
    }

    /**
     * @return the number of nodes by level.
     */
    public int[] numNodesByLevel() {
        int dimension = height(root()) + 1;
        int[] numNodes = new int[dimension];
        numNodesByLevel(root, numNodes, 0);
        return numNodes;
    }

    private void numNodesByLevel(Node<E> node, int[] result, int level) {
        if (node == null) return;
        result[level] += 1;
        numNodesByLevel(node.getRight(), result, level + 1);
        numNodesByLevel(node.getLeft(), result, level + 1);
    }

    public boolean perfectBalanced() {
        return perfectBalanced(root());
    }

    private boolean perfectBalanced(Node<E> node) {
        if (node == null) return true;
        if (height(node.getLeft()) != height(node.getRight())) return false;
        if (!perfectBalanced(node.getLeft())) return true;
        return perfectBalanced(node.getRight());
    }

    public E lowestCommonAncestor(E elem1, E elem2) {

        // ver qual é o nó que tem o elem 2 à direita e o elem1 à esquerda
        throw new UnsupportedOperationException("Not supported yet.");

    }

    private Node<E> lowestCommonAncestor(Node<E> node, E elem1, E elem2) {

        throw new UnsupportedOperationException("Not supported yet.");
    }


    public BST<E> minCompletSubtree(E elem1, E elem2) {
        // usar o método minimo ancestral comumn para encontrar a root da novas sub-arvore;
        // usar a travessia em por niveis passando essa root EXAME!!!!!

        throw new UnsupportedOperationException("Not supported yet.");

    }


    public BST<E> construcTreeposOrder(ArrayList<E> posOrder) {

        throw new UnsupportedOperationException("Not supported yet.");
    }
}
