/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * @param <E> Generic type of buffer element
 * @author DEI-ISEP
 */
public class PriorityBufferPrinter<E extends Document> implements Iterable<E> {

    private final ArrayList<E> buffer;
    private final Integer maxSize;

    /**
     * Creates a new PriorityBufferPrinter with a maximum buffer size maxSize
     *
     * @param maxSize maximum buffer size
     */
    public PriorityBufferPrinter(Integer maxSize) {
        buffer = new ArrayList<>(); // Diamond notation: the type can be inferred by the compiler
        this.maxSize = maxSize;
    }

    /**
     * Swaps two vector positions                  O(1)
     */
    public static <E> void swap(List[] v, int i, int j) {

        List temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    /**
     * Calculates the size occupied by the docs in the buffer
     *
     * @return size occupied
     */

    private Integer usedSize(ArrayList<E> buffer) {
        return buffer.size();
    }

    /**
     * Adds a document to the buffer.Documents are added using a numeric priority system (lower number => higher priority),
     * being FIFO when priorities are equal.
     *
     * @param doc the document to be added to the buffer
     * @return true if the buffer has space, false otherwise
     */
    public Boolean addDocument(E doc) {
        if (usedSize(buffer) == maxSize) return false;
        if (usedSize(buffer) <= doc.getSize()) {
            // se tiver espaço adicionar o doc ao buffer considerando as prioridades;
            Collections.sort(buffer);
            for (int i = 0; i < buffer.size() - 1; i++) {
                if (doc.getPriority() < buffer.get(i).getPriority()) {
                    swap(buffer, doc.getPriority(), buffer.get(i).getPriority());
                    buffer.add(doc);
                }
            }

        }
        return true;
    }

    /**
     * Gets the next document in the queue.
     *
     * @return The next document in the queue
     */
    public E getDocument() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Deletes a document from the buffer (if it exists), given a name and an author
     *
     * @param name   the name of the Document
     * @param author the author of the Document
     * @return true if the document existed, false otherwise
     */
    public Boolean delDocument(String name, String author) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Deletes all the documents which are superior to a given size
     *
     * @param size the size above which documents will be deleted
     * @return true if there is at least one Document size
     */
    public Boolean delDocumentsAbove(Integer size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<E> iterator() {
        return buffer.iterator();
    }

}
