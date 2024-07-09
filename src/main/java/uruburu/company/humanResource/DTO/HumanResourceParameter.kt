package uruburu.company.humanResource.DTO

import uruburu.company.Department.Entity.Department
import java.time.LocalDate

class HumanResourceParameter {
    val name: String = ""
    val birthDate: LocalDate = LocalDate.now()
    val position: String = ""
    val department: Department = Department()
}