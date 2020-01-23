package com.ctco.testSchool;

public class Member {
    public double velocity = 1.0;
    public Boolean codinSkills;
    public Boolean testingSkills;

    public Member() {
    }

    public Member(boolean developer) {
        codinSkills = developer;
        testingSkills = !developer;
    }
}
