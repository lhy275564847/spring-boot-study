package com.oceanleo.springboot._4._6_upload;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author haiyang.li
 */
@Controller
@RequestMapping("/_6")
public class UploadController {

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("D:/upload/" + file.getOriginalFilename()), file.getBytes());
            return "OK";
        } catch (IOException e) {
            e.printStackTrace();
            return "Fail";
        }

    }
}
