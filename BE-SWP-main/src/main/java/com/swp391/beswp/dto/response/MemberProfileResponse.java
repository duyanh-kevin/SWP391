package com.swp391.beswp.dto;

import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberProfileResponse {
    private Long id;
    private Long userId;
    private String email;
    private String phone;
    private String fullName;
    private String avatarUrl;
    private LocalDate dateOfBirth;
    private String gender;
    private String address;
    private Double height;
    private Double weight;
    private String fitnessGoal;
    private String medicalNotes;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String status;
    private LocalDateTime updatedAt;
}