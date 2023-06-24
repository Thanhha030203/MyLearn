package com.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name = "Video.find_Video_ByID",query = "Select o from Video o where o.ID =:id"),
	@NamedQuery(name = "Video.find_Video_ByFavorite",query = "Select o.video from Favorite o where o.video.ID =:id"),
	@NamedQuery(name = "Video.find_Video_ByUserId",query = "Select distinct o.video from Favorite o where o.user.ID like :username"),
	@NamedQuery(name = "Video.find_Video_ByShare",query = "Select o.video from Share o where o.video.ID =:id"),
	@NamedQuery(name = "Video.find_Video_ByUserId_Share",query = "Select o.video from Share o where o.user.ID =:id"),
	@NamedQuery(name = "Video.find_Video_Count",query = "Select count(o.user) from Favorite o where o.video.ID =:id")
})
@NamedNativeQueries({
	@NamedNativeQuery(name = "Video.Random",query = "Select TOP 6 * from VIDEO order by newid()", resultClass = Video.class ),
	
})
@Entity
@Table(name = "VIDEO")
public class Video {
	@Id 
	@Column(name = "ID")
	private  String ID;
	private String TITILE;
	private String POSTER;
	private int VIEWS;
	private String DESCRIPTION;
	private boolean ACTIVE;
	//video ở đây là biến được khai báo bên Favorite class
	@OneToMany(mappedBy = "video")
	List<Favorite> favorites;
	@OneToMany(mappedBy = "video")
	List<Share> share;
	
	public Video() {
		super();
	}

	@Override
	public String toString() {
		return "Video [ID=" + ID + ", TITILE=" + TITILE + ", POSTER=" + POSTER + ", VIEWS=" + VIEWS + ", DESCRIPTION="
				+ DESCRIPTION + ", ACTIVE=" + ACTIVE + ", favorites=" + favorites + ", share=" + share + "]";
	}

	public Video(String iD, String tITILE, String pOSTER, int vIEWS, String dESCRIPTION, boolean aCTIVE,
			List<Favorite> favorites, List<Share> share) {
	
		ID = iD;
		TITILE = tITILE;
		POSTER = pOSTER;
		VIEWS = vIEWS;
		DESCRIPTION = dESCRIPTION;
		ACTIVE = aCTIVE;
		this.favorites = favorites;
		this.share = share;
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

	public String getPOSTER() {
		return POSTER;
	}

	public void setPOSTER(String pOSTER) {
		POSTER = pOSTER;
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

	public List<Share> getShare() {
		return share;
	}

	public void setShare(List<Share> share) {
		this.share = share;
	}

	
}
