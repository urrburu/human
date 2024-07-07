package com.resource.entity;

import com.resource.converter.LocalDateToStringConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@Entity@Getter
public class  Attendance{

    @Id
    private Long id;

    private String empNum;

    @Convert(converter = LocalDateToStringConverter.class)
    private LocalDate workDate;

    private String workType;

    private Double workNormalTime;

    private Double workOverTime;

    private Double workNightTime;

    private Double workHolidayTime;

    private Double workHolidayOverTime;

    private Double workLateTime;

    private Double workEarlyTime;

    private Double workEarlyOutTime;


}
