/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryCollection.Interfaces;


import LibraryCollection.Exceptions.ElementNotFoundException;

/**
 *
 * @author 8160299 e 8180120
 * @param <T> tipo genérico
 */
public interface UnorderedListADT<T extends Object> extends ListADT<T> {

    /**
     * Adds an element to the front of the list
     *
     * @param element the element to be added to the list
     */
    public void addToFront(T element);

    /**
     * Adds an element to the rear of the list
     *
     * @param element the element to be added to the list
     */
    public void addToRear(T element);

    /**
     * Adds an element after a certain other element
     *
     * @param element the element to be added to the list
     * @param target the reference element, which the other element is added
     * after
     */
    public void addAfter(T element, T target) throws ElementNotFoundException;
}
