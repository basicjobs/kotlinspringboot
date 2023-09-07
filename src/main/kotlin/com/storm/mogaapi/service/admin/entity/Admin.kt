package com.storm.mogaapi.service.admin.entity

import jakarta.persistence.*

@Entity
@Table(name = "tb_admin", catalog = "okky")
class Admin(

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idx: Int,

    @Column(name = "NAME")
    var name: String,

    )