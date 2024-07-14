package uruburu.company.Department.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import uruburu.company.humanResource.Entity.HumanResource;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "TB_DEPARTMENT", indexes = {
        @Index(name = "idx_teamCode", columnList = "teamCode"),
        @Index(name="idx_teamName", columnList = "teamName")
})
public class Department {

    @Id
    private String teamCode;

    private String teamName;

    private String upperTeamCode;

    private Boolean isTaskForceTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentDepartment")
    private Department parentDepartment;

    @OneToMany(mappedBy = "parentDepartment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Department> childDepartments = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    private HumanResource teamLeader;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<HumanResource> teamManagers;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<HumanResource> teamMembers;


}