package mozanta.project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;





@Service
public class Appservice {
    private static Map<Long, Student> Students =new HashMap<>();
    private static Long index=0L;
    
    public  List <Student> getStudents(){
        return new ArrayList<>(Students.values());
    }
    public Student getDetails(Long id){
        return(Students.get(id));
    }
    public Student viewDetails(Long id){
        return(Students.get(id));
    }
    public List <Student> addDetails(Student std){
        index+=1L;
        std.setId(index);
        Students.put(index,std);
        return new ArrayList<>(Students.values());

    }
    public List <Student> delDetails(Long id){
        Students.remove(id);
        return (new ArrayList<>(Students.values()));
    }
    public List <Student> putDetails(long id, Student emp){
        emp.setId(id);
        Students.put(id,emp);
        return (new ArrayList<>(Students.values()));
    }
}
