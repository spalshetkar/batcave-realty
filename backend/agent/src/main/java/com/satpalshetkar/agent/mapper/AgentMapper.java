package com.satpalshetkar.agent.mapper;

import com.satpalshetkar.agent.dto.AgentRequestDto;
import com.satpalshetkar.agent.dto.AgentResponseDto;
import com.satpalshetkar.agent.model.Agent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;

@Mapper
public abstract class AgentMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    @Mapping(source = "licenseNumber", target = "licenseNumber")
    @Mapping(source = "profilePictureUrl", target = "profilePictureUrl")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    public abstract AgentResponseDto agentToDto(Agent agent);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    @Mapping(source = "licenseNumber", target = "licenseNumber")
    @Mapping(source = "profilePictureUrl", target = "profilePictureUrl")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    public abstract Agent dtoToAgent(AgentRequestDto agentRequestDto);
}
