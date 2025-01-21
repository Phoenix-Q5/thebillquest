package com.thebillquest.core.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MerchantConfiguration {
    private UUID id;
    private UUID merchantId;
    private String configKey;
    private String configValue;
    private LocalDateTime createdAt;
}
