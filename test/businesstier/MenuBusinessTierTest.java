
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

  
    @Test
    public void testCreateMenu() throws Exception {
        System.out.println("createMenu");
        Menu m = new Menu("F10004","Yong Tau Fu",4.5);
        MenuBusinessTier instance = new MenuBusinessTier();
        boolean expResult = true;
        boolean result = instance.createMenu(m);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testRetrieveFood() throws Exception {
        System.out.println("retrieveFood");
        MenuBusinessTier instance = new MenuBusinessTier();
        MenuJDBC jdbc=new MenuJDBC();
        ArrayList expResult = jdbc.retrieveFood();
        ArrayList result = instance.retrieveFood();
        assertEquals(expResult, result);
        
    }


    @Test
    public void testRetrieveAllFoodId() throws Exception {
        System.out.println("retrieveAllFoodId");
        MenuBusinessTier instance = new MenuBusinessTier();
        MenuJDBC jdbc=new MenuJDBC();
        ArrayList expResult = jdbc.retrieveAllFoodId();
        ArrayList result = instance.retrieveAllFoodId();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testRetrieveAllMenu() throws Exception {
        System.out.println("retrieveAllMenu");
        MenuJDBC jdbc=new MenuJDBC();
        MenuBusinessTier instance = new MenuBusinessTier();
        ArrayList<Menu> expResult = jdbc.retrieveAllMenu();
        ArrayList<Menu> result = instance.retrieveAllMenu();
        assertEquals(expResult, result);
       
    }


    @Test
    public void testRetrieveAMenu() throws Exception {
        System.out.println("retrieveAMenu");
        MenuJDBC jdbc=new MenuJDBC();
        String food_id = "F10001";
        MenuBusinessTier instance = new MenuBusinessTier();
        String expResult = jdbc.retrieveAMenu(food_id);
        String result = instance.retrieveAMenu(food_id);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testRetrieveId() throws Exception {
        System.out.println("retrieveId");
        String id = "F10001";
        MenuJDBC jdbc=new MenuJDBC();
        MenuBusinessTier instance = new MenuBusinessTier();
        ArrayList expResult = jdbc.retrieveId(id);
        ArrayList result = instance.retrieveId(id);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testUpdateMenu() throws Exception {
        System.out.println("updateMenu");
        Menu m = new Menu("F10001","Mangga",5);
        MenuBusinessTier instance = new MenuBusinessTier();
        boolean expResult = true;
        boolean result = instance.updateMenu(m);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testDeleteMenu() throws Exception {
        System.out.println("deleteMenu");
        String fname = "Yong Tau Fu";
        MenuBusinessTier instance = new MenuBusinessTier();
        boolean expResult = true;
        boolean result = instance.deleteMenu(fname);
        assertEquals(expResult, result);
        
    }

  
    @Test
    public void testViewMenu() throws Exception {
        System.out.println("viewMenu");
        DefaultTableModel model = new DefaultTableModel();
        MenuBusinessTier instance = new MenuBusinessTier();
        instance.viewMenu(model);
        
    }
    
}
