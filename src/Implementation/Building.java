package Implementation;

import LibraryCollection.Collection.ArrayOrderedList;
import Enumerations.TypeBuildingEnum;
import Interfaces.IBuilding;
import Interfaces.IProduct;

public class Building implements IBuilding {
    private static int countID = 0;

    private int ID;
    private String name;
    private TypeBuildingEnum type;
    private ArrayOrderedList<IProduct> products;

    public Building(TypeBuildingEnum type) {
        this.type = type;
        if (type.equals(TypeBuildingEnum.market)) {
            this.ID = countID++;
            this.name = TypeBuildingEnum.market.name() + " " + this.ID;
        }else{
            this.name = "Empresa";
        }
        products = new ArrayOrderedList<>();
    }

    public String getName() {
        return name;
    }

    public TypeBuildingEnum getType() {
        return type;
    }

    public ArrayOrderedList<IProduct> getProducts() {
        return products;
    }

    public boolean addProduct(IProduct product){
        if(this.type.equals(TypeBuildingEnum.market) && product instanceof SpecifiedProduct){
            products.add(product);
            return true;
        }

        if(this.type.equals(TypeBuildingEnum.headquarters) && !(product instanceof SpecifiedProduct)){
            products.add(product);
            return true;
        }

        return false;
    }


}
