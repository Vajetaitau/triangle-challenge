package tradeshift.triangle.math;

import java.math.BigDecimal;

public class TriangleValidator {

    private BigDecimal[] triangleSideArray;
    private String reason;

    public TriangleValidator(BigDecimal[] triangleSideArray) {
        this.triangleSideArray = triangleSideArray;
    }

    public boolean isValid() {
        for (int i = 0; i < 3; i++) {
            BigDecimal sumOfTwoSides = firstSide(i).add(secondSide(i));
            BigDecimal remainingSide = thirdSide(i);
            if (sumOfTwoSides.compareTo(remainingSide) <= 0) {
                reason = String.format("Sum of '%1$s' and '%2$s' is lower than or equal to '%3$s' [%1$s + %2$s <= %3$s]",
                        firstSide(i), secondSide(i), thirdSide(i));
                return false;
            }
        }
        return true;
    }

    private BigDecimal firstSide(int i) {
        return triangleSideArray[i];
    }

    private BigDecimal secondSide(int i) {
        return triangleSideArray[(i + 1) % 3];
    }

    private BigDecimal thirdSide(int i) {
        return triangleSideArray[(i + 2) % 3];
    }

    public String getReason() {
        return this.reason;
    }
}
