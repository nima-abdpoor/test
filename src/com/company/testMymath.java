package com.company;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class testMymath {
    @Test
    public void testmultyply(){
        Mymath mymath=new Mymath();
        assertEquals(2,mymath.intmultiply(1,2));
        assertEquals(0,mymath.intmultiply(0,2));
        assertEquals(3,mymath.Doublemultiply(1.5,2),0.0001);
    }
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
