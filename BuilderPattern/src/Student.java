import java.util.Date;

public class Student {
    private final int id;           // 必选
    private final String name;      // 必选
    private final int gender;       // 可选
    private final String addr;
    private final long phone;
    private final Date birthDay;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.gender = builder.gender;
        this.addr = builder.addr;
        this.phone = builder.phone;
        this.birthDay = builder.birthDay;
    }

    public static class Builder {
        private int id;
        private String name;
        private int gender;
        private String addr;
        private long phone;
        private Date birthDay;

        public Student builder() {
            return new Student(this);
        }

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setGender(int gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAddr(String addr) {
            this.addr = addr;
            return this;
        }

        public Builder setPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public Builder setBirthDay(Date birthDay) {
            this.birthDay = birthDay;
            return this;
        }
    }

    @Override
    public String toString() {
        return "id:" + this.id + "\\n name:" + this.name + "\\n addr:" + this.addr
                + "\\n gender:" + this.gender + "\\n phone:" + this.phone + "\\n birthday:" + this.birthDay;
    }
}
