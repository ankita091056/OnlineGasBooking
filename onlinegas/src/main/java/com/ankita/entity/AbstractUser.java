package com.ankita.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AbstractUser {
String username;
String password;
String address;
String mobileNo;
String email;
}
