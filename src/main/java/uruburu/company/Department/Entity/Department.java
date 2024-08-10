package uruburu.company.Department.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uruburu.company.humanResource.Entity.HumanResource;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "TB_CM_DEPARTMENT", indexes = {
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
    @JoinColumn(name = "PARENT_DEPARTMENT")
    private Department parentDepartment;

    @OneToMany(mappedBy = "CHILD_DEPARTMENT", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Department> childDepartments = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    private HumanResource teamLeader;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<HumanResource> teamManagers;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<HumanResource> teamMembers;

    public Department(String teamCode, String teamName, String upperTeamCode, Boolean isTaskForceTeam) {
        this.teamCode = teamCode;
        this.teamName = teamName;
        this.upperTeamCode = upperTeamCode;
        this.isTaskForceTeam = isTaskForceTeam;
    }}
