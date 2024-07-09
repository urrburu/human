package uruburu.company.humanResource.Service

import uruburu.company.humanResource.DTO.HumanResourceParameter
import uruburu.company.humanResource.Entity.HumanResource

interface HumanResourceService {

    fun getHumanResourceList(humanResourceParameter: HumanResourceParameter): List<HumanResource>
    fun getHumanResource(id: Long): HumanResource?
    fun addHumanResource(humanResourceParameter : HumanResourceParameter): HumanResource
    fun deleteHumanResource(id: Long)
    fun updateHumanResource(id: Long, updateHumanResource: HumanResourceParameter): HumanResource
    fun duplicatedHumanResource(humanResourceParameter: HumanResourceParameter): Boolean
    fun getHumanResourceListByDepartment(departmentId: Long): List<HumanResource>

}