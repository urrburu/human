package uruburu.company.humanResource.Service

import uruburu.company.humanResource.DTO.HumanResourceParameter
import uruburu.company.humanResource.Entity.HumanResource
import uruburu.company.humanResource.Repository.HumanResourceRepository

class HumanResourceServiceImpl : HumanResourceService{

    lateinit var humanResourceRepository: HumanResourceRepository

    override fun getHumanResourceList(humanResourceParameter: HumanResourceParameter): List<HumanResource> {
        return humanResourceRepository.getHumanResourceList(humanResourceParameter)
    }

    override fun getHumanResource(id: Long) {
        return humanResourceRepository.getOneHumanResource(id)
    }

    override fun addHumanResource(humanResource: HumanResource): HumanResource {
        TODO("Not yet implemented")
    }

    override fun deleteHumanResource(id: Long) {
        TODO("Not yet implemented")
    }

    override fun updateHumanResource(id: Long, updateHumanResource: HumanResourceParameter): HumanResource {
        TODO("Not yet implemented")
    }


}