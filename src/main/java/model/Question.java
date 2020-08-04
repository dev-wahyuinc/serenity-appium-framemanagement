package model;

public enum Question {
    NO_STORE_AROUND_YOU("There are no stores around you"),
    THIS_IS_YOUR_LOCATION("Are you sure?");

    private final String questionText;
    Question(String s) {
        questionText = s;
    }

    public String getString(){
        return this.questionText;
    }


}
