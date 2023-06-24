package com.ps20520.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ps20520.SessionService;
import com.ps20520.UserDao;
import com.ps20520.entity.Users;

@Controller
public class UserController {
	@Autowired
	SessionService session;
	
	 @Autowired
	 UserDao userdao;
	 
	 @RequestMapping("/")
	 public String index(@ModelAttribute("UsersInfor") Optional<Users> userinfor,Model model) { 
		 listusers(model);
		 return "index";
	 }
	 @RequestMapping("/edit/{id}")
	 public String edit(@PathVariable("id") String id, Model model) { 
		 Users users = userdao.getById(id);
		 model.addAttribute("UsersInfor", users);
		 listusers(model);
		 session.set("useraction", users);
		 if(users.isAdmin()) { 
			 model.addAttribute("role","Admin");
		 }
		 else { 
			 model.addAttribute("role","User");
		 }
		 return "index";
	 }
	 public void listusers(Model model) { 
		 List<Users> listusers= userdao.findAll();
		 model.addAttribute("listUser", listusers);
	 }
	 @RequestMapping("admin/{action}")
	 public String update(@ModelAttribute("UsersInfor") Users userinfor, Model model, @PathVariable("action") String action) {  
		 switch (action) {
		case "create": {
			Users users = userdao.save(userinfor);
			 model.addAttribute("UsersInfor", users);
			 session.set("useraction", users);
			break;
		}
	case "update": {
		Users users = userdao.save(userinfor);
		 model.addAttribute("UsersInfor", users);
		
		 session.set("useraction", users);
		
			break;
		}
	case "delete": {
		userdao.deleteById(userinfor.getId());
		session.set("useracion", "");
		return "redirect:/";
	}
	case "reset": {
		
		return "redirect:/";
		
	}
		
		}
		 listusers(model);
		 return "index";
	 }
	 @RequestMapping("search")
	 public String search(@RequestParam("search") String name,Model model, @ModelAttribute("UsersInfor") Optional<Users> userinfor) { 
		 List<Users> listusers = userdao.findByFullnameLike("%"+name+"%");
		 model.addAttribute("listUser", listusers);
		 return "index";
	 }
	 @RequestMapping("/admin/login")
	 public String logins() { 
		 System.out.println("kjdkjf");
		 return "login";
	 }
	 @RequestMapping("/actionlogin")
	 public String actionlogins(@RequestParam("username") String username, @RequestParam("password")String password) { 
		 Users user = userdao.user(username, password);
		 session.set("user", user);
		 System.out.println("us"+user.getId());
		 return "redirect:/";
	 }
		@ModelAttribute("authss")
		public Map<Boolean, String> getGender(){ 
			Map<Boolean,String> map = new HashMap<>();
			map.put(true,"Admin");
			map.put(false, "User");
			return map;
		}
}
