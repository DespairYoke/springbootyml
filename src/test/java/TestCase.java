import com.hlw.controller.MyTip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=WebMain.class)
public class TestCase {
    @Autowired
    private MyTip myTip;
    @Test
    public void test1(){
        System.out.println(myTip.getName());
    }
}
