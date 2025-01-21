CREATE TABLE merchant_configurations (
                                         id UUID PRIMARY KEY,
                                         merchant_id UUID NOT NULL REFERENCES merchants(id),
                                         config_key VARCHAR(100) NOT NULL,
                                         config_value VARCHAR(255) NOT NULL,
                                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);