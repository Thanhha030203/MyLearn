package thLab6.entity;

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



@NamedQueries({ @NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v"),
	@NamedQuery(name = "Video.findByFavorite", query = "SELECT DISTINCT f.video FROM Favorite f"),
	@NamedQuery(name = "Video.findInRange", query = "SELECT DISTINCT f.video FROM Favorite f WHERE f.likeDate BETWEEN :min AND :max"),
	@NamedQuery(name = "Video.findByKeyword", query = "SELECT DISTINCT f.video FROM Favorite f WHERE f.video.title LIKE :keyword"),
	@NamedQuery(name = "Video.findByUser", query = "SELECT f.video FROM Favorite f WHERE f.user.id = :id")
})
@NamedNativeQueries({
@NamedNativeQuery(name = "Video.random10", query = "SELECT TOP 3 * FROM VIDEO ORDER BY newid()", resultClass = Video.class)

})
@Entity
@Table(name = "VIDEO")
public class Video {
	@Id
	@Column(name = "ID")
	String id;
	@Column(name = "TITILE")
	String title;
	@Column(name = "POSTER")
	String poster;
	@Column(name = "DESCRIPTION")
	String description;
	@Column(name = "VIEWS")
	Integer views = 0;
	@Column(name = "ACTIVE")
	Boolean active = true;
	@OneToMany(mappedBy = "video")
	List<Favorite> favorites;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<Favorite> getFavorites() {
		return favorites;
	}
	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}
	
	
}
