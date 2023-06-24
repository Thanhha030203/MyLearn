package Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table (name = "USER_")
public class User {
	@Id
	private String ID;
	private String PASSWORD;
	private String EMAIL;
	private String FULLNAME;
	private boolean ADMIN;
	//user ở đây là biến được khai báo bên Favorite class
	@OneToMany(mappedBy = "user")
	List<Favorite> favorites;
	public List<Favorite> getFavorites() {
		return favorites;
	}
	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}
	public User(String iD, String pASSWORD, String eMAIL, String fULLNAME, boolean aDMIN) {
	
		ID = iD;
		PASSWORD = pASSWORD;
		EMAIL = eMAIL;
		FULLNAME = fULLNAME;
		ADMIN = aDMIN;
	}
	public User() {
		
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
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getFULLNAME() {
		return FULLNAME;
	}
	public void setFULLNAME(String fULLNAME) {
		FULLNAME = fULLNAME;
	}
	public boolean isADMIN() {
		return ADMIN;
	}
	public void setADMIN(boolean aDMIN) {
		ADMIN = aDMIN;
	}
	
	
}
