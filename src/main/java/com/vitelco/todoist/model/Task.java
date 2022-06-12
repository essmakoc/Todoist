package com.vitelco.todoist.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private LocalDateTime createdDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid", nullable = false)
    private User assignedUser;
    private Category category;

    public Task(long id, String title, User user, Category category) {
        this.id = id;
        this.title = title;
        this.createdDate = LocalDateTime.now();
        this.assignedUser = user;
        this.category = category;
    }

    public  enum Category{
        WORK, PERSONAL
    }
}
