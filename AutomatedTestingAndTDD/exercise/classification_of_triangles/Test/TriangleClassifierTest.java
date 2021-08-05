import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {

    @Test
    void triangleClassification() {
        String exepected = "tam giác đều";
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,2);
        String actual = triangleClassifier.triangleClassification();

        assertEquals(exepected,actual);
    }

    @Test
    void triangleClassification1() {
        String exepected = "tam giác cân";
        TriangleClassifier triangleClassifier = new TriangleClassifier(2,2,3);
        String actual = triangleClassifier.triangleClassification();

        assertEquals(exepected,actual);
    }

    @Test
    void triangleClassification2() {
        String exepected = "tam giác thường";
        TriangleClassifier triangleClassifier = new TriangleClassifier(3,4,5);
        String actual = triangleClassifier.triangleClassification();

        assertEquals(exepected,actual);
    }

    @Test
    void triangleClassification3() {
        String exepected = "không phải là tam giác";
        TriangleClassifier triangleClassifier = new TriangleClassifier(-1,2,1);
        String actual = triangleClassifier.triangleClassification();

        assertEquals(exepected,actual);
    }

    @Test
    void triangleClassification4() {
        String exepected = "không phải là tam giác";
        TriangleClassifier triangleClassifier = new TriangleClassifier(8,2,3);
        String actual = triangleClassifier.triangleClassification();

        assertEquals(exepected,actual);
    }

    @Test
    void triangleClassification5() {
        String exepected = "không phải là tam giác";
        TriangleClassifier triangleClassifier = new TriangleClassifier(0,1,1);
        String actual = triangleClassifier.triangleClassification();

        assertEquals(exepected,actual);
    }
}