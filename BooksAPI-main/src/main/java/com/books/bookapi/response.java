package com.books.bookapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@AllArgsConstructor
@ToString

public class response {
    int code;
    String message;
    Object obj;
}
    
