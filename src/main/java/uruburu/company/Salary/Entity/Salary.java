package uruburu.company.Salary.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "TB_SALARY")
public class Salary {

    @OneToOne
    private Long employeeId;

    private Long currentSalary;

    private StockOption stockOption;


}
