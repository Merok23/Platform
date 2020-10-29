package playertest;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import junit.framework.Assert;
import map.Map;
import player.Player;
import junit.framework.TestCase;

public class playerTest extends TestCase {

    public void test00PlayerExistsAndHisReferenceIsNotNull() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Player myPlayer = new Player();
        Assert.assertNotNull(myPlayer);

    }

}
