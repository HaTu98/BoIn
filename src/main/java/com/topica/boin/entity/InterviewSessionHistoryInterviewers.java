package com.topica.boin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InterviewSessionHistoryInterviewers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer interviewSessionHistoryId;

    @Column
    private Integer interviewerId;

    @Column
    private Long timeSlice;

    @Column
    private String date;

    @Column
    private String role;

    @Column
    private String skill;

    @Column
    private String createdAt;

    @Column
    private String updatedAt;

    @Column
    private Boolean isDelete;
}
