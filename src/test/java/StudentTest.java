import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void constructorTest() {
        Student student1 = new Student("Charles", 2345667);
        assertEquals("Charles", student1.getName());
        assertEquals(2345667, student1.getId());
    }

    @Test
    public void addGradeTest() {
        Student student1 = new Student("Charles", 2345667);
        student1.addGrade(98);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(98);
        assertEquals(student1.getGrades(), grades);
    }

    @Test
    public void getGradeAverageTest() {
        Student student1 = new Student("Charles", 2345667);
        student1.addGrade(90);
        student1.addGrade(100);
        assertEquals(student1.getGradeAverage(), 95, 0);
    }

    @Test
    public void updateGradeTest(){
        Student student1 = new Student("Charles", 2345667);
        student1.addGrade(95);
        student1.addGrade(23);
        student1.updateGrade(99, 1);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(95);
        grades.add(99);
        assertEquals(grades, student1.getGrades());
    }

    @Test
    public void deleteGradeTest() {
        Student student1 = new Student("Charles", 2345667);
        student1.addGrade(80);
        student1.addGrade(90);
        student1.deleteGrade(1);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(80);
        assertEquals(grades, student1.getGrades());
    }
}
