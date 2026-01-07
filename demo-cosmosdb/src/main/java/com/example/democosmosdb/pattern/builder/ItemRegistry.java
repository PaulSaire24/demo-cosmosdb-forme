package com.example.democosmosdb.pattern.builder;

public class ItemRegistry {

    public static void main(String[] args) {

       /* var item1 = new StoreItem(
                "Pretzel", 2.0, "A tasty snack", null, 7, null);*/

        var item11 = new StoreItem.BuilderStoreItem("Pretzel", 2.0)
                .shortDescription("A tasty snack")
                .stockAvailable(7)
                .build();

        /*var item2 = new StoreItem(
                "Soup", 1.5, null,
                "A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable",
                null, "Can");*/
        var item22 = new StoreItem.BuilderStoreItem("Soup", 1.5)
                .longDescription("A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable")
                .packagingType("Can")
                .build();

        Contractor contractor = new Contractor.Builder()
                                    .name("Paul")
                                    .lastName("Saire")
                                    .ega(27)
                                    .gender("M")
                                    .email("embre73@gmail.com")
                                            .build();
        System.out.println(contractor);

        addToItemRegistry(item11);
        addToItemRegistry(item22);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }

}
