package aliendetails;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Oracle 
{
@Id
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Oracle [id=" + id + ", name=" + name + "]";
}


}
