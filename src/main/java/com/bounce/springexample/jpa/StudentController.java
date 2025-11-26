package com.bounce.springexample.jpa;

import com.bounce.springexample.jpa.domain.Student;
import com.bounce.springexample.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @GetMapping("/lombok")
    public Student lombokTest() {

//        Student student = new Student(3
//                , "강승훈"
//                , "010-1111-2222"
//                , "bouncewater48@gmail.com"
//                , "개발자"
//                , LocalDateTime.now()
//                , LocalDateTime.now());

        // builder 패턴을 통한 객체 생성
        Student student = Student.builder()
                .name("강승훈")
                .phoneNumber("010-1111-2222")
                .dreamJob("개발자")
                .build();

        return student;

    }

    @ResponseBody
    @GetMapping("/add")
    public Student addStudent() {
        // 강승훈, 010-1111-2222, bouncewater48@gmail.com, 개발자

        Student student = studentService.createStudent("강승훈"
                , "010-1111-2222"
                , "bouncewater48@gmail.com"
                , "개발자");

        return student;

    }

    @ResponseBody
    @GetMapping("/modify")
    public Student modifyStudent() {

        // id가 3인 학생의 장래희망을 강사로 변경
        Student student = studentService.updateStudent(3, "강사");

        return student;

    }

    @ResponseBody
    @GetMapping("/remove")
    public String removeStudent() {
        // id가 3인 행
        studentService.deleteStudent(3);

        return "삭제 완료";
    }

}
