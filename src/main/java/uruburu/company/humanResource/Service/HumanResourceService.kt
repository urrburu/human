package uruburu.company.humanResource.Service

import uruburu.company.humanResource.DTO.HumanResourceParameter
import uruburu.company.humanResource.Entity.HumanResource

interface HumanResourceService {

    fun getHumanResourceList(humanResourceParameter: HumanResourceParameter): List<HumanResource>
    fun getHumanResource(id: Long)
    fun addHumanResource(humanResource: HumanResource): HumanResource
    fun deleteHumanResource(id: Long)
    fun updateHumanResource(id: Long, updateHumanResource: HumanResourceParameter): HumanResource
}