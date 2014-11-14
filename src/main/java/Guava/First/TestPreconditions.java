package Guava.First;


import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

public class TestPreconditions {
  public static void ShowName(User u){
	  
	 // String name = PrcheckNotNull(u.getName());
	  
	  User user =Preconditions.checkNotNull(u);
	  
	  System.out.println(u);
	  
	  System.out.println("toString:"+Objects.toStringHelper("User").add("name", u.getName()));
	  
  }
  
  
}
