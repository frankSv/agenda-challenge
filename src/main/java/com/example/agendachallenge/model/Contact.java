package com.example.agendachallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "contactPhone", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Phone> phones;

    @OneToMany(mappedBy = "contactEmail", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Email> emails;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contact_type_id")
    private ContactType contactType;
}