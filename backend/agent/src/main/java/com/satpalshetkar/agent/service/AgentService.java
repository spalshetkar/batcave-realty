package com.satpalshetkar.agent.service;

import com.satpalshetkar.agent.dto.AgentRequestDto;
import com.satpalshetkar.agent.dto.AgentResponseDto;
import com.satpalshetkar.agent.mapper.AgentMapper;
import com.satpalshetkar.agent.model.Agent;
import com.satpalshetkar.agent.repository.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public record AgentService(AgentRepository agentRepository, AgentMapper agentMapper) {
    public AgentResponseDto getAgentById(Long id) {
        Optional<Agent> agent = agentRepository.findById(id);

        return agentMapper.agentToDto(agent.get());
    }

    public AgentResponseDto createAgent(AgentRequestDto agentRequestDto) {
        Agent agent = agentMapper.dtoToAgent(agentRequestDto);
        Agent result = agentRepository.save(agent);
        return agentMapper.agentToDto(result);
    }

    public List<AgentResponseDto> getAllAgents() {
        List<Agent> agents = agentRepository.findAll();
        List<AgentResponseDto> response = agents.stream()
                .map(agent -> agentMapper.agentToDto(agent))
                .collect(Collectors.toList());

        return response;
    }

    public AgentResponseDto updateAgent(Long id, AgentRequestDto agentRequestDto) {
        Optional<Agent> optionalAgent = agentRepository.findById(id);
        Agent response = agentMapper.dtoToAgent(agentRequestDto);
        response.setId(id);

        agentRepository.save(response);
        return agentMapper.agentToDto(response);
    }

    public void deleteAgent(Long id) {
        agentRepository.deleteById(id);
    }
}
