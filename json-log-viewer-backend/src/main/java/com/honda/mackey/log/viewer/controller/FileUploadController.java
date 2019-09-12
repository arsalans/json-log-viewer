package com.honda.mackey.log.viewer.controller;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(path = "/api/mackey/file/upload")
public class FileUploadController {

    @CrossOrigin()
    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {

//        final Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .serializeNulls()
//                .disableHtmlEscaping()
//                .create();
//
//        byte[] bytes = multipartFile.getBytes();
//        String contentString = new String(bytes);
//        final String gsonString = gson.toJson(contentString);
//        String macKeyLogFileInJson = gsonString
//                .replaceAll("\\\\n", "\n")
//                .replaceAll("\\\\t", "\t")
//                .replaceAll("\\\\b", "\b")
//                .replaceAll("\\\\r", "\r")
//                .replaceAll("\\\\f", "\f")
//                .replaceAll("\\\\'", "\'")
//                .replaceAll("\\\\", "");

        byte[] bytes = multipartFile.getBytes();
        String contentString = new String(bytes);
        return ResponseEntity.ok(contentString);
    }

}
