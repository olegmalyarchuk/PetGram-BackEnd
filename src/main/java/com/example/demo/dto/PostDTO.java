package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
public class PostDTO {

    private Long id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String caption;
    private String location;
    private String username;
    private Integer likes;
    private Set<String> usersLiked;

}
