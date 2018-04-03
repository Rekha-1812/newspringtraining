package bootsample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="t_tasks")
public class Task implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private String description;
@Temporal(TemporalType.TIMESTAMP)
private Date datecreated;
private boolean finished;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getDatecreated() {
	return datecreated;
}
public void setDatecreated(Date datecreated) {
	this.datecreated = datecreated;
}
public boolean isFinished() {
	return finished;
}
public void setFinished(boolean finished) {
	this.finished = finished;
}
public Task( String name, String description, Date datecreated, boolean finished) {
	super();

	this.name = name;
	this.description = description;
	this.datecreated = datecreated;
	this.finished = finished;
}
public Task() {
	super();
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Task [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated=" + datecreated
			+ ", finished=" + finished + "]";
}
}
