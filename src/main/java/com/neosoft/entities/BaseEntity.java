package com.neosoft.entities;

import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class BaseEntity {


    private Status status;


    private LocalDateTime createdOn;


    private String createdBy;


    private LocalDateTime updatedOn;


    private String updatedBy;
}
