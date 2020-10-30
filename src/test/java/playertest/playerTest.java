package playertest;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import junit.framework.Assert;
import map.Map;
import player.Player;
import junit.framework.TestCase;
import position.Position;

public class playerTest extends TestCase {

    public void test00PlayerExistsAndHisReferenceIsNotNull() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map(10, 10);
        Player myPlayer = new Player(myMap,5,1);

        Assert.assertNotNull(myPlayer);

    }

    public void test01PlayerCentralPositionIsRight() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map(20, 20);
        Player myPlayer = new Player (myMap,5,1);
        Position myPosition = new Position(5,1);

        Assert.assertEquals(myPosition, myPlayer.getCentralPosition());
        
    }

    public void test02PlayerCanMoveToTheRight() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map(20, 20);
        Player myPlayer = new Player (myMap,5,1);
        Position myPosition = new Position(6,1);

        myPlayer.moveToTheRight();

        Assert.assertEquals(myPosition, myPlayer.getCentralPosition());

    }

    public void test03PlayerCanMoveToTheLeft() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map(20, 20);
        Player myPlayer = new Player (myMap,5,1);
        Position myPosition = new Position(4,1);

        myPlayer.moveToTheLeft();

        Assert.assertEquals(myPosition, myPlayer.getCentralPosition());

    }

}
