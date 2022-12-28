package com.neosoft.entities;

import lombok.*;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@MappedSuperclass
public class BaseEntity {

    @OneToOne
    private Status status;


    private LocalDateTime createdOn;


    private String createdBy;


    private LocalDateTime updatedOn;


    private String updatedBy;
}
