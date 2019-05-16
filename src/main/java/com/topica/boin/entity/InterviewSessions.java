package com.topica.boin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InterviewSessions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer interviewRoundId;

    @Column
    private Integer sessionOrdinal;

    @Column
    private Integer slotMin;

    @Column
    private  Integer slotMax;

    @Column
    private String createdAt;

    @Column
    private String updatedAt;

    @Column
    private Boolean isDelete;
}
