   
import static org.junit.Assert.*;  


import org.junit.Test;  
public class Test1 {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Junit1.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Junit1.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  