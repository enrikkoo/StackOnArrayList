import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTest {

    static Stack<Integer> s = new Stack<>();

    @BeforeClass
    public static void setup() throws Exception {
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

    }

    @Test
    public void test1()  {
        Assert.assertEquals((Integer)5,s.peek());
    }
    @Test
    public void test2() throws Exception {
        Assert.assertEquals((Integer)5,s.pop());
    }
    @Test
    public void test3()  {
        Assert.assertEquals((Integer)4,s.peek());
    }
    @Test
    public void test4()  {
        Assert.assertEquals(2,s.search(3));
    }
    @Test
    public void test5()  {
        Assert.assertFalse(s.empty());
    }
    @Test
    public void test6()  {
        Assert.assertEquals((Integer)10,s.push(10));
    }

}
