package tradeshift.triangle.math;

import org.junit.Assert;
import org.junit.Test;
import tradeshift.enums.TriangleType;

import java.math.BigDecimal;

public class TriangleCalculatorTest {

    @Test
    public void triangleCalculator_differentSides() {
        BigDecimal[] invalidSideArray = { new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")};
        Assert.assertEquals(TriangleType.INVALID, new TriangleCalculator(invalidSideArray).getTriangleType());

        BigDecimal[] equilateralSideArray = { new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2")};
        Assert.assertEquals(TriangleType.EQUILATERAL, new TriangleCalculator(equilateralSideArray).getTriangleType());

        BigDecimal[] isoscelesSideArray = { new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("3")};
        Assert.assertEquals(TriangleType.ISOSCELES, new TriangleCalculator(isoscelesSideArray).getTriangleType());

        BigDecimal[] scaleneSideArray = {new BigDecimal("2"), new BigDecimal("3"), new BigDecimal("4")};
        Assert.assertEquals(TriangleType.SCALENE, new TriangleCalculator(scaleneSideArray).getTriangleType());
    }

}
