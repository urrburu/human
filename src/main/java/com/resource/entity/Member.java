package com.resource.entity;

import com.resource.domain.HireType;
import com.resource.domain.JobRank;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Set;

@Entity@Getter
@Table(name = "TB_HR_MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private Long memNum;

    @Column(nullable = false) @Setter
    private String memName;

    @Setter@Enumerated(EnumType.STRING)
    private JobRank jobRank;
    //직급 컬럼 ----- 회장 부회장 사장 전무 상무 부장 차장 과장 대리 주임 사원

    @Setter@Enumerated(EnumType.STRING)
    private HireType hireType;
    //채용 유형 임원 관리직 정규직 기간제 인턴

    private String plantCode;

    private String teamCode;

    private String aidTeamCode;

    private String workPlaceCode;

    @OneToMany@Setter
    private Set<Auth> authSet;

    private LocalDateTime joinDate;

    private LocalDateTime endDate;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}
