package org.kartamonov.task_tracker.api.factories;

import org.kartamonov.task_tracker.api.dto.ProjectDto;
import org.kartamonov.task_tracker.store.entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component // generates set dto classes
public class ProjectDtoFactory {

    public ProjectDto makeProjectDto(ProjectEntity entity) {

        return ProjectDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
