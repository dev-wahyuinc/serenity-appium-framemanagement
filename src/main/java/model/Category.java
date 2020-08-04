package model;

public enum  Category {
    PROMOTIONS("Promotions"),
    FreshProduct("Fresh Prorduct");

    private final String categoryText;

    Category(String promotions) {
        categoryText = promotions;
    }

    public String getString(){
        return categoryText;
    }
}
