

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mauricio
 */
public class CalculadoraTest {
    static Calculadora calc;
    
    @BeforeClass
    public static void beforeclass(){
        System.out.println("before class()");
        calc=new Calculadora();
    }
    @Before
    public void Before(){
        System.out.println("Before()");
        calc.clear();
    }
    
    @After
    public void After(){
        System.out.println("After()");
        calc.clear();
    }
    
    @Test
    public void testSuma(){
        System.out.println("testSuma()");
        
        int resultado = calc.suma(2,3);
        int esperado=5;
        assertEquals(esperado,resultado);
    }
    @Test
    public void testResta(){
        System.out.println("testResta()");
        
        int resultado = calc.resta(3,2);
        int esperado=1;
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testDiv(){
        System.out.println("testDIv()");
        
        int resultado = calc.div(3,2);
        
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDiv0(){
        System.out.println("testDIv0()");
        
        calc.div(3,0);
        
    }
    
    @Test
    public void testAnsSuma(){
        System.out.println("AnsSuma()");
        calc.suma(3, 2);
        int resultado=calc.ans();
        int esperado=5;
        assertEquals(esperado,resultado);
       
                
    }
    
    @Test(timeout=3001)
    public void testOptimo(){
        System.out.println("testoptimo()");
        calc.optima();
        
    }
    //modificacion afterclass
    @AfterClass
    public static void Afterclass(){
        System.out.println("Afterclass()");
        
    }
}
