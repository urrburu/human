package uruburu.company.humanResource.APIController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uruburu.company.humanResource.DTO.HumanResourceParameter;
import uruburu.company.humanResource.Entity.HumanResource;
import uruburu.company.humanResource.Service.HumanResourceService;
import uruburu.company.humanResource.Service.HumanResourceServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/humanResource")
@RequiredArgsConstructor
public class HumanResourceAPIController {

    private final HumanResourceService humanResourceService = new HumanResourceServiceImpl();

    @RequestMapping("/getHumanResource/{id}")
    public HumanResource getHumanResource(Long id) {
        return humanResourceService.getHumanResource(id);
    }

    @RequestMapping("/addHumanResource")
    public HumanResource addHumanResource(HumanResource humanResource) {
        return humanResourceService.addHumanResource(humanResource);
    }

    @RequestMapping("/humanResourceList")
    public List<HumanResource> humanResourceList(HumanResourceParameter humanResourceParameter) {
        return humanResourceService.getHumanResourceList(humanResourceParameter);
    }

    @RequestMapping("/deleteHumanResource/{id}")
    public void deleteHumanResource(Long id) {
        humanResourceService.deleteHumanResource(id);
    }

    @RequestMapping("/updateHumanResource/{id}")
    public HumanResource updateHumanResource(Long id, HumanResourceParameter updateHumanResource) {
        return humanResourceService.updateHumanResource(id, updateHumanResource);
    }

}
