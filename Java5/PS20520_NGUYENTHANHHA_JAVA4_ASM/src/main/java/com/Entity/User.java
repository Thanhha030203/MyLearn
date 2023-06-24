package com.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name = "User.find_User_ByID",query = "Select o from User o where ID =:id"),
	@NamedQuery(name = "User.find_User_ByID_PASSWORD",query = "Select o from User o where ID =:id AND PASSWORD =:password"),
	@NamedQuery(name = "User.find_User_ByID_PASSWORD_ADMIN",query = "Select o from User o where ID =:id AND PASSWORD =:password and ADMIN=:role"),
	@NamedQuery(name = "User.find_User_Byfavorite",query = "Select o.user from Favorite o where o.user.ID =:id"),
	@NamedQuery(name = "User.find_User_ByUserId_Share",query = "Select o.user from Share o where o.user.ID =:id")
})

@Entity
@Table(name = "USER_")
public class User {
	@Id
	private String ID;
	private String PASSWORD;
	private String FULLNAME;
	private String EMAIL;
	private String ADMIN;
	
	@OneToMany(mappedBy = "user")
	List<Favorite> favorites;
	@OneToMany(mappedBy = "user")
	List<Share> share;
	
	
	public User() {
		
	}
	public User(String iD, String pASSWORD, String fULLNAME, String eMAIL, String aDMIN, List<Favorite> favorites,
			List<Share> share) {
		ID = iD;
		PASSWORD = pASSWORD;
		FULLNAME = fULLNAME;
		EMAIL = eMAIL;
		ADMIN = aDMIN;
		this.favorites = favorites;
		this.share = share;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getFULLNAME() {
		return FULLNAME;
	}
	public void setFULLNAME(String fULLNAME) {
		FULLNAME = fULLNAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getADMIN() {
		return ADMIN;
	}
	public void setADMIN(String aDMIN) {
		ADMIN = aDMIN;
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
