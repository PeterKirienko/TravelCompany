package person;

public class Person {
	private int idPerson;
	private String name;
	private int age;

	  public Person(String name, Integer idPerson, Integer age) {
      this.name = name;
      this.idPerson = idPerson;
      this.age = age;
    }

    public Person() {

    }

    public Integer  getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public Integer  getAge() {
        return age;
    }

    public void setAge(Integer  age) {
        this.age = age;
    }

}

    
    
    
    
    	
