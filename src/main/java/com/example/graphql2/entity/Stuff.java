package com.example.graphql2.entity;

import com.example.graphql2.entity.info.Address;
import com.example.graphql2.entity.info.Contact;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stuff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;
    private String role;
    private Date creation_date;

    @OneToMany(mappedBy = "stuff")
    private List<Address> address = new ArrayList<>();
//
    @OneToMany(mappedBy = "stuff")
    private List<Contact> contacts = new ArrayList<>();
}
