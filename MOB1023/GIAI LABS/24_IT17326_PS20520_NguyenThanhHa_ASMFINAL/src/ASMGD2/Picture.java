/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASMGD2;

/**
 *
 * @author Admin
 */
public enum Picture {
    PICTURE1(0,"1.jpg"),
    PICTURE2(1,"2.jfif"),
    PICTURE3(2,"3.jfif"),
    PICTURE4(3,"4.jfif"),
    PICTURE5(4,"5.png"),
    PICTURE6(5,"6.jfif"),
    PICTURE7(6,"7.jpg"),
    PICTURE8(7,"8.jfif");
    private int code;
    private String img;

    private Picture(int code, String img) {
        this.code = code;
        this.img = img;
    }
    public static String getImgs(int code){ 
        for(Picture p : Picture.values()){ 
            if(p.code == code){ 
                return p.img;
            }
        }
        return null;
    }
    private Picture() {
    }
    public int getCode() {
        return code;
    }

    public String getImg() {
        return img;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
