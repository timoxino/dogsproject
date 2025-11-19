-- Enable pgvector extension for vector similarity search
CREATE EXTENSION IF NOT EXISTS vector;

-- Table required by Spring AI PgVectorStore
CREATE TABLE IF NOT EXISTS vector_store (
    id VARCHAR(255) PRIMARY KEY,
    content TEXT,
    metadata JSONB,
    embedding VECTOR(1536)
);

CREATE TABLE IF NOT EXISTS dog (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    owner VARCHAR(255),
    description TEXT
);
