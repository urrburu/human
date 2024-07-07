package uruburu.company.humanResource.Service

import uruburu.company.humanResource.Entity.HumanResource

interface HumanResourceService {

    fun getHumanResourceList(): List<HumanResource>
    fun getHumanResource(id: Long): HumanResource

}