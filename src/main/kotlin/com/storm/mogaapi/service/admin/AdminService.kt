package com.storm.mogaapi.service.admin

import com.storm.mogaapi.service.admin.entity.Admin
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class AdminService(
    private val adminRepository: AdminRepository
) {

    fun findById(adminId: Long):Admin? {
        return adminRepository.findByIdOrNull(adminId)
    }

}