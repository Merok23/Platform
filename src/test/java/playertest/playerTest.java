package playertest;

import player.Player;
import junit.framework.TestCase;
import org.junit.Assert;

public class playerTest extends TestCase {

    public void test00PlayerExistsAndHisRefferenceItsnotNull(){
        Player myPlayer = new Player();
        Assert.assertNotNull(myPlayer);
    }

}
