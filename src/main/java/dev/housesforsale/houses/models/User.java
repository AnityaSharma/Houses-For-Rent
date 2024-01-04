package dev.housesforsale.houses.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usrtab")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String username;
    private String password;



}
