package entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class perform {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("POLYPU");
	static EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		try {
			em.getTransaction().begin();
			create();
			update();
			delete();
			findAll();
			findByRole(false);
			findKeyWord("ha");
			findOne("ha", "thanhha");
			findPage(1, 1);
			em.getTransaction().commit();
			System.out.println("Thành công");
		} catch (Exception e) {
			em.getTransaction().rollback();
			
			System.out.println("lỗi tại : "+e);
		}
		 

	}
	public static void create() {
		System.out.println("---------------------------------------");
		System.out.println("Use method Create()");
		User user = new User();
		user.setId("ha11");
		user.setPassword("thanhha");
		user.setFullname("Nguyễn Thanhha");
		user.setEmail("poly@gmail.com");
		user.setAdmin(false);
		em.persist(user);
		
	}
	public static void update() { 
		System.out.println("---------------------------------------");
		System.out.println("Use method Update()");
		// update một phần tử vô bảng
		//truy vấn thực thể theo id- tìm thực thể theo id
		User user = em.find(User.class,"ha");
		//thay đổi thông tin khi tìm thấy user muốn thay đooir
		user.setPassword("123454");
		user.setAdmin(false);
		//update lên sql sử dụng merge
		em.merge(user);
		System.out.println("Update thành công");
	}
	public static void delete() {
		System.out.println("---------------------------------------");
		System.out.println("Use method Delete()");
		// truy vấn thực thể theo id- tìm user trong sql theo id
		User user = em.find(User.class,"ha");
		//thực hiện xoá user mà tìm thấy trong sql
		em.remove(user);
		System.out.println("Delete thành công");
	}
	public static void findAll() { 
		System.out.println("---------------------------------------");
		System.out.println("Use method findAll()");
		//Viết truy vấn chú ý select ở đây không phải bảng trong sql server mà là class của đối tượng đó
		String sql = "select o from User o";
		//Tạo đối tượng truy vấn với thực thể là User
		TypedQuery<User> query = em.createQuery(sql,User.class);
		//Truy vâns cho vào list
		List<User> list = query.getResultList();
		for (User user : list) {
			System.out.println("FullName : "+ user.getFullname());
			System.out.println("Password : "+ user.getPassword());
		}
	}
	public static void findByRole(boolean role) {
		System.out.println("---------------------------------------");
		System.out.println("Use method findPByRole()");
		//Tạo dòng query 
		// vì sưer dụng select đến class nên cũng phải ở dạng class.biến tương ứng
		String sql = "Select o from  User o WHERE o.admin =:role";
			//Tạo đối tượng truy vấn với Kiểu dữu liệu là User
		TypedQuery<User> query = em.createQuery(sql,User.class);
		//Nếu muốn tìm chuỗi hoàn chỉnh thì sử dụng :var
		//set giá trị cho biến :role trong truy vấn
		query.setParameter("role", role);
			//truy vấn
		List<User> list = query.getResultList();
		for (User user : list) {
			System.out.println("FullName : "+ user.getFullname());
			System.out.println("Password : "+ user.getPassword());
		}
		
		
	}
	//truy vấn theo từ khoá
	public static void findKeyWord(String keyword) { 
		System.out.println("---------------------------------------");
		System.out.println("Use method findKeyWord()");
		String sql = "Select o from  User o where o.fullname like ?0";
		TypedQuery<User> query = em.createQuery(sql,User.class);
		//Nếu tìm theo chuỗi nhỏ trong chuõi lớn thì sử dung ?0
		query.setParameter(0,keyword);
		List<User> list = query.getResultList();
		for (User user : list) {
			System.out.println("FullName : "+ user.getFullname());
			System.out.println("Password : "+ user.getPassword());
		}
		
	}
	//Tìm một người theo id và pass
	public static void findOne(String id, String password) {
		System.out.println("---------------------------------------");
		System.out.println("Use method findOne()");
		String sql  = "Select o from  User o where o.id =:id and o.password=:password";
		TypedQuery<User> query = em.createQuery(sql,User.class);
		query.setParameter("id",id);
		query.setParameter("password",password);
		//ttruy vấn vì là cá nhân nên không cần sử dụng list
		User user = query.getSingleResult();
		System.out.println(">>Fullname: " + user.getFullname());
		System.out.println(">>Is Admin: " + user.isAdmin());
	}
	//truy vấn 1 trang 
	public static void findPage(int page, int size) {
		System.out.println("---------------------------------------");
		System.out.println("Use method findPage()");
			String sql = "select o from  User o";
			TypedQuery<User> query = em.createQuery(sql,User.class);
			query.setFirstResult(page*size);
			query.setMaxResults(size);
			//truy vấn
			List<User> list = query.getResultList();
			for (User user : list) {
				System.out.println("FullName : "+ user.getFullname());
				System.out.println("Password : "+ user.getPassword());
			}
		
	}
	

}
