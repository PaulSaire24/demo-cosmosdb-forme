package com.example.democosmosdb.pattern.builder;

public class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    public StoreItem(BuilderStoreItem builderStoreItem) {
        this.name = builderStoreItem.name;
        this.price = builderStoreItem.price;
        this.shortDescription = builderStoreItem.shortDescription;
        this.longDescription = builderStoreItem.longDescription;
        this.stockAvailable = builderStoreItem.stockAvailable;
        this.packagingType = builderStoreItem.packagingType;
        if (builderStoreItem.name == null || builderStoreItem.price == null) {
            throw new IllegalArgumentException("Name and price must not be null");
        }
    }

    public static class BuilderStoreItem {
        private  String name;
        private  Double price;
        private  String shortDescription;
        private  String longDescription;
        private  Integer stockAvailable;
        private  String packagingType;

        public BuilderStoreItem(String name, Double price) {
            this.name = name;
            this.price = price;
            if (name == null || price == null) {
                throw new IllegalArgumentException("Name and price must not be null");
            }
        }

        public BuilderStoreItem shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public BuilderStoreItem longDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }
        public BuilderStoreItem stockAvailable(Integer stockAvailable) {
            this.stockAvailable = stockAvailable;
            return this;
        }
        public BuilderStoreItem packagingType(String packagingType) {
            this.packagingType = packagingType;
            return this;
        }

        public StoreItem build() {
            return new StoreItem(this);
        }

    }


    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }
}
