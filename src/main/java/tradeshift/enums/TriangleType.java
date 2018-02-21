package tradeshift.enums;

public enum TriangleType {
    EQUILATERAL("Equilateral"), ISOSCELES("Isosceles"), SCALENE("Scalene"), INVALID("Invalid");

    private String type;

    TriangleType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
