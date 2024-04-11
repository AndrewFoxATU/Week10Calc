package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcTest {
    Calc newCalc;


    @Test
    void testAdd(){
        newCalc = new Calc();
        assertEquals(10,newCalc.add(4,6));

    }


}
