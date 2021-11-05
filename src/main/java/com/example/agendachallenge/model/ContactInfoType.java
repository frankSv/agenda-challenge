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
@Table(name = "info_type")
public class ContactInfoType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "infoPhone", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Phone> phones;

    @OneToMany(mappedBy = "infoEmail", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Email> emails;
}
