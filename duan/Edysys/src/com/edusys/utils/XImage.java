package com.edusys.utils;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import java.net.URL;

public class XImage {
     public static Image getAppIcon() {
        URL url = XImage.class.getResource("/com/edusys/icon/logo.png");
        return new ImageIcon(url).getImage();
    }

    public static void save(File src) {
        File dst = new File("src/logos/", src.getName());
        if (dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();// Tạo thư mục logos nếu chưa tồn tại
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING); // Copy file vào thư mục logos
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("src/logos/", fileName);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(200, 250, Image.SCALE_DEFAULT));
    }
}