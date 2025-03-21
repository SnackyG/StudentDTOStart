package dk.kea.studentdtostart.config;

import dk.kea.studentdtostart.model.Student;
import dk.kea.studentdtostart.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Bruce");
        s1.setPassword("1234");
        s1.setBornDate(LocalDate.of(2010, 11, 12));
        s1.setBornTime(LocalTime.of(10, 11, 12));
        studentRepository.save(s1);
        //ChatGPT testdata
        studentRepository.save(new Student("Alice", "aliceDog", LocalDate.of(2008, 5, 22), LocalTime.of(8, 30, 45)));
        studentRepository.save(new Student("John", "Deer", LocalDate.of(2012, 7, 9), LocalTime.of(15, 20, 30)));
        studentRepository.save(new Student("Diana","theprincess", LocalDate.of(2009, 1, 19), LocalTime.of(11, 45, 0)));
        studentRepository.save(new Student("Clark", "Kent", LocalDate.of(2011, 3, 14), LocalTime.of(9, 15, 10)));
        studentRepository.save(new Student("Emma", "Watson", LocalDate.of(2013, 6, 4), LocalTime.of(14, 5, 25)));
        studentRepository.save(new Student("Oliver", "Twist", LocalDate.of(2007, 8, 27), LocalTime.of(16, 50, 40)));
        studentRepository.save(new Student("Sophia", "andherDog", LocalDate.of(2014, 10, 2), LocalTime.of(7, 20, 55)));
        studentRepository.save(new Student("Liam", "Oconnor", LocalDate.of(2010, 12, 31), LocalTime.of(13, 35, 15)));
        studentRepository.save(new Student("Ava", "mypasswordhere", LocalDate.of(2006, 9, 18), LocalTime.of(17, 25, 35)));

    }
}
