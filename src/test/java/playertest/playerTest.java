package playertest;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import junit.framework.Assert;
import map.Map;
import player.Player;
import junit.framework.TestCase;

public class playerTest extends TestCase {

    public void test00PlayerExistsAndHisReferenceIsNotNull() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map(10, 10);
        Player myPlayer = new Player(myMap,5,1);

        Assert.assertNotNull(myPlayer);

    }

}
