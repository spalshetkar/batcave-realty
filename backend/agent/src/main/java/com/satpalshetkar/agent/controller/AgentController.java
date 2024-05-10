package com.satpalshetkar.agent.controller;

import com.satpalshetkar.agent.dto.AgentRequestDto;
import com.satpalshetkar.agent.dto.AgentResponseDto;
import com.satpalshetkar.agent.service.AgentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agent")
public record AgentController(AgentService agentService) {

    @PostMapping
    public @ResponseBody AgentResponseDto createAgent(@RequestBody AgentRequestDto agentRequestDto) {
        return agentService.createAgent(agentRequestDto);
    }

    @GetMapping("/{id}")
    public @ResponseBody AgentResponseDto getAgentById(@PathVariable Long id) {
        return agentService.getAgentById(id);
    }

    @GetMapping
    public @ResponseBody List<AgentResponseDto> getAllAgents() {
        return agentService.getAllAgents();
    }

    @PutMapping("{id}")
    public @ResponseBody AgentResponseDto updateAgent(@PathVariable Long id, @RequestBody AgentRequestDto agentRequestDto) {
        return agentService.updateAgent(id, agentRequestDto);
    }

    @DeleteMapping("{id}")
    public void deleteAgent(@PathVariable Long id) {
        agentService.deleteAgent(id);
    }

}
