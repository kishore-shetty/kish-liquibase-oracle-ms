--liquibase formatted sql

--changeset admin:1
CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;

--changeset admin:2
CREATE TABLE PROFILE(
    ID NUMERIC(19,0) PRIMARY KEY,
    NAME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    PASSWORD VARCHAR(255) NOT NULL,
    DOB VARCHAR(255) NOT NULL,
    SALARY DECIMAL(19,2) NOT NULL,
    ACTIVE_FLAG NUMERIC(1,0) NOT NULL,
    UPDATED_DATE_TIME TIMESTAMP NOT NULL
)