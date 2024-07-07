package uruburu.company.humanResource.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity@Getter
public class HumanResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.LONG32NVARCHAR)
    private Long id;

    @Column(name = "name", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String name;

    @Column(name = "age", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private Integer age;

    @Column(name = "position", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String position;
}
