package Implementation;

import LibraryCollection.Collection.ArrayIterator;
import LibraryCollection.Collection.ArrayOrderedList;
import LibraryCollection.Collection.Network;
import Enumerations.TypeBuildingEnum;
import LibraryCollection.Exceptions.ElementNotFoundException;
import LibraryCollection.Exceptions.EmptyCollectionException;
import Interfaces.IBuilding;
import Interfaces.ICompany;
import Interfaces.ISeller;

import java.util.BitSet;

public class Company implements ICompany {

    private Network<Building> buildingNetwork;

    private ArrayOrderedList<Seller> sellers;

    public Company() {
        this.buildingNetwork = new Network<>();
        this.sellers = new ArrayOrderedList<>();

    }

    public void addSeller(ISeller seller) throws EmptyCollectionException {
        if (seller == null) {
            throw new IllegalArgumentException("Seller can't be null");
        }
        this.sellers.add((Seller) seller);
    }

    public void removeSeller(ISeller seller) throws EmptyCollectionException {
        if (seller == null) {
            throw new IllegalArgumentException("Seller to remove can´t be null");
        }
        this.sellers.remove((Seller) seller);
    }

    public void addBuildingVertex(IBuilding building) {
        if (building == null) {
            throw new IllegalArgumentException("Building to add can´t be null");
        }

        if (building.getType().equals(TypeBuildingEnum.headquarters) && !existTypeBuilding(building)) {
            this.buildingNetwork.addVertex((Building) building);
        }
    }

    private boolean existTypeBuilding(IBuilding building) {
        for (IBuilding building1 : this.buildingNetwork.getVertices()) {
            if (building1.getType().equals(building.getType()))
                return true;
        }

        return false;
    }

    public Network<Building> getBuildingNetwork() {
        return buildingNetwork;
    }

    public ArrayOrderedList<Seller> getSellers() {
        return sellers;
    }

    @Override
    public String toString() {
        return "Company{" +
                "buildingNetwork=" + buildingNetwork +
                ", sellers=" + sellers +
                '}';
    }
}
