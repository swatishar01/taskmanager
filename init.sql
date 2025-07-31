CREATE DATABASE IF NOT EXISTS taskdb;
USE taskdb;

CREATE TABLE IF NOT EXISTS task(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255) NOT NULL,
    title VARCHAR(255) NOT NULL,
   status VARCHAR(50) NOT NULL DEFAULT 'pending' -- Status of the task, default is 'pending'
  );
