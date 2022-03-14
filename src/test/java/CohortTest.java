import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CohortTest {
    Student student1;
    Student student2;
    cohort sirius;
    List<Student> studentsTest;


    @Before
    public void setUp(){
        sirius = new cohort();
        student1 = new Student("Charles", 829842);
        student2 = new Student("Mark", 212983);
        student1.addGrade(90);
        student2.addGrade(94);
        sirius.addStudent(student1);
        studentsTest = new ArrayList<>();
    }

    @Test
    public void addStudentTest() {
        studentsTest.add(student1);
        assertEquals(studentsTest, sirius.getStudents());
    }

    @Test
    public void getCohortAverageTest() {
        sirius.addStudent(student2);
        assertEquals(92, sirius.getCohortAverage(), 0);
    }


}
