package entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.Entity;

public class UserDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("POLYPU");
	static EntityManager em = emf.createEntityManager();

	public UserDao() {
	
	}

	public static User create(User u) {
		em.getTransaction().begin();
		User user = new User();
		try {

			System.out.println("---------------------------------------");
			System.out.println("Use method Create()");

			user = u;
			em.persist(user);
			em.getTransaction().commit();
			System.out.println("Thành công");
		} catch (Exception e) {
		
			em.getTransaction().rollback();
			System.out.println("lỗi tại : " + e);
		}
		return user;

	}

	public static void update(String id, User u) {
		em.getTransaction().begin();
		System.out.println("---------------------------------------");
		System.out.println("Use method Update()");
		// update một phần tử vô bảng
		// truy vấn thực thể theo id- tìm thực thể theo id

		try {

			User user = em.find
					(User.class, id);
			// thay đổi thông tin khi tìm thấy user muốn thay đooir
			user = u;
			// update lên sql sử dụng merge
			em.merge(user);
			em.getTransaction().commit();
			System.out.println("Update thành công");

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("lỗi tại update : " + e);
		}

	}

	public static void delete(String id) {
		try {
			em.getTransaction().begin();
		System.out.println("---------------------------------------");
		System.out.println("Use method Delete()");

		
			

			// truy vấn thực thể theo id- tìm user trong sql theo id
			User user = em.find(User.class, id);
			// thực hiện xoá user mà tìm thấy trong sql
			em.remove(user);
			em.getTransaction().commit();
			System.out.println("Delete thành công");

			System.out.println("Thành công");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("lỗi tại xoá : " + e);
		}
	}

	public static List<User> findAll() {
		try {
		em.getTransaction().begin();
		System.out.println("---------------------------------------");
		System.out.println("Use method findAll()");
		List<User> list;

		// Viết truy vấn chú ý select ở đây không phải bảng trong sql server mà là class
		// của đối tượng đó
		String sql = "select o from User o";
		// Tạo đối tượng truy vấn với thực thể là User
		TypedQuery<User> query = em.createQuery(sql, User.class);
		// Truy vâns cho vào list
		list = query.getResultList();
		for (User user : list) {
			System.out.println("FullName : " + user.getFullname());
			System.out.println("Password : " + user.getPassword());
		}
		System.out.println("Thành công");
		em.getTransaction().commit();
		return list;
		}
		catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			return null;
		}
		

	}

	public static List<User> findByRole(boolean role) {

		System.out.println("---------------------------------------");
		System.out.println("Use method findPByRole()");
		List<User> list;
		try {

			// Tạo dòng query
			// vì sưer dụng select đến class nên cũng phải ở dạng class.biến tương ứng
			String sql = "Select o from  User o WHERE o.admin =:role";
			// Tạo đối tượng truy vấn với Kiểu dữu liệu là User
			TypedQuery<User> query = em.createQuery(sql, User.class);
			// Nếu muốn tìm chuỗi hoàn chỉnh thì sử dụng :var
			// set giá trị cho biến :role trong truy vấn
			query.setParameter("role", role);
			// truy vấn
			list = query.getResultList();
			for (User user : list) {
				System.out.println("FullName : " + user.getFullname());
				System.out.println("Password : " + user.getPassword());
			}
			System.out.println("Thành công");
			return list;
		} catch (Exception e) {
		
			System.out.println("lỗi tại : " + e);
			return null;
		}
	}
	public static User findById(String id) {
		
		System.out.println("---------------------------------------");
		System.out.println("Use method findById()");

		try {

			// Tạo dòng query
			// vì sưer dụng select đến class nên cũng phải ở dạng class.biến tương ứng
			String sql = "Select o from  User o WHERE o.id =:id";
			// Tạo đối tượng truy vấn với Kiểu dữu liệu là User
			TypedQuery<User> query = em.createQuery(sql, User.class);
			// Nếu muốn tìm chuỗi hoàn chỉnh thì sử dụng :var
			// set giá trị cho biến :role trong truy vấn
			query.setParameter("id", id);
			// truy vấn

			User user = query.getSingleResult();
			if (user != null) {
				System.out.println(" tìm thấy user");

			} else {
				System.out.println("không tìm thấy user");
				
			}
		
			System.out.println("Thành công");
			return user;
		} catch (Exception e) {
			

			System.out.println("lỗi tại : " + e);
			return null;
		}

	}

	// truy vấn theo từ khoá
	public static void findKeyWord(String keyword) {
		System.out.println("---------------------------------------");
		System.out.println("Use method findKeyWord()");
		String sql = "Select o from  User o where o.fullname like ?0";
		TypedQuery<User> query = em.createQuery(sql, User.class);
		// Nếu tìm theo chuỗi nhỏ trong chuõi lớn thì sử dung ?0
		query.setParameter(0, keyword);
		List<User> list = query.getResultList();
		for (User user : list) {
			System.out.println("FullName : " + user.getFullname());
			System.out.println("Password : " + user.getPassword());
		}

	}

	// Tìm một người theo id và pass
	public static User findOne(String id, String password) {
		try {
			em.getTransaction().begin();
		System.out.println("---------------------------------------");
		System.out.println("Use method findOne()");
		String sql = "Select o from  User o where o.id =:id and o.password=:password";
		TypedQuery<User> query = em.createQuery(sql, User.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		// ttruy vấn vì là cá nhân nên không cần sử dụng list
		User user = query.getSingleResult();
		if (user != null) {
			System.out.println(" tìm thấy user");

		} else {
			System.out.println("Không tồn tại User");
			return null;
			
		}
		System.out.println(">>Fullname: " + user.getFullname());
		System.out.println(">>Is Admin: " + user.isAdmin());
		em.getTransaction().commit();
		return user;
		}
		catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			return null;
		}
	}

	// truy vấn 1 trang
	public static void findPage(int page, int size) {
		System.out.println("---------------------------------------");
		System.out.println("Use method findPage()");
		String sql = "select o from  User o";
		TypedQuery<User> query = em.createQuery(sql, User.class);
		query.setFirstResult(page * size);
		query.setMaxResults(size);
		// truy vấn
		List<User> list = query.getResultList();
		for (User user : list) {
			System.out.println("FullName : " + user.getFullname());
			System.out.println("Password : " + user.getPassword());
		}

	}

	public void end() {
		try {
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		
		}

	}
}
