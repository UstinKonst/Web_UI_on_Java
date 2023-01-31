package WebUI_less4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void test1() throws TriangleException {
        int a = 3;
        int b = 4;
        int c = 5;
        int s = 6;
        Triangle triangle = new Triangle();
        Assertions.assertEquals(s,triangle.areaTriangle(a,b,c));
    }

    @Test
    void test2() throws TriangleException {
        int a = 3;
        int b = -4;
        int c = 5;
        int s = 6;
        Triangle triangle = new Triangle();
        Assertions.assertThrows(TriangleException.class, ()-> triangle.areaTriangle(a,b,c));
    }

    @Test
    void test3() throws TriangleException {
        int a = 3;
        int b = 4;
        int c = 0;
        int s = 6;
        Triangle triangle = new Triangle();
        Assertions.assertThrows(TriangleException.class, ()-> triangle.areaTriangle(a,b,c));
    }

    @Test
    void test4() throws TriangleException {
        int a = 115;
        int b = 4;
        int c = 5;
        int s = 6;
        Triangle triangle = new Triangle();
        Assertions.assertThrows(TriangleException.class, ()-> triangle.areaTriangle(a,b,c));
    }
}
