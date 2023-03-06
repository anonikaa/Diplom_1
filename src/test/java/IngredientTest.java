import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 200);
    @Test
    public void getPriceReturnsRightPriceTest(){
        Assert.assertEquals(200.0, ingredient.getPrice(), 0);
    }
    @Test
    public void getNameReturnsRightNameTest(){
        Assert.assertEquals("hot sauce", ingredient.getName());
    }
    @Test
    public void getTypeReturnsTypePriceTest(){
        Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}
