import org.example.Add;
import org.example.Jian;
import org.example.ewai.Cheng;
import org.example.ewai.chenImpl;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestNG {
    @Test
    public void testAdd() {
        Add count = new Add();
        int result = count.add(2,2);
        assertEquals(result, 4);
    }

    public void testJian() {
        Jian j = new Jian();
        int result = j.sub(3,2);
        assertEquals(result, 1);
    }

    public void testCheng(){
        Cheng c = new Cheng();
        int result = c.div(3,2);
        assertEquals(result, 6);
    }

    @Test
    public void testchenimpl(){
        chenImpl c= new chenImpl();
        c.say();
    }
}