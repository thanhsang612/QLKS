/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.dao;

import com.qlks.entity.Phong;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Administrator
 */
@RunWith(PowerMockRunner.class)
public class PhongDaoTest {
    
    public PhongDaoTest() {
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
    public void testDocPhong() {
        System.out.println("docPhong");
        PhongDao instance = new PhongDao();
        ArrayList<Phong> expResult = null;
        ArrayList<Phong> result = instance.docPhong();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTimphong() {
        System.out.println("timphong");
        Phong ph = null;
        PhongDao instance = new PhongDao();
        ArrayList<Phong> expResult = null;
        ArrayList<Phong> result = instance.timphong(ph);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCapNhatTinhTrangPhong() {
        System.out.println("capNhatTinhTrangPhong");
        String maPhong = "";
        PhongDao instance = new PhongDao();
        int expResult = 0;
        int result = instance.capNhatTinhTrangPhong(maPhong);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCapNhatTinhTrangPhongChuaThue() {
        System.out.println("capNhatTinhTrangPhongChuaThue");
        String maPhong = "";
        PhongDao instance = new PhongDao();
        int expResult = 0;
        int result = instance.capNhatTinhTrangPhongChuaThue(maPhong);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemPhong() {
        System.out.println("ThemPhong");
        Phong themp = null;
        PhongDao instance = new PhongDao();
        int expResult = 0;
        int result = instance.ThemPhong(themp);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXoaPhong() {
        System.out.println("xoaPhong");
        String maPhong = "";
        PhongDao instance = new PhongDao();
        int expResult = 0;
        int result = instance.xoaPhong(maPhong);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCapNhatPhong() {
        System.out.println("capNhatPhong");
        Phong phong = null;
        PhongDao instance = new PhongDao();
        int expResult = 0;
        int result = instance.capNhatPhong(phong);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
