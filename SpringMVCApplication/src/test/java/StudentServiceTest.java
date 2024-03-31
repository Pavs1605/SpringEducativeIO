import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @Mock
    Student studentDaoMock;

    @InjectMocks
    StudentService studentService;

    @Test
    void testFindTotal_usingMocks() {
        when(studentDaoMock.getMarks()).thenReturn(new int[] {15, 20, 5});
        assertEquals(40, studentService.findTotal());
    }
    @Test
    public void testFindTotal()
    {
        Student studentMock = mock(Student.class);
        when(studentMock.getMarks()).thenReturn(new int[]{80, 70, 100, 60});

        StudentService ser = new StudentService(studentMock);
        int total = ser.findTotal();

        assertEquals(total,  310);


    }
}
