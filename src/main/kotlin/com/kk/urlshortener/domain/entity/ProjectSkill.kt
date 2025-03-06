package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class ProjectSkill : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_skill_id")
    private var id: Long? = null
}