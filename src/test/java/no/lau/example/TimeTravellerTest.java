package no.lau.example;

import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class TimeTravellerTest {
    @Test
    public void testEpoch() {
        assertEquals("13.01.70", TimeTraveller.convert("1081157732"));
    }
    
    @Test
    public void readFromFile() {
        String filePath = getClass().getClassLoader().getResource("txt/testfile.txt").getFile();
        System.out.println("Found file at " + filePath);

    }
}
