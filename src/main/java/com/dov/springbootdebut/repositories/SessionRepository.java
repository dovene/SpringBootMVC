package com.dov.springbootdebut.repositories;

import com.dov.springbootdebut.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
