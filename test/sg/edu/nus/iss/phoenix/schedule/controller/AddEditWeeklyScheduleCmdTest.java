/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nus.iss.phoenix.schedule.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sourcepirate
 */
public class AddEditWeeklyScheduleCmdTest {
    
    public AddEditWeeklyScheduleCmdTest() {
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
     * Test of perform method, of class AddEditWeeklyScheduleCmd.
     */
    @Test
    public void testPerform() throws Exception {
        System.out.println("perform");
        String path = "";
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        AddEditWeeklyScheduleCmd instance = new AddEditWeeklyScheduleCmd();
        String expResult = "";
        String result = instance.perform(path, req, resp);
       assertNotNull(result);
    }
    
}
