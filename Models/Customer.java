package Models;

import Utils.UtilDate;
import java.time.LocalDate;

/**
 *
 * @author jprod
 */
public class Customer {
    private int id;
    private String name;
    private LocalDate birthdate;
    private String phone;
    private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    private int getAge() {
        return (birthdate != null)?UtilDate.calculateYears(birthdate):0;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(int id, String name, LocalDate birthdate,String phone,String email) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.phone=phone;
        this.email=email;
    }
    
    public Customer(int id, String name, LocalDate birthdate,String email) {
        this(id,name,birthdate,null,email);
    }
    
    public Customer(int id) {
        this(id,null,null,null,null);
    }
    
    public Customer() {
        this(0);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", birthdate=" + UtilDate.localDatetoString(birthdate) + ", phone=" + phone + ", email=" + email + '}';
    }

    
    
}
