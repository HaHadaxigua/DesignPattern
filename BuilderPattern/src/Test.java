import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Student student = new Student.Builder(1, "zrx")
                .setAddr("Korea")
                .setGender(1)
                .setBirthDay(new Date())
                .setPhone(123123)
                .builder();
        System.out.println(student.toString());
    }
}
