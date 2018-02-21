package tradeshift.triangle.math;

import tradeshift.enums.TriangleType;

import java.math.BigDecimal;

public class TriangleCalculator {

    private BigDecimal[] triangleSideArray;
    private TriangleType triangleType;
    private String message;

    public TriangleCalculator(BigDecimal[] triangleSideArray) {
        TriangleValidator validator = new TriangleValidator(triangleSideArray);

        if (validator.isValid()) {
            this.triangleSideArray = triangleSideArray;
            if (isEquilateral()) {
                this.triangleType = TriangleType.EQUILATERAL;
            } else if (isIsosceles()) {
                this.triangleType = TriangleType.ISOSCELES;
            } else {
                this.triangleType = TriangleType.SCALENE;
            }
        } else {
            message = validator.getReason();
            this.triangleType = TriangleType.INVALID;
        }
    }

    private boolean isEquilateral() {
        return triangleSideArray[0].compareTo(triangleSideArray[1]) == 0 &&
                triangleSideArray[0].compareTo(triangleSideArray[2]) == 0;
    }

    private boolean isIsosceles() {
        return triangleSideArray[0].compareTo(triangleSideArray[1]) == 0 ||
                triangleSideArray[0].compareTo(triangleSideArray[2]) == 0 ||
                triangleSideArray[1].compareTo(triangleSideArray[2]) == 0;
    }

    public String getMessage() {
        return message;
    }

    public TriangleType getTriangleType() {
        return this.triangleType;
    }
}
