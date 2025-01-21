package com.thebillquest.core.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Services {

    private UUID id;
    private UUID merchantId;
    private String name;
    private String serviceType;
    private LocalDateTime createdAt;

}
