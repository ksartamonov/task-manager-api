package org.kartamonov.task_tracker.store.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

// By default, all entity fields are columns
@FieldDefaults(level = AccessLevel.PRIVATE) // makes all fields private (experimental)
@NoArgsConstructor
@AllArgsConstructor
@Builder // generates builder in class (all possible constructors)
@Getter // makes default getters
@Setter // makes default setters
@Entity
@Table (name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(unique = true)
    String name;

    @Builder.Default
    Instant updatedAt = Instant.now();

    @Builder.Default
    Instant createdAt = Instant.now();

    @Builder.Default
    @OneToMany
    @JoinColumn(name = "project_id")
    List<TaskStateEntity> taskStates = new ArrayList<>();
}
