package com.matrix.elasticsearchservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Document(indexName = "matrix-users-index")
public class UserEntity {
    @Id
    @Field(type = FieldType.Keyword)
    private UUID id;

    @Field(type = FieldType.Version)
    private Integer version;

    @NotNull
    @NotBlank
    @Field(type = FieldType.Keyword)
    private String userEmail;

    @NotNull
    @NotBlank
    @Field(type = FieldType.Keyword)
    private String password;

    @NotNull
    @NotBlank
    @Field(type = FieldType.Keyword)
    private String fullName;

    @NotNull
    @NotBlank
    @Field(type = FieldType.Keyword)
    private String userPhone;

    @NotNull
    @NotBlank
    @Field(type = FieldType.Keyword)
    private String avatar;

    @NotNull
    @Field(type = FieldType.Double)
    private Double membershipPoint;

    @Field(type = FieldType.Date)
    private LocalDateTime membershipPromotedDay;

    @Field(type = FieldType.Date)
    private LocalDateTime membershipExpiredDay;

    @Field(type = FieldType.Date)
    private LocalDateTime isDeleted;

    @Field(type = FieldType.Integer)
    private Integer roleId;

    @Field(type = FieldType.Integer)
    private Integer membershipId;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;
}
