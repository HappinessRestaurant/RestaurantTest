/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesstier;

import domain.Menu;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import jdbc.MenuJDBC;

/**
 *
 * @author Admin
 */
public class MenuBusinessTierTest {
    
    public MenuBusinessTierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createMenu method, of class MenuBusinessTier.
     */
    @Test
    public void testCreateMenu() throws Exception {
        System.out.println("createMenu");
        Menu m = new Menu("F10004","Yong Tau Fu",4.5);
        MenuBusinessTier instance = new MenuBusinessTier();
        boolean expResult = true;
        boolean result = instance.createMenu(m);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrieveFood method, of class MenuBusinessTier.
     */
    @Test
    public void testRetrieveFood() throws Exception {
        System.out.println("retrieveFood");
        MenuBusinessTier instance = new MenuBusinessTier();
        MenuJDBC jdbc=new MenuJDBC();
        ArrayList expResult = jdbc.retrieveFood();
        ArrayList result = instance.retrieveFood();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrieveAllFoodId method, of class MenuBusinessTier.
     */
    @Test
    public void testRetrieveAllFoodId() throws Exception {
        System.out.println("retrieveAllFoodId");
        MenuBusinessTier instance = new MenuBusinessTier();
        MenuJDBC jdbc=new MenuJDBC();
        ArrayList expResult = jdbc.retrieveAllFoodId();
        ArrayList result = instance.retrieveAllFoodId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrieveAllMenu method, of class MenuBusinessTier.
     */
    @Test
    public void testRetrieveAllMenu() throws Exception {
        System.out.println("retrieveAllMenu");
        MenuJDBC jdbc=new MenuJDBC();
        MenuBusinessTier instance = new MenuBusinessTier();
        ArrayList<Menu> expResult = jdbc.retrieveAllMenu();
        ArrayList<Menu> result = instance.retrieveAllMenu();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of retrieveAMenu method, of class MenuBusinessTier.
     */
    @Test
    public void testRetrieveAMenu() throws Exception {
        System.out.println("retrieveAMenu");
        MenuJDBC jdbc=new MenuJDBC();
        String food_id = "F10001";
        MenuBusinessTier instance = new MenuBusinessTier();
        String expResult = jdbc.retrieveAMenu(food_id);
        String result = instance.retrieveAMenu(food_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveId method, of class MenuBusinessTier.
     */
    @Test
    public void testRetrieveId() throws Exception {
        System.out.println("retrieveId");
        String id = "";
        MenuJDBC jdbc=new MenuJDBC();
        MenuBusinessTier instance = new MenuBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.retrieveId(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of updateMenu method, of class MenuBusinessTier.
     */
    @Test
    public void testUpdateMenu() throws Exception {
        System.out.println("updateMenu");
        Menu m = new Menu("F10001","Mangga",5);
        MenuBusinessTier instance = new MenuBusinessTier();
        boolean expResult = true;
        boolean result = instance.updateMenu(m);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteMenu method, of class MenuBusinessTier.
     */
    @Test
    public void testDeleteMenu() throws Exception {
        System.out.println("deleteMenu");
        String fname = "Yong Tau Fu";
        MenuBusinessTier instance = new MenuBusinessTier();
        boolean expResult = true;
        boolean result = instance.deleteMenu(fname);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewMenu method, of class MenuBusinessTier.
     */
    @Test
    public void testViewMenu() throws Exception {
        System.out.println("viewMenu");
        DefaultTableModel model = new DefaultTableModel();
        MenuBusinessTier instance = new MenuBusinessTier();
        instance.viewMenu(model);
        
    }
    
}
