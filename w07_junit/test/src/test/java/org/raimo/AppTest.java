package org.raimo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static App app;
    
    @BeforeClass
    public static void init(){
        app = new App();
        //game = new Game();
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
    public void checkName(){
        app.name = "Test";
        assertEquals("App name should be Test", "Test", app.getName());
    }

    @Test
    public void checkSum(){
        assertTrue(4 == app.sum(2, 2));
    }

    @Test
    public void doArraysEqual(){
        int[] arr = new int[]{ 2, 3, 4, 5 };
        assertArrayEquals(arr, app.toArray(2, 3, 4, 5));
    }

    @Test
    public void hamcrestTest(){
        assertThat(50, is(not(40)));
        assertThat(60, is(greaterThan(59)));

        assertThat("Hello", startsWith("Hel"));
    }

    @Test
    public void compareObjects(){
        App app1 = new App();
        App app2 = new App();

        assertNotEquals(app1, app2);
    }

    /* @Test
    public void checkIfCoordinatesChange(){
        //game.moveCharacter(3, 4)
        //assertArrayEquals([3, 4], game.getCoordinates());
    } */

}
