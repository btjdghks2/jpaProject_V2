package com.jpa.springControl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Comments")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;


    @Column
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member mamber;






}