package com.project.silbaram.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberModifyDTO {
    private Long mid;
    @NotEmpty
    private String name;
    private String nickName;
    private String phoneNumber;
    private String zipcode;
    private String address1;
    private String address2;

}