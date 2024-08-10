package uruburu.company.humanResource.DTO


import java.time.LocalDate
import java.time.LocalDateTime

class HumanResourceParameter (
    var name: String,
    val birthDate: LocalDate,
    val position: String,
    val grade: String,
    val joinDate: LocalDateTime,
    val quitDate: LocalDateTime?,
    val createdBy: String,
    val updatedBy: String?
)