package org.kartamonov.task_tracker.store.repositories;

import org.kartamonov.task_tracker.store.entities.TaskEntity;
import org.kartamonov.task_tracker.store.entities.TaskStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
