package playertest;

import junit.framework.Assert;
import player.Player;
import junit.framework.TestCase;

public class playerTest extends TestCase {

    public void test00PlayerExistsAndHisReferenceIsNotNull(){

        Player myPlayer = new Player();
        Assert.assertNotNull(myPlayer);

    }

}
