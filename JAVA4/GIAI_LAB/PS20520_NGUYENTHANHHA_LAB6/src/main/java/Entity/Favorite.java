package Entity;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
//@NamedQueries({
//	@NamedQuery(name = "Video.finByKeyWord",
//			query="Select distinct o.video from Favorite o where o.video.TITILE like :keyword"
//			),
//	@NamedQuery(name = "Video.finByUser",
//	query="Select distinct o.video from Favorite o where o.user.ID like :username"
//	),
//	@NamedQuery(name = "Video.finByInRange",
//	query="Select distinct o.video from Favorite o where o.likeDate BETWEEN :min AND :max"
//	),
//	@NamedQuery(name = "Video.findInMonths",
//	query="Select distinct o.video from Favorite o where month( o.likeDate ) in (:months)"
//	),
//
//})


@Entity
//Ở đây siuwr dụng uniqueConstraints ĐỂ CHO BIẾT RÀNG BUỘC RẰNG CỌT LÀ DUY NHẤT Ở ĐÂY LÀ CẶP USER VÀ VIDEO LÀ DUY NHÂT
@Table(name = "FAVORITE", uniqueConstraints = {@UniqueConstraint(columnNames = { "USER_ID","VIDEO_ID"})})
public class Favorite {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID ;
	//ở đây lấy tên cột trong bảng favorites trong sql để đi liên kết nên là  USER_ID
	@ManyToOne @JoinColumn(name = " USER_ID")
	User user;
	//ở đây lấy tên cột trong bảng favorites trong sql để đi liên kết nên là VIDEO_ID
	@ManyToOne @JoinColumn(name = "VIDEO_ID")
	//sau đó gán kiểu dữ liệu là Video class cho biến video để trong java
	Video video;
	
	//Định dạng kiểu dữ liệu là DATE . sẽ có DATE/Time/Timestamp
	@Temporal(TemporalType.DATE)
	private Date likeDate;

	@Override
	public String toString() {
		return "Favorite [ID=" + ID + ", user=" + user + ", video=" + video + ", likeDate=" + likeDate + "]";
	}

	public Favorite(int iD, User user, Video video, Date likeDate) {

		ID = iD;
		this.user = user;
		this.video = video;
		this.likeDate = likeDate;
	}

	public Favorite() {

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Date getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Date likeDate) {
		this.likeDate = likeDate;
	}
	
	
}
