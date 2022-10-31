package org.kartamonov.task_tracker.store.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE) // makes all fields private (experimental)
@NoArgsConstructor
@AllArgsConstructor
@Builder // generates builder in class (all possible constructors)
@Getter // makes default getters
@Setter // makes default setters
@Entity
@Table (name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(unique = true)
    String name;

    @Builder.Default
    Instant createdAt = Instant.now();

    String description;
}