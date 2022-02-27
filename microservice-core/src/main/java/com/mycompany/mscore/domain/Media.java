package com.mycompany.mscore.domain;

import org.apache.kafka.common.protocol.types.Field;

public class Media {

    private String caption;

    private int fileSize;

    private String fileName;

    public MediaType MediaType;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public com.mycompany.mscore.domain.MediaType getMediaType() {
        return MediaType;
    }

    public void setMediaType(com.mycompany.mscore.domain.MediaType mediaType) {
        MediaType = mediaType;
    }


}
