CREATE TABLE merchants (
                           id UUID PRIMARY KEY,
                           name VARCHAR(100) NOT NULL,
                           category VARCHAR(50) NOT NULL,
                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);