package com.pluralsight;

import java.util.ArrayList;

public class AbstractAssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My house", "2020-01-01", 300000, "123 Maple Street", 1, 2000, 5000));
        assets.add(new House("Vacation home", "2018-05-20", 250000, "456 Oak Avenue", 2, 1500, 4000));
        assets.add(new Vehicle("Tom's truck", "2015-08-15", 25000, "Ford F-150", 2015, 120000));
        assets.add(new Vehicle("Family car", "2020-07-30", 20000, "Honda Civic", 2020, 30000));
        assets.add(new Cash("Hidden cash", "2022-02-14", 5000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
                System.out.println("Condition: " + house.getCondition());
                System.out.println("Square Foot: " + house.getSquareFoot());
                System.out.println("Lot Size: " + house.getLotSize());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Odometer: " + vehicle.getOdometer());
            }
            System.out.println();
        }
    }
}
