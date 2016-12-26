
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
        Personnel p = new Personnel("S104","Ah Gao","950212","asd","Female","010-2314421","S");
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        
        String expResult ="M104";
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
        PersonnelJDBC jdbc= new PersonnelJDBC();
        ArrayList expResult = jdbc.retrieveName();
        ArrayList result = instance.retrieveName();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of retrieveAllId method, of class PersonnelBusinessTier.
     */
    @Test
    public void testRetrieveAllId() throws Exception {
        System.out.println("retrieveAllId");
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        PersonnelJDBC jdbc= new PersonnelJDBC();
        ArrayList expResult = jdbc.retrieveAllId();
        ArrayList result = instance.retrieveAllId();
        assertEquals(expResult, result);
       
    }

  

    /**
     * Test of retrieveId method, of class PersonnelBusinessTier.
     */
    @Test
    public void testRetrieveId() throws Exception {
        System.out.println("retrieveId");
        String id = "M108";
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        PersonnelJDBC jdbc= new PersonnelJDBC();
        ArrayList expResult = jdbc.retrieveId(id);
        ArrayList result = instance.retrieveId(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of updatePersonnel method, of class PersonnelBusinessTier.
     */
    @Test
    public void testUpdatePersonnel() throws Exception {
        System.out.println("updatePersonnel");
        Personnel p = new Personnel("S104","Ah Gao","950212","asd","Female","010-2314421","S");;
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        boolean expResult = false;
        boolean result = instance.updatePersonnel(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of getStaffId method, of class PersonnelBusinessTier.
     */
    @Test
    public void testGetStaffId() throws Exception {
        System.out.println("getStaffId");
        String type = "M";
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        PersonnelJDBC jdbc= new PersonnelJDBC();
        ArrayList expResult = jdbc.getStaffId(type);
        ArrayList result = instance.getStaffId(type);
        assertEquals(expResult, result);
       
    }


    /**
     * Test of deletePersonnel method, of class PersonnelBusinessTier.
     */
    @Test
    public void testDeletePersonnel() throws Exception {
        System.out.println("deletePersonnel");
        String name = "Ah Gao";
        PersonnelBusinessTier instance = new PersonnelBusinessTier();
        boolean expResult = true;
        boolean result = instance.deletePersonnel(name);
        assertEquals(expResult, result);
     
    }
    
}
