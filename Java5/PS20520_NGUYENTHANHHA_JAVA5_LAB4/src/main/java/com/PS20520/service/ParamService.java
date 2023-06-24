package com.PS20520.service;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import jakarta.servlet.http.HttpServletRequest;

@Service
public class ParamService {
	
	@Autowired
	HttpServletRequest request;
	
	public String getString(String name, String defaultValue) { 
		if(request.getParameter(name)!=null) { 
			return request.getParameter(name);
		}
		else { 
			return defaultValue;
		}
		
	}
	public int getInt(String name,int defaultValue) { 
		if(request.getParameter(name)!=null) { 
			return Integer.parseInt(request.getParameter(name));
		}
		else { 
			return defaultValue;
		}
		
	}
	public double getDouble(String name,double defaultValue) { 
		if(request.getParameter(name)!=null) { 
			return Double.parseDouble(request.getParameter(name));
		}
		else { 
			return defaultValue;
		}	
	}
	public boolean getBoolean(String name,boolean defaultValue) throws RuntimeException { 
		if(request.getParameter(name)!=null) { 
			return Boolean.parseBoolean(request.getParameter(name));
		}
		else { 
			return defaultValue;
		}	
	}
	public Date getDate(String name,String defaultValue) throws RuntimeException, ParseException { 
		if(request.getParameter(name)!=null) { 
			return new SimpleDateFormat().parse(request.getParameter(name));
		}
		else { 
			return new SimpleDateFormat().parse(defaultValue);
		}	
	}
	public File save(MultipartFile file , String path) throws RuntimeException, IOException {
	if(file!=null) {
		
		File dir = new File(path);
		
		if(!dir.exists()) { 
			dir.mkdirs();	
		}
		MultipartFile multipartFile = file;
		String filename = multipartFile.getOriginalFilename();
		File files = new File(dir,filename);
		multipartFile.transferTo(files);
		return files;
	}
	return null;
		
		
	}
}



