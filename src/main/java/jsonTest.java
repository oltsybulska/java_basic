import controller.UniversityCreator;
import model.*;
import model.Student;
import model.University;
import org.junit.Assert;
import org.junit.Test;

public class jsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "src/myJSON.json";
        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        String universityName = "My University";
        Human universityFounder = new Student("John", "Doe", Sex.MALE);
        University oldUniversity = universityCreator.createUniversity(universityName, universityFounder);

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        Assert.assertEquals(newUniversity, oldUniversity);
    }
}