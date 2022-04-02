package map.hashmap;

import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
import lombok.ToString;


@ToString
//@EqualsAndHashCode
@AllArgsConstructor
public class Student {
	public int sno;
	public String name;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student student) {
//	if(obj instanceof Student) {
//		Student student = (Student) obj;
			return(sno==student.sno) && (name.equals(student.name));
		} else {
			return false;
		} // if-else
	} // equals

	public int hashCode() {
		return sno + name.hashCode();
//		return Objects.hash(sno, name);
	}
}

