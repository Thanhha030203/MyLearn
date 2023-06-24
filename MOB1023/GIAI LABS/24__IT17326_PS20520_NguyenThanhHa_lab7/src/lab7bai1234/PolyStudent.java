
package lab7bai1234;

public class PolyStudent {
    public String fullname;
    public Career career;
    
    public void print(){
        System.out.println(">Fullname: "+ this.fullname);
        switch(this.career){
            case UDPM:  
                System.out.println(">Career: Ung dung phan mem");
                break;
            case TKTW:
                System.out.println(">Career: Thiet ke trang web");
                break;
            case LTDD:
                System.out.println(">Career: Lap trinh di dong");
                break;
            case TKDH: 
                System.out.println(">Career: Thiet ke do hoa");
                break;
        }
    }
}
