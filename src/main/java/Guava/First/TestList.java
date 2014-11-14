package Guava.First;

import java.util.List;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class TestList {
	
	//加入值
	public static List testList() {
		List<String> lis = Lists.newArrayList("a", "b");
		lis.add("c");
		lis.add("d");
		lis.add("d");     			
		for (String sy : lis) {
			System.out.println(sy);
		}
		return lis;
	}
	
	//加入对象
	public static List test_addModel_List(Object obj){
		

		
		List<Object> li = Lists.newArrayList(obj);
		User u2 = new User("4", "5", 6);
		li.add(u2);
		return li;
	}
	
	//显示对象
	public static void test_showModel_list(List<User> lis){
		
		for(User u :lis){
				System.out.println(u.getName());
				System.out.println(u.getAge());
				System.out.println(u.getPas());
		}
	}
   
	
	
}
