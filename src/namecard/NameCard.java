/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namecard;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
//Serializable giúp đọc đối tượng từ file
public class NameCard implements Serializable{

    private String name;
    private String address;
    private String phone;
    private String email;
    private String image;

    public NameCard(String name, String address, String phone, String email, String image) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.image = image;
    }

    public NameCard() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "NameCard{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + ", image=" + image + '}';
    }
    


}
