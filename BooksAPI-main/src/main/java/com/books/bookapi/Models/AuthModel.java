package com.books.bookapi.Models;

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
public class AuthModel {
    String email;
    String password;
    
}
