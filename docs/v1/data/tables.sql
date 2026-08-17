CREATE TABLE categories (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(7) NOT NULL UNIQUE
);

CREATE TABLE labels (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(20) NOT NULL UNIQUE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE records (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    description TEXT,
    actual_amount NUMERIC(15, 2) NOT NULL,
    expected_amount NUMERIC(15, 2) NOT NULL,
    charges NUMERIC(15, 2),
    category_id INTEGER NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    transaction_date DATE NOT NULL,
    transaction_time TIME NOT NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_records_category
        FOREIGN KEY (category_id)
        REFERENCES categories(id)
);

CREATE TABLE record_labels (
    record_id INTEGER NOT NULL,
    label_id INTEGER NOT NULL,

    PRIMARY KEY (record_id, label_id),

    CONSTRAINT fk_record_labels_record
        FOREIGN KEY (record_id)
        REFERENCES records(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_record_labels_label
        FOREIGN KEY (label_id)
        REFERENCES labels(id)
        ON DELETE CASCADE
);

CREATE TABLE record_attachments (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    record_id INTEGER NOT NULL,
    -- file_name VARCHAR(255) NOT NULL,
    file_path TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_record_attachments_record
        FOREIGN KEY (record_id)
        REFERENCES records(id)
        ON DELETE CASCADE
);

INSERT INTO categories (name)
VALUES
    ('income'),
    ('expense');