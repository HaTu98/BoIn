package com.topica.boin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CandidateSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer candidateId;

    @Column
    private Integer skillId;

    @Column
    private String createdAt;

    @Column
    private String updatedAt;

    @Column
    private Boolean isDelete;
}
