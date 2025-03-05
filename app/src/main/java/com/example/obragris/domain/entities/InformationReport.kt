package com.example.obragris.domain.entities

data class InformationReport(
    val reportId: Int,
    val nameProject: InformationProject,
    val userName: UserProject,
    val reportDate: String,
    val locationProject: InformationProject
)