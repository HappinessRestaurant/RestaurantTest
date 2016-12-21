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

/**
 *
 * @author Admin
 */
public class MenuBusinessTierTest {
    
   

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
    
 @Test
    public void testRetrieveId() throws Exception {
        System.out.println("retrieveId");
        String id = "F10001";
        MenuBusinessTier instance = new MenuBusinessTier();
        ArrayList expResult = instance.retrieveId(id);
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
