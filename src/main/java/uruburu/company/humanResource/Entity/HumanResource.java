package uruburu.company.humanResource.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import uruburu.company.Department.Entity.Department;
import uruburu.company.Salary.Entity.Salary;

import java.time.LocalDate;

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
    private String position;

    @Embedded
    @Setter
    private Department department;

    @Embedded@Setter
    private Salary salary;

    public HumanResource(String name, LocalDate birthDate, String position, Department department) {
        this.name = name;
        this.birthDate = birthDate;
        this.position = position;
        this.department = department;
    }

}
