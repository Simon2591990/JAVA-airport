package plane;

public enum PlaneType {

    BOEING747(200, 300),
    BOEING737(100, 200),
    AIRBUSA330(240, 600),
    AIRBUSA320(200, 300);


    private final int capacity;
    private final int weightLimit;

    PlaneType(int capacity, int weightLimit) {
        this.capacity = capacity;
        this.weightLimit = weightLimit;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeightLimit() {
        return weightLimit;
    }
}
