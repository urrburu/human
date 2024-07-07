package com.resource.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GeneralCode {

    @Id@GeneratedValue
    private Long codeId;

    private String codeGroup;

    private String codeDetail;

    @Setter
    private String codeName;

    @Setter
    private String codeValue;

}
