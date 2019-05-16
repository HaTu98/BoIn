package com.topica.boin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String title;

    @Column
    private String code;

    @Column
    private String description;

    @Column
    private String createdAt;

    @Column
    private String updatedAt;

    @Column
    private Boolean isDelete;
}
