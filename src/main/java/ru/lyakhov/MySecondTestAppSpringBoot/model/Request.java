package ru.lyakhov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "uid is mandatory")
    @Size(max = 32, message = "uid must be at most 32 characters long")
    private String uid;

    @NotBlank(message = "operationUid is mandatory")
    @Size(max = 32, message = "operationUid must be at most 32 characters long")
    private String operationUid;

    private Systems systemName;

    @NotBlank(message = "systemTime is mandatory")
    private String systemTime;

    private String source;

    @Min(value = 1, message = "communicationId must be at least 1")
    @Max(value = 100000, message = "communicationId must be at most 100000")
    private int communicationId;

    private int templateId;
    private int productCode;
    private int smsCode;

    @Override
    public String toString() {
        return "{" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId='" + communicationId + '\'' +
                ", templateId='" + templateId + '\'' +
                ", productCode='" + productCode + '\'' +
                ", smsCode='" + smsCode + '\'' +
                '}';
    }
}