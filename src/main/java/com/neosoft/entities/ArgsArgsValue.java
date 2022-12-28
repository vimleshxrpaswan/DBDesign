package com.neosoft.entities;


import lombok.*;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ArgsArgsValue {

   @Id
    private Long id;

    private Long argsId;


    private Long argsValueId;

    @ManyToOne
    @JoinColumn(name = "argsId")
    private MstArgsValue mstArgsValue;

    @ManyToOne
    @JoinColumn(name = "argsValueId")
    private MstArgsValue mstArgsValue1;


}
