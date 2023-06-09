package com.pseudoorganization.pseudosystemsintegration.repository;

import com.pseudoorganization.pseudosystemsintegration.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StateRepository extends JpaRepository<State, UUID> {

    Optional<State> findByName(String name);
}