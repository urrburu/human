package uruburu.company.humanResource.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import uruburu.company.Department.Entity.Department;
import uruburu.company.Salary.Entity.Salary;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity@Getter
@Table(name = "TB_HR_HUMAN", indexes = {
        @Index(name = "idx_name", columnList = "name"),
        @Index(name="idx_id", columnList = "id")
})
@NoArgsConstructor
public class HumanResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.LONG32NVARCHAR)
    private Long id;

    @Column(name = "name", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    @Setter
    private String name;

    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name = "position", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    @Setter
    private String position;

    @Setter
    private String grade;

    @Setter
    private Boolean isLeader;

    @Setter
    private Boolean isManager;

    @Setter@OneToOne(fetch = FetchType.LAZY)
    private Department department;

    @Setter
    @OneToOne(fetch = FetchType.LAZY)
    private Salary salary;

    @Setter
    private LocalDateTime joinDate;

    private LocalDateTime quitDate;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

}
