package com.neosoft.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String routeName;


    private String requestType;


    private String request;


    private String reqHeaders;


    private String response;


    private String resHeaders;


    private String statusCode;


    private String remoteAddress;


    private String apiKey;


    private LocalDateTime createdOn;


    private String createdBy;
}

