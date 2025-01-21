package com.thebillquest.core.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Merchant {

    private UUID id;
    private String name;
    private String category;
    private LocalDateTime createdAt;
}
