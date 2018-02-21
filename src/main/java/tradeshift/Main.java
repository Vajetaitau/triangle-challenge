package tradeshift;

import tradeshift.enums.TriangleType;
import tradeshift.triangle.math.TriangleCalculator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal[] triangleSideArray = new BigDecimal[3];
        try {
            triangleSideArray[0] = new BigDecimal(args[0]);
            triangleSideArray[1] = new BigDecimal(args[1]);
            triangleSideArray[2] = new BigDecimal(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("One or more of the numbers are not valid!");
            System.exit(1);
        }

        TriangleCalculator triangleCalculator = new TriangleCalculator(triangleSideArray);
        TriangleType triangleType = triangleCalculator.getTriangleType();

        System.out.println(String.format("Triangle is '%s'", triangleType));
        if (triangleType == TriangleType.INVALID) {
            System.out.println(triangleCalculator.getMessage());
        }
    }

}
