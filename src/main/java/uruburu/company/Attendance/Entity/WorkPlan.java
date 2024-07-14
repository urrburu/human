package uruburu.company.Attendance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Entity@Getter
public class WorkPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_plan_id", nullable = false)
    @JdbcTypeCode(SqlTypes.LONG32NVARCHAR)
    private Long workPlanId;

    @Setter
    @OneToOne(fetch = FetchType.LAZY)
    private Attendance attendance;

    @Setter
    private Long employeeId;

    @Setter
    private LocalDateTime workStartTime;

    @Setter
    private LocalDateTime workEndTime;

    @Setter
    private String workContent;

    @Setter
    private String workStatus;

    @Setter
    private LocalDateTime workBreakStartTime;

    @Setter
    private LocalDateTime workBreakEndTime;

    @Setter
    private String remarkOne;

    @Setter
    private String remarkTwo;

    @Setter
    private String remarkThree;

    private LocalDateTime createdAt;

    private String createdBy;

    @Setter
    private LocalDateTime updatedAt;

    @Setter
    private String updatedBy;

}
