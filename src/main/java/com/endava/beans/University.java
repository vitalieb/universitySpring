package com.endava.beans;

import com.endava.qualifiers.StudentA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class University {

    @Autowired
    List<Human> humans;

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

//    @Autowired
//
//    Human professor;
//
//    public Human getProfessor() {
//        return professor;
//    }
//
//    public void setProfessor(Human professor) {
//        this.professor = professor;
//    }
//
//    @Autowired
//    @StudentA
//    Human student;
//
//    public Human getStudent() {
//        return student;
//    }
//
//    public void setStudent(Human student) {
//        this.student = student;
//    }
}
