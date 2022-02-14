package Main;

import Enumerations.TypeBuildingEnum;
import Implementation.Building;
import Implementation.Company;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();
        Building building = new Building(TypeBuildingEnum.headquarters);

        //company.addBuildingVertex(building);


            System.out.println(company.getBuildingNetwork().getVertices().length);



    }
}
