package Controller;


import Service.dvdrentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/aps")
public class dvdrentalController {

    @Autowired
    dvdrentalService DvdrentalService;

    @GetMapping("/get_data")
    public List<Map<String, Object>> getdata(){
        try{
            List<Map<String, Object>> data;
            data = DvdrentalService.getdata();
            return data;
        }catch(Exception e){
            System.out.println("Exception");
            throw e;
        }
    }


}
