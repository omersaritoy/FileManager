package com.cavcav.FileManager.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileInfo {
    private String name;
    private String url;

}
