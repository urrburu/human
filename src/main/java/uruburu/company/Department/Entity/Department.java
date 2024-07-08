package uruburu.company.Department.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import uruburu.company.humanResource.Entity.HumanResource;

import java.util.Set;

@Getter
@Setter
@Embeddable
public class Department {

    @Id
    private String teamCode;

    private String teamName;

    private String upperTeamCode;

    private String teamLeaderId;

    @OneToMany
    private Set<HumanResource> teamMembers;


}