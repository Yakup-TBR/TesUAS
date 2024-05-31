/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yakup Asmaidy
 */
public class CalculatorTest {
    
    @Test
    public void testTambah() {
        assertEquals(6, Calculator.tambah(2, 3));
        assertEquals(-1, Calculator.tambah(-2, 1));
        assertEquals(0, Calculator.tambah(0, 0));
    }

    @Test
    public void testKurang() {
        assertEquals(1, Calculator.kurang(4, 3));
        assertEquals(-5, Calculator.kurang(2, 7));
        assertEquals(0, Calculator.kurang(0, 0));
    }

    @Test
    public void testKali() {
        assertEquals(15, Calculator.kali(5, 3));
        assertEquals(-6, Calculator.kali(2, -3));
        assertEquals(0, Calculator.kali(0, 0));
    }

    @Test
    public void testBagi() {
        assertEquals(2, Calculator.bagi(6, 3));
        assertEquals(-2, Calculator.bagi(6, -3));
        assertEquals(0, Calculator.bagi(0, 5));
    }
    
}
