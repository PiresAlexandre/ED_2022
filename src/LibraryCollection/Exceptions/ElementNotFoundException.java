/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryCollection.Exceptions;

/**
 *
 * @author 8160299 e 8180120
 */
public class ElementNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>ElementNotFoundException</code> without
     * detail message.
     */
    public ElementNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ElementNotFoundException</code> with the
     * specified detail message.
     *
     * @param message the detail message.
     */
    public ElementNotFoundException(String message) {
        super(message);
    }

}
