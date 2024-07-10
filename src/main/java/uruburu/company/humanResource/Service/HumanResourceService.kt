package uruburu.company.humanResource.Service

import jakarta.transaction.Transactional
import uruburu.company.Salary.Entity.Salary
import uruburu.company.humanResource.DTO.HumanResourceParameter
import uruburu.company.humanResource.Entity.HumanResource

@Transactional
interface HumanResourceService {

    fun getHumanResourceList(humanResourceParameter: HumanResourceParameter): List<HumanResource>
    fun getHumanResource(id: Long): HumanResource?
    fun addHumanResource(humanResourceParameter : HumanResourceParameter): HumanResource
    fun deleteHumanResource(id: Long)
    fun updateHumanResource(id: Long, updateHumanResource: HumanResourceParameter): HumanResource
    fun getHumanResourceListByDepartment(departmentId: Long): List<HumanResource>
    fun getDuplicatedHumanResourceCount(humanResourceParameter: HumanResourceParameter): Int
    fun updateHumanResourceSalary(id: Long, salary: Salary): HumanResource
    fun updateHumanResourceDepartment(id: Long, departmentId: Long): HumanResource

}