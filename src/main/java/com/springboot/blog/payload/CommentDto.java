package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    //should not be null or empty
    @NotEmpty(message = "Name should not be null or empty")
    @Size(min = 3, message = "The name should be at least 3 characters")
    private String name;

    //should not be null or empty
    @NotEmpty(message = "Email should not  be null or empty")
    @Email
    private String email;

    //should not be null or empty
    //minimum 10 characters
    @NotEmpty
    @Size(min = 10, message= "The body should be at least 10 characters")
    private String body;
}
