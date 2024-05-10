package com.satpalshetkar.agent.repository;

import com.satpalshetkar.agent.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
}
