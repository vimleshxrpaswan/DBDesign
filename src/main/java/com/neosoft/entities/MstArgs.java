package com.neosoft.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class MstArgs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;


    private String value;

    @OneToMany(mappedBy = "id")
    private Set<MstArgsValue> mstArgsValues;


}
