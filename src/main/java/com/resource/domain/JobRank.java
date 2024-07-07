package com.resource.domain;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;


@Embeddable
public enum JobRank {
    Godfather("대부"),
    Capo("사장"),
    Sottocapo("부사장"),
    Consigliere("고문"),
    Caporegime("부장"),
    Soldato("과장"),
    Associate("사원");

    private final String koreanRank;

    JobRank(String koreanRank) {
        this.koreanRank = koreanRank;
    }


    public String getKoreanRank() {
        return koreanRank;
    }

}
