package tradeshift.triangle.math;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TriangleValidatorTest {

    @Test
    public void isValid_triangleInequality_false() {
        BigDecimal[] firstSideNotArray = { new BigDecimal("3"), new BigDecimal("1"), new BigDecimal("2")};
        TriangleValidator validator = new TriangleValidator(firstSideNotArray);
        Assert.assertFalse(validator.isValid());
        Assert.assertNotNull(validator.getReason());

        BigDecimal[] secondSideNotValid = { new BigDecimal("1"), new BigDecimal("3"), new BigDecimal("2")};
        validator = new TriangleValidator(secondSideNotValid);
        Assert.assertFalse(validator.isValid());
        Assert.assertNotNull(validator.getReason());

        BigDecimal[] thirdSideNotValid = { new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")};
        validator = new TriangleValidator(thirdSideNotValid);
        Assert.assertFalse(validator.isValid());
        Assert.assertNotNull(validator.getReason());
    }

    @Test
    public void isValid_true() {
        BigDecimal[] sideArray = { new BigDecimal("3"), new BigDecimal("2"), new BigDecimal("2")};
        TriangleValidator validator = new TriangleValidator(sideArray);
        Assert.assertTrue(validator.isValid());
        Assert.assertNull(validator.getReason());
    }

}
