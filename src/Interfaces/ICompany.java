package Interfaces;

import LibraryCollection.Collection.ArrayOrderedList;
import LibraryCollection.Collection.Network;
import LibraryCollection.Exceptions.EmptyCollectionException;
import Implementation.Building;
import Implementation.Seller;

public interface ICompany {

    Network<Building> getBuildingNetwork();

    void addSeller(ISeller seller) throws EmptyCollectionException;

    void removeSeller(ISeller seller) throws  EmptyCollectionException;

    void addBuildingVertex(IBuilding building);

    String toString();
}
