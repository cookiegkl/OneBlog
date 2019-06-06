package com.zyd.blog.business.enums;

/**
 * @author Alex
 */
public enum FileUploadType {
    COMMON("blog/"),
    QRCODE("blog/qrcode/"),
    SIMPLE("blog/article/"),
    COVER_IMAGE("blog/cover/");

    private String path;

    FileUploadType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
