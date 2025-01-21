CREATE TABLE services (
                          id UUID PRIMARY KEY,
                          merchant_id UUID NOT NULL REFERENCES merchants(id),
                          name VARCHAR(100) NOT NULL,
                          service_type VARCHAR(50) NOT NULL,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);