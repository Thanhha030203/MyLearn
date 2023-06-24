package com.PS20520.implement;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.PS20520.database.DB;
import com.PS20520.entity.Item;
import com.PS20520.service.ShoppingCartService;

@SessionScope
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	 Map<Integer, Item> map = new HashMap<>();
	 
	 @Override
	 public Item add(Integer id) {
			// TODO Auto-generated method stub
			Set set = DB.items.keySet();
			for(Object key:set) {
				if(DB.items.get(key).getId() == id) {
					map.put((Integer) key, DB.items.get(key));
					map.get(key).setQty(1);
					return DB.items.get(key);
				}
			}
			return null;
//	public Item add(Integer id) {
//		// TODO Auto-generated method stub
//		 for (Map.Entry<Integer, Item> item : map.entrySet()) {
//	            if(item.getKey() == id) { 
//	            	item.getValue().setQty(item.getValue().getQty()+1);
//	            	return item.getValue();
//	            }
//	            else { 
//	            	Item item2 = DB.items.get(id);
//	            	map.put(id,item2);
//	            	return item2;
//	            } 
//		 }
//		return null;
		
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		Set set = map.keySet();
		for(Object key:set) {
			if(map.get(key).getId() == id) {
				map.remove(key);
				break;
			}
		}
	}

	@Override
	public Item update(Integer id, int qty) {
		// TODO Auto-generated method stub
		Set set = map.keySet();
		for(Object key:set) {
			if(map.get(key).getId() == id) {
				map.get(key).setQty(qty);
				map.replace((Integer) key, map.get(key));
				return map.get(key);
			}
		}
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		map.clear();
	}

	@Override
	public Collection<Item> getItems() {
		// TODO Auto-generated method stub
		// nó sẽ bằng    Collection<String> values = map.values();
		return map.values();
				}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		int count = 0;
		Set set = map.keySet();
		for(Object key:set) {
			count+=map.get(key).getQty();
		}
		return count;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		int amount = 0;
		Set set = map.keySet();
		for(Object key:set) {
			amount+=(map.get(key).getQty()*map.get(key).getPrice());
		}
		return amount;
	}
	
}
