package com.example;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.UnsupportedEncodingException;

/**
 * Created by wangz on 2017/5/24.
 */
public class UploadAction extends ActionSupport{
    private File file;
    private String contentType;
    private String filename;
    private String fileMessage;

    public void setUpload(File file) {
        this.file = file;
    }

    public void setUploadContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setUploadFileName(String filename) {
        this.filename = filename;
    }

    @Override
    public String execute() throws UnsupportedEncodingException {
        if (file == null || !contentType.toString().equals("audio/mp3")) {
            fileMessage = new String("文件类型不正确".getBytes(), "utf-8");
            return "error";
        }
        System.out.println("File name: "+filename.toString());
        System.out.println("MIME type: "+contentType.toString());
        return "success";
    }

    public String getFileMessage() {
        return fileMessage;
    }

    public void setFileMessage(String fileMessage) {
        this.fileMessage = fileMessage;
    }

}
