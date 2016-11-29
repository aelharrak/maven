package com.amine.app;
 
import static org.junit.Assert.assertEquals;
 
import org.junit.Before;
import org.junit.Test;
 
public class AppTest {
    App app;
    @Before public void initialize() {
        app = new App();
    }
     
    @Test
    public void testSomme(){
        assertEquals(app.somme(1, 2), 3);
    }
 
    @Test
    public void testPrintHello(){
        assertEquals(app.printHello("amine"), "Hello, amine");
    } 
     
}
