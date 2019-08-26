public class Education {

    private String degree;
    private  String major;
    private String school;
    private int year;


    public Education(String degree, String major, String school, int year) {
        this.degree = degree;
        this.major = major;
        this.school = school;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Education \n" +
                "Degree " + degree + '\n' +
                "Major= " + major + '\n' +
                "School " + school + '\n' +
                "Year " + year
                ;
    }
}
