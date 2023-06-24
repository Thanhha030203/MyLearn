package Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@NamedQueries({
	@NamedQuery(name = "Video.finByKeyWord",
			query="Select distinct o.video from Favorite o where o.video.TITILE like :keyword"
			),
	@NamedQuery(name = "Video.finByUser",
	query="Select distinct o.video from Favorite o where o.user.ID like :username"
	),
	@NamedQuery(name = "Video.finByInRange",
	query="Select o.video from Favorite o where o.likeDate BETWEEN :min AND :max"
	),
	@NamedQuery(name = "Video.findInMonths",
	query="Select distinct o.video from Favorite o where month( o.likeDate ) IN (:months)"
	),
})

//Sử dụng tên và cột trong sql nên phải  thông báo lớp trả về
@NamedNativeQueries({
	@NamedNativeQuery(name = "Report.Random",query = "Select TOP 3 * from VIDEO order by newid()", resultClass = Video.class )
})
@Entity
@Table(name = "VIDEO")
public class Video {
	@Id
	private String ID;
	private String TITILE;
	private String POSTER;
	private int VIEWS;
	private String DESCRIPTION;
	private boolean ACTIVE;
	//video ở đây là biến được khai báo bên Favorite class
	@OneToMany(mappedBy = "video")
	List<Favorite> favorites;
	public Video(String iD, String tITILE, String pOST, int vIEWS, String dESCRIPTION, boolean aCTIVE,
			List<Favorite> favorites) {
	
		ID = iD;
		TITILE = tITILE;
		POSTER = pOST;
		VIEWS = vIEWS;
		DESCRIPTION = dESCRIPTION;
		ACTIVE = aCTIVE;
		this.favorites = favorites;
	}
	public Video() {
	
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTITILE() {
		return TITILE;
	}
	public void setTITILE(String tITILE) {
		TITILE = tITILE;
	}
	public String getPOST() {
		return POSTER;
	}
	public void setPOST(String pOST) {
		POSTER = pOST;
	}
	public int getVIEWS() {
		return VIEWS;
	}
	public void setVIEWS(int vIEWS) {
		VIEWS = vIEWS;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public boolean isACTIVE() {
		return ACTIVE;
	}
	public void setACTIVE(boolean aCTIVE) {
		ACTIVE = aCTIVE;
	}
	public List<Favorite> getFavorites() {
		return favorites;
	}
	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}
	
}
