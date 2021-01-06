package com.seleniummaster.oopconcepts.inheritancetutorial;

public class GraduateStudent extends Student{
    private String researchField;
    private String advisorName;

    public GraduateStudent(){
        super();
    }

    public GraduateStudent(String researchField, String advisorName) {
        this.researchField = researchField;
        this.advisorName = advisorName;
    }

    public GraduateStudent(String firstName, String lastName, String gender, String major, String className) {
        super(firstName, lastName, gender, major, className);
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    @Override
    public String toString() {
//        return "GraduateStudent{" +
//                "researchField='" + researchField + '\'' +
//                ", advisorName='" + advisorName + '\'' +
//                '}'+super.toString();
//        return String.format("FirstName=%s LastName=%s Gender=%s Major=%s Research=%s Advisor=%s",
//                super.getFirstName(),super.getLastName(),super.getGender(),super.getMajor(),getResearchField(),advisorName);
        return String.format("FirstName=%s LastName=%s Gender=%s Major=%s Research=%s Advisor=%s",
                super.getFirstName(),super.getLastName(),super.getGender(),super.getMajor(),researchField,advisorName);

    }
}
