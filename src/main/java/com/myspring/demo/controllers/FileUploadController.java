package com.myspring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(path = "/api/v1/file-upload")
public class FileUploadController {
    @PostMapping("")
    public void uploadFile(@RequestParam("file") MultipartFile file) {
        try {

        } catch (Exception ex) {

        }
    }
}
