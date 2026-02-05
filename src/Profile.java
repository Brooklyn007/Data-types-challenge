import java.time.LocalDateTime;

public class Profile {

    private String name;
    private String state;
    private String location;
    private int age;
    private LocalDateTime date;
    public static PersonalAxademicInfo personalAxademicInfo;

    public Profile() {
    }

    public Profile(String name, String state, String location, int age, LocalDateTime date) {
        this.name = name;
        this.state = state;
        this.location = location;
        this.age = age;
        this.date = date;
    }



    public class PersonalAxademicInfo {
        private String schoolName;
        private String schoolLocation;
        private LocalDateTime startDate;

        public PersonalAxademicInfo() {

        }

        public PersonalAxademicInfo(String schoolName, String schoolLocation, LocalDateTime startDate) {
            this.schoolName = schoolName;
            this.schoolLocation = schoolLocation;
            this.startDate = startDate;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public String getSchoolLocation() {
            return schoolLocation;
        }

        public void setSchoolLocation(String schoolLocation) {
            this.schoolLocation = schoolLocation;
        }

        public LocalDateTime getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDateTime startDate) {
            this.startDate = startDate;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public static PersonalAxademicInfo getPersonalAxademicInfo() {
        return personalAxademicInfo;
    }

    public static void setPersonalAxademicInfo(PersonalAxademicInfo personalAxademicInfo) {
        Profile.personalAxademicInfo = personalAxademicInfo;
    }
}

