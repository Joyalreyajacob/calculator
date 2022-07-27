package mozanta.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appcontroller {

    @Autowired
    Appservice appservice;


    @GetMapping("/index")
    public List<Student> getStudents() {
        return appservice.getStudents();
    }
    @GetMapping("/indexs/{id}")
public Student getDetails(@PathVariable Long id){
    return appservice.getDetails(id);
}
@GetMapping("/view/")
public Student viewDetails(@RequestParam Long id){
    return appservice.viewDetails(id);
}
    @PostMapping("/add")
    public List <Student> addDetails(@RequestBody Student std){
        return appservice.addDetails(std);
    }
    


    @DeleteMapping("/delete/{id}")
    public List <Student> delDetails(@PathVariable Long id){
        return appservice.delDetails(id);
    }
    @PutMapping("/put/{id}")
    public List <Student> putDetails(@PathVariable Long id,@RequestBody Student emp){
        return appservice.putDetails(id,emp);
    }

// public Student getByStudent(PathVariable Long StudentId)
// {
//     return appservice.getByIdStudent(StudentId);
// }


// @PutMapping("/updatePro/{productId")
// public Student updateproduct(@PathVariable Long StudentId,@RequestBody Student prodt  )
// {
//     return appservice.updateStudent(StudentId,Student);
// }
// @DeleteMapping("/delete/{productId}")
// public Student delete(@PathVariable Long StudentId)
// {
//     return appservice.delete(StudentId);
// }
    

    
}
