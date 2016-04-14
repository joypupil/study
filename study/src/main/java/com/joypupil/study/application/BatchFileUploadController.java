package com.joypupil.study.application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;  
import org.springframework.web.multipart.MultipartHttpServletRequest;  
   
import javax.servlet.http.HttpServletRequest;  
import java.io.BufferedOutputStream;  
import java.io.File;  
import java.io.FileOutputStream;  
import java.util.List;  
   
/** 
 * 上传文件
 */  
   
@Controller
//@RestController
public class BatchFileUploadController {  
   
    @RequestMapping(value="/batch/upload", method= RequestMethod.POST)  
    public @ResponseBody  
    String handleFileUpload(UploadRequest uploadRequest, TestRequest testRequest, HttpServletRequest request){  
        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("file");  
//        System.out.println(abc);
        System.out.println(uploadRequest.getName());
        System.out.println(uploadRequest.getText());
        System.out.println(testRequest.getName());
        System.out.println(testRequest.getPassword());
        for (int i =0; i< files.size(); ++i) {  
            MultipartFile file = files.get(i);  
            String name = file.getName();  
            if (!file.isEmpty()) {  
                try {  
                    byte[] bytes = file.getBytes();  
                    BufferedOutputStream stream =  
                            new BufferedOutputStream(new FileOutputStream(new File(name + i)));  
                    stream.write(bytes);  
                    stream.close();  
                } catch (Exception e) {  
                    return "You failed to upload " + name + " => " + e.getMessage();  
                }  
            } else {  
                return "You failed to upload " + name + " because the file was empty.";  
            }  
        }  
        return "upload successful";  
    }  
}  