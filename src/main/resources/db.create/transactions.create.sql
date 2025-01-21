CREATE TABLE transactions (
                              id UUID PRIMARY KEY,
                              user_id UUID NOT NULL,
                              service_id UUID NOT NULL REFERENCES services(id),
                              amount DECIMAL(10,2) NOT NULL,
                              status VARCHAR(20) NOT NULL CHECK (status IN ('Pending', 'Completed', 'Failed')),
                              payment_method VARCHAR(30) NOT NULL,
                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);