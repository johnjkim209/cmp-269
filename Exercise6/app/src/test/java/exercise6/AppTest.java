package exercise6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test
    @DisplayName("Grade 70 should return true for passing")
    void testPassingGrade() {
        LehmanGradeBook gb = new LehmanGradeBook();
        assertTrue(gb.isPassing(70), "A grade of 70 should pass.");
    }

    @Test
    @DisplayName("Tests letter grade A")
    void testLetterGradeA() {
        LehmanGradeBook gb = new LehmanGradeBook();
        assertEquals('A', gb.getLetterGrade(95));
    }

    @Test
    @DisplayName("Tests letter grade A at boundary")
    void testLetterGradeA_b() {
        LehmanGradeBook gb = new LehmanGradeBook();
        assertEquals('A', gb.getLetterGrade(90));
    }

    @Test
    @DisplayName("Tests letter grade B at boundary")
    void testLetterGradeB_b() {
        LehmanGradeBook gb = new LehmanGradeBook();
        assertEquals('B', gb.getLetterGrade(80));
    }

    @Test
    @DisplayName("Tests letter grade C at boundary")
    void testLetterGradeC_b() {
        LehmanGradeBook gb = new LehmanGradeBook();
        assertEquals('C', gb.getLetterGrade(70));
    }

    @Test
    @DisplayName("Tests letter grade F")
    void testLetterGradeF() {
        LehmanGradeBook gb = new LehmanGradeBook();
        assertEquals('F', gb.getLetterGrade(50));
    }

    @Test
    void testInvalidGradeThrowsException() {
    LehmanGradeBook gb = new LehmanGradeBook();
    assertThrows(IllegalArgumentException.class, () -> {
        gb.isPassing(150);
    });
}


}
