import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Main main;

    @BeforeEach
    public void init() {
        main = new Main();
    }

    @Test
void test_a_and_b(){
        Map<String,String> actual=new HashMap<>();
        actual.put("a","Hello");
        actual.put("b","World");
        Map<String,String> expected=new HashMap<>();
        expected.put("a","Hello");
        expected.put("ab","HelloWorld");
        expected.put("b","World");
        assertEquals(expected,main.aOrB(actual));


    }
    @Test
    void test_only_a(){
        Map<String,String> actual=new HashMap<>();
        actual.put("a","Hello");

        Map<String,String> expected=new HashMap<>();
        expected.put("a","Hello");

        assertEquals(expected,main.aOrB(actual));


    }
    @Test
    void test_only_b(){
        Map<String,String> actual=new HashMap<>();
        actual.put("b","World");

        Map<String,String> expected=new HashMap<>();
        expected.put("b","World");

        assertEquals(expected,main.aOrB(actual));


    }
}

