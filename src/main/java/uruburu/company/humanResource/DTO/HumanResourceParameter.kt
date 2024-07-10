package uruburu.company.humanResource.DTO

import uruburu.company.Department.Entity.Department
import uruburu.company.Salary.Entity.Salary
import java.time.LocalDate

class HumanResourceParameter {
    val name: String = ""
    val birthDate: LocalDate = LocalDate.now()
    val position: String = ""
    val salary: Salary = Salary()
    val department: Department = Department()
}