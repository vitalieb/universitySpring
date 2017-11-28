package com.endava;


import com.endava.beans.Human;
import com.endava.beans.Professor;
import com.endava.beans.Student;
import com.endava.beans.University;
import com.endava.qualifiers.StudentA;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.endava")
@EnableAspectJAutoProxy
public class ConfigurationClass {

//
//    @Bean
//    @Profile("professors")
//    Human professor(){
//        return new Professor();
//    }

//    @Bean
//    @Profile("students")
////    @StudentA
//    Human student() {return new Student();}
//
//    @Bean
//    University university(){
//        return new University();
//    }

}
