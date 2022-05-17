package com.ankita.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Customer {
int customerId;
int cyclinderId;
int bankId;
int accountNo;
String ifscNo;
String pan;
}
