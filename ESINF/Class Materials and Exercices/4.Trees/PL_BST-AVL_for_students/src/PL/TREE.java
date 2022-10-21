package PL;

import java.util.ArrayList;
import java.util.List;

/*
 * @author DEI-ESINF
 * @param <E>
 */

public class TREE<E extends Comparable<E>> extends BST<E>{

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
        return (node == null ? false : (node.getLeft() == null && node.getRight() == null));
    }

    /*
     * build a list with all elements of the tree. The elements in the
     * left subtree in ascending order and the elements in the right subtree
     * in descending order.
     *
     * @return    returns a list with the elements of the left subtree
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Node<E> copyRec(Node<E> node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the number of nodes by level.
     */
    public int[] numNodesByLevel() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void numNodesByLevel(Node<E> node, int[] result, int level) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    public boolean perfectBalanced() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    private boolean perfectBalanced(Node<E> node) {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E lowestCommonAncestor(E elem1, E elem2){

        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Node<E> lowestCommonAncestor(Node<E> node, E elem1, E elem2){

        throw new UnsupportedOperationException("Not supported yet.");
    }


    public BST<E>  minCompletSubtree(E elem1, E elem2){

        throw new UnsupportedOperationException("Not supported yet.");
    }


    public BST<E>  construcTreeposOrder (ArrayList<E> posOrder){

        throw new UnsupportedOperationException("Not supported yet.");
    }
}
