
package javaapplication3;

/**
 *
 * @author rgukt
 */
public class teacherbean {
    
    private int id;
    private String name;
    private float salary;
    private String dob;
    private String address;
    private String subject;

  
    
    
     public teacherbean(){}
    
    public teacherbean(int id, String name, float salary, String dob, String address, String subject) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dob = dob;
        this.address = address;
        this.subject = subject;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

} //teacher bean
