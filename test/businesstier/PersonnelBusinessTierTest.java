
package businesstier;

import domain.Personnel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import jdbc.PersonnelJDBC;


public class PersonnelBusinessTierTest {
    
    public PersonnelBusinessTierTest() {
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
    public void testCreatePersonnel() throws Exception {
        System.out.println("createPersonnel");
        Personnel p = null;
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        String expResult = "";
        String result = instance.createPersonnel(p);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of retrieveName method, of class PersonnelBusinessTier.
     */
    @Test
    public void testRetrieveName() throws Exception {
        System.out.println("retrieveName");
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.retrieveName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveAllId method, of class PersonnelBusinessTier.
     */
    @Test
    public void testRetrieveAllId() throws Exception {
        System.out.println("retrieveAllId");
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.retrieveAllId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveAPersonnel method, of class PersonnelBusinessTier.
     */
    @Test
    public void testRetrieveAPersonnel() throws Exception {
        System.out.println("retrieveAPersonnel");
        String name = "";
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        String expResult = "";
        String result = instance.retrieveAPersonnel(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveId method, of class PersonnelBusinessTier.
     */
    @Test
    public void testRetrieveId() throws Exception {
        System.out.println("retrieveId");
        String id = "";
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.retrieveId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePersonnel method, of class PersonnelBusinessTier.
     */
    @Test
    public void testUpdatePersonnel() throws Exception {
        System.out.println("updatePersonnel");
        Personnel p = null;
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        boolean expResult = false;
        boolean result = instance.updatePersonnel(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStaffId method, of class PersonnelBusinessTier.
     */
    @Test
    public void testGetStaffId() throws Exception {
        System.out.println("getStaffId");
        String type = "";
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.getStaffId(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewPersonnel method, of class PersonnelBusinessTier.
     */
    @Test
    public void testViewPersonnel() throws Exception {
        System.out.println("viewPersonnel");
        DefaultTableModel model = null;
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        instance.viewPersonnel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePersonnel method, of class PersonnelBusinessTier.
     */
    @Test
    public void testDeletePersonnel() throws Exception {
        System.out.println("deletePersonnel");
        String name = "";
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        boolean expResult = false;
        boolean result = instance.deletePersonnel(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
