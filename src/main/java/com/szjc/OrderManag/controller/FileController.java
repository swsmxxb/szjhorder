package com.szjc.OrderManag.controller;


import com.szjc.OrderManag.common.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;


@RestController
    @RequestMapping("/file")
    public class FileController {
        /**
         * 单文件上传
         *
         * @param file
         * @param request
         * @return
         */
        @Value("${web.upload-path}inventroypic/")
        private String path;

        @PostMapping("/upload")
        @ResponseBody
        public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
            if (!file.isEmpty()) {
                String saveFileName = file.getOriginalFilename();
                //File saveFile = new File(request.getSession().getServletContext().getRealPath("upload/") + saveFileName);
                File saveFile = new File(path + saveFileName);
                if (!saveFile.getParentFile().exists()) {
                    saveFile.getParentFile().mkdirs();
                }
                try {
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
                    out.write(file.getBytes());
                    out.flush();
                    out.close();
                    return ("上传成功");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    return ("上传失败," + e.getMessage());
                } catch (IOException e) {
                    e.printStackTrace();
                    return ("上传失败," + e.getMessage());
                }
            } else {
                return ("上传失败，因为文件为空.");
            }
        }

        /**
         * 多文件上传
         *
         * @param request
         * @return
         */
        @PostMapping("/uploadFiles")
        @ResponseBody
        public String uploadFiles(HttpServletRequest request) throws IOException {
//            File savePath = new File(request.getSession().getServletContext().getRealPath("/upload/"));
            File savePath = new File(path);
            if (!savePath.exists()) {
                savePath.mkdirs();
            }
            List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
            MultipartFile file = null;
            BufferedOutputStream stream = null;
            for (int i = 0; i < files.size(); ++i) {
                file = files.get(i);
                if (!file.isEmpty()) {
                    try {
                        byte[] bytes = file.getBytes();
                        File saveFile = new File(savePath, file.getOriginalFilename());
                        stream = new BufferedOutputStream(new FileOutputStream(saveFile));
                        stream.write(bytes);
                        stream.close();
                    } catch (Exception e) {
                        if (stream != null) {
                            stream.close();
                            stream = null;
                        }
                        return "第 " + i + " 个文件上传有错误" + e.getMessage();
                    }
                } else {
                    return "第 " + i + " 个文件为空";
                }
            }
            return "所有文件上传成功";
        }
    }


