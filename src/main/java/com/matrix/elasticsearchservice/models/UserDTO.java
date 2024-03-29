package com.matrix.elasticsearchservice.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class UserDTO {
    private UUID id;
    private Integer version;

    @NotNull
    @NotBlank
    private String userEmail;

    @NotNull
    @NotBlank
    private String password;

    @NotNull
    @NotBlank
    private String fullName;

    @NotNull
    @NotBlank
    private String userPhone;

    @NotNull
    @NotBlank
    private String avatar;

    @NotNull
    private Double membershipPoint;

    private LocalDateTime membershipPromotedDay;
    private LocalDateTime membershipExpiredDay;
    private LocalDateTime isDeleted;
    private Integer roleId;
    private Integer membershipId;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
