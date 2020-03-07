package com.company;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class testMymath {
    @Test
    public void testdivision(){
        Mymath mymath=Mymath.getinstance();
        assertNotNull(mymath);
        assertEquals(mymath.division(4,2),2);
        assertEquals(mymath.division(5,3),1);
        try {
            mymath.division(4,0);
            fail();
        }
        catch (Exception e){
            //System.out.println(e.getMessage());
            assertTrue(e instanceof ArithmeticException);
        }
    }

}
