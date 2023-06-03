import controller.DepartmentCreator;
import controller.FacultyCreator;
import controller.StudentCreator;
import controller.UniversityCreator;
import model.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {

        StudentCreator studentCreator = new StudentCreator();
        Student student = studentCreator.createStudent("Oleksandra", "Tsybulska", Sex.FEMALE);

        // Створення групи
        Group group = new Group("Group 124-20-1", student);

        // Створення кафедри
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department = departmentCreator.createDepartment("Department SAU", student);

        // Створення факультету
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.createFaculty("Faculty FIT", student);

        // Створення університету
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("University NTU DP", student);

        // Вивід даних університету
        System.out.println("University: " + university.getName());
        System.out.println("Head: " + university.getHead().getFullName());
        System.out.println();

        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Head: " + faculty.getHead().getFullName());
        System.out.println();

        System.out.println("Department: " + department.getName());
        System.out.println("Head: " + department.getHead().getFullName());
        System.out.println();

        System.out.println("Group: " + group.getName());
        System.out.println("Head: " + group.getHead().getFullName());

    }
}