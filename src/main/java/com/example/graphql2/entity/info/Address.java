package com.example.graphql2.entity.info;


import com.example.graphql2.entity.Customer;
import com.example.graphql2.entity.Stuff;
import com.example.graphql2.entity.User;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String title;

    private String location;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    private Stuff stuff;
}
