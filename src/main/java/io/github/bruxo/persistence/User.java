package io.github.bruxo.persistence;


public class User {
	 
    private int id;
    private String name;
    private Integer age;
    private Integer dept;
 
	public Integer getDept() {
		return dept;
	}

	public void setDept(Integer dept) {
		this.dept = dept;
	}

	public User() {
    }
 
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
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
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
}
