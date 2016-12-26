/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesstier;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import jdbc.OrderJDBC;

/**
 *
 * @author Admin
 */
public class OrderBusinessTierTest {
    
    public OrderBusinessTierTest() {
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
     * Test of createOrder method, of class OrderBusinessTier.
     */
    @Test
    public void testCreateOrder() throws Exception {
        System.out.println("createOrder");
        String order_no = "O1011";
        String seat_no = "3";
        OrderBusinessTier instance = new OrderBusinessTier();
        boolean expResult = true;
        boolean result = instance.createOrder(order_no, seat_no);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createOrderItem method, of class OrderBusinessTier.
     */
    @Test
    public void testCreateOrderItem() throws Exception {
        System.out.println("createOrderItem");
        OrderJDBC jdbc=new OrderJDBC();
        String Item = "O1012";
        OrderBusinessTier instance = new OrderBusinessTier();
        String expResult = Item;
        String result = instance.createOrderItem(Item);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrieveOrder method, of class OrderBusinessTier.
     */
    @Test
    public void testRetrieveOrder() throws Exception {
        System.out.println("retrieveOrder");
        String order_no = "S1011";
        OrderJDBC jdbc=new OrderJDBC();
        OrderBusinessTier instance = new OrderBusinessTier();
        String expResult = jdbc.retrieveOrder(order_no);
        String result = instance.retrieveOrder(order_no);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFoodName method, of class OrderBusinessTier.
     */
    @Test
    public void testGetFoodName() throws Exception {
        System.out.println("getFoodName");
        OrderBusinessTier instance = new OrderBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.getFoodName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveOrderNo method, of class OrderBusinessTier.
     */
    @Test
    public void testRetrieveOrderNo() throws Exception {
        System.out.println("retrieveOrderNo");
        OrderBusinessTier instance = new OrderBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.retrieveOrderNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateOrder method, of class OrderBusinessTier.
     */
    @Test
    public void testUpdateOrder() throws Exception {
        System.out.println("updateOrder");
        String order_no = "";
        String seat_no = "";
        OrderBusinessTier instance = new OrderBusinessTier();
        boolean expResult = false;
        boolean result = instance.updateOrder(order_no, seat_no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteOrder method, of class OrderBusinessTier.
     */
    @Test
    public void testDeleteOrder() throws Exception {
        System.out.println("deleteOrder");
        String order_no = "O1011";
        OrderBusinessTier instance = new OrderBusinessTier();
        boolean expResult = false    ;
        boolean result = instance.deleteOrder(order_no);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteAllOrder method, of class OrderBusinessTier.
     */
    @Test
    public void testDeleteAllOrder() throws Exception {
        System.out.println("deleteAllOrder");
        OrderBusinessTier instance = new OrderBusinessTier();
        boolean expResult = false;
        boolean result = instance.deleteAllOrder();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getOrderNo method, of class OrderBusinessTier.
     */
    @Test
    public void testGetOrderNo() throws Exception {
        System.out.println("getOrderNo");
        OrderBusinessTier instance = new OrderBusinessTier();
        String expResult = "O1012";       
        String result = instance.getOrderNo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createNewOrderItem method, of class OrderBusinessTier.
     */
    @Test
    public void testCreateNewOrderItem() throws Exception {
        System.out.println("createNewOrderItem");
        String order_no = "O1012";
        String Item = "Hainan Chicken Rice";
        OrderBusinessTier instance = new OrderBusinessTier();
         OrderJDBC jdbc=new OrderJDBC();
        String expResult = order_no;
        String result = instance.createNewOrderItem(order_no, Item);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of resetOrderList method, of class OrderBusinessTier.
     */
    @Test
    public void testResetOrderList() throws Exception {
        System.out.println("resetOrderList");
        String order_no = "";
        OrderBusinessTier instance = new OrderBusinessTier();
        boolean expResult = false;
        boolean result = instance.resetOrderList(order_no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    
    
}
