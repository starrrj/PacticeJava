package ch15_collection_framework.set;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
@AllArgsConstructor
public class Member extends Object {
	public String name;
	public int age;
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			return member.name.equals(name) && (member.age==age);
//		} else {
//			return false;
//		}
//	} // equals
//	
//	@Override
//	public int hashCode() { // Oid
////		return name.hashCode() + age;
//		return Objects.hash(name,age);
//		
//	} // hashCode
}// end class
