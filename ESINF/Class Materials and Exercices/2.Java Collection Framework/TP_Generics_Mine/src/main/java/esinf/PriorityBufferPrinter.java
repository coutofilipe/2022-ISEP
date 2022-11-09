/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import java.util.*;

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

/*
    /**
     * Swaps two vector positions                  O(1)
     * /
    public static <E> void swap(ArrayList[] v, int i, int j) {

        ArrayList temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
*/

    /**
     * Calculates the size occupied by the docs in the buffer
     *
     * @return size occupied
     */
    private Integer usedSize(ArrayList<E> buffer) {
        int size = 0;
        for (Document document : buffer) {
            size += document.getSize();
        }
        return size;
    }

    /**
     * Adds a document to the buffer.Documents are added using a numeric priority system, being FIFO when priorities are equal.
     *
     * @param doc the document to be added to the buffer
     * @return true if the buffer has space, false otherwise
     */
    public Boolean addDocument(E doc) {
        if (maxSize < doc.getSize() + usedSize(buffer)) return false;
        buffer.add(doc);
        Collections.sort(buffer);
        return true;
    }

    /**
     * Gets the next document in the queue.
     *
     * @return The next document in the queue
     */
    public E getDocument() {
        Collections.sort(buffer);
        return buffer.remove(buffer.size() - 1);
    }

    /**
     * Deletes a document from the buffer (if it exists), given a name and an author
     *
     * @param name   the name of the Document
     * @param author the author of the Document
     * @return true if the document existed, false otherwise
     */
    public Boolean delDocument(String name, String author) {
        for (E doc : buffer) {
            if (doc.getName().equals(name) && doc.getAuthor().equals(author)) {
                buffer.remove(doc);
                return true;
            }
        }
        return false;
    }

    /**
     * Deletes all the documents which are superior to a given size
     *
     * @param size the size above which documents will be deleted
     * @return true if there is at least one Document size
     */
    public Boolean delDocumentsAboveSize(Integer size) {
        boolean flag = false;
        Iterator<E> iterator = buffer.iterator();
        while (iterator.hasNext()) {
            E doc = iterator.next();
            if (doc.getSize() >= size) {
                flag = true;
                iterator.remove();
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Buffer: " + buffer + " Max size = " + maxSize;
    }

    @Override
    public Iterator<E> iterator() {
        return buffer.iterator();
    }

}
