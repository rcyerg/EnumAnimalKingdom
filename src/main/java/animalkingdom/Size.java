package animalkingdom;

public enum Size {
    BELOWAVERAGE("Below Average"), AVERAGESIZE("Average"), ABOVEAVERAGE("Above Average");


    private final String sizeDescription;

    Size(String size) {
        this.sizeDescription = size;
    }

    public String getSize() {
        return sizeDescription;
    }
}
