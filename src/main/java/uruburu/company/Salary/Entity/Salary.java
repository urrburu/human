package uruburu.company.Salary.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import uruburu.company.humanResource.Entity.HumanResource;

import java.time.LocalDateTime;

@Table(name = "TB_SALARY")
@Entity@Getter@Embeddable
public class Salary {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salaryId;

    @OneToOne(fetch = FetchType.LAZY)
    private HumanResource humanResourceId;

    private Long amountSalary;

    private Long amountStockOption;

    private LocalDateTime stockOptionVestingStartDate;

    private Long amountBonus;



    public Salary() {

    }
}
