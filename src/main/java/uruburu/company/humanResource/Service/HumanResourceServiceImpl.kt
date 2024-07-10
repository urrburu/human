package uruburu.company.humanResource.Service

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import uruburu.company.Salary.Entity.Salary
import uruburu.company.humanResource.DTO.HumanResourceParameter
import uruburu.company.humanResource.Entity.HumanResource
import uruburu.company.humanResource.Repository.HumanResourceRepository

@Service
class HumanResourceServiceImpl : HumanResourceService{

    lateinit var humanResourceRepository: HumanResourceRepository

    override fun getHumanResourceList(humanResourceParameter: HumanResourceParameter): List<HumanResource> {
        return humanResourceRepository.getHumanResourceList(humanResourceParameter)
    }

    override fun getHumanResource(id: Long) : HumanResource? {
        return humanResourceRepository.getOneHumanResource(id)
    }

    override fun addHumanResource(humanResourceParameter: HumanResourceParameter): HumanResource {
        val humanResource = HumanResource(humanResourceParameter.name, humanResourceParameter.birthDate, humanResourceParameter.position, humanResourceParameter.department)
        return humanResourceRepository.addHumanResource(humanResource)
    }

    override fun deleteHumanResource(id: Long) {
        TODO("Not yet implemented")
    }

    override fun updateHumanResource(id: Long, updateHumanResource: HumanResourceParameter): HumanResource {
        TODO("Not yet implemented")
    }


    override fun getHumanResourceListByDepartment(departmentId: Long): List<HumanResource> {
        TODO("Not yet implemented")
    }

    override fun getDuplicatedHumanResourceCount(humanResourceParameter: HumanResourceParameter): Int {
        return humanResourceRepository.getDuplicatedHumanResourceCount(humanResourceParameter)
    }

    override fun updateHumanResourceSalary(id: Long, salary: Salary): HumanResource {
        humanResourceRepository.updateHumanResourceSalary(id, salary)
        return humanResourceRepository.getOneHumanResource(id)!!
    }

    override fun updateHumanResourceDepartment(id: Long, departmentId: Long): HumanResource {
        TODO("Not yet implemented")
    }


}