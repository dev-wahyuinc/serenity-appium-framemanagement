package model;

public enum ProductSortOption {
    ATOZ("A - Z"),
    POPULARITY("Popularity"),
    PROMOFIRST("Promotions First"),
    LOWEST("Lowest Unit Price");


    final private String option;

    ProductSortOption(String s) {
        option = s;
    }

    public String getString(){
        return option;
    }
}
