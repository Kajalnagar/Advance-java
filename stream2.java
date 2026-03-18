// stream question 1 extrat the  name of all students  from aList using map()
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id =id;
        this.name=name;
    }
}

public class stream2 {
    public static void main(String[] args) {
        List<Student> stud = Arrays.asList(new Student(1,"haaa"),
        new Student(2,"hiiii"),
        new Student(3,"hooo") );
List<String> names = stud.stream().map(s -> s.name).collect(Collectors.toList());
System.out.println(names);  
}
    
}
