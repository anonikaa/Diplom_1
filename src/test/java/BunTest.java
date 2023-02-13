import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
public class BunTest {
    Bun bun = new Bun("white bun", 200);
    @Test
    public void getNameReturnsRightNameTest(){
        Assert.assertEquals("white bun", bun.getName());
    }
    @Test
    public void getPriceReturnsRightPriceTest(){
        Assert.assertEquals(200, bun.getPrice(), 0);
    }
}
