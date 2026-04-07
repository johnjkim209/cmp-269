package exercise6;

public class LehmanGradeBook {
    public boolean isPassing(int grade) {
        if (grade > 100) throw new IllegalArgumentException("grade is absolutely humongous");
        if (grade < 0) throw new IllegalArgumentException("grade is a bit too small");
        return grade >= 70;
    }

    public char getLetterGrade(int score) {
        if (score > 100) throw new IllegalArgumentException("grade is absolutely humongous");
        if (score < 0) throw new IllegalArgumentException("grade is a bit too small");
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }
}
