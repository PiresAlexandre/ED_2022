package Interfaces;

import LibraryCollection.Collection.ArrayOrderedList;
import Enumerations.TypeBuildingEnum;

public interface IBuilding {
    String getName();
    TypeBuildingEnum getType();

    ArrayOrderedList<IProduct> getProducts();

}
