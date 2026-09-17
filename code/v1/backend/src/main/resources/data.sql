INSERT INTO categories (name)
VALUES ('income')
    ON CONFLICT (name) DO NOTHING;

INSERT INTO categories (name)
VALUES ('expense')
    ON CONFLICT (name) DO NOTHING;