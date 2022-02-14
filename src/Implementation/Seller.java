package Implementation;

import LibraryCollection.Collection.ArrayOrderedList;
import LibraryCollection.Collection.ArrayUnorderedList;
import LibraryCollection.Exceptions.EmptyCollectionException;
import Interfaces.ISeller;

public class Seller  implements ISeller {
    private static  int countID;

    private int ID, capacity;

    private String name, product;

    private ArrayOrderedList<Building> buildings;

    public Seller(int capacity, String name, String product) {
        this.capacity = capacity;
        this.ID = countID++;
        this.name = "Vendedor " + this.ID;
        this.product = product;
        this.buildings = new ArrayOrderedList <>();
    }

    public int getID() {
        return ID;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setProduct(String product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "Seller{" +
                "ID=" + ID +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}
