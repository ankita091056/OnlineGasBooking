package com.ankita.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SurrenderCyclinder {
int surrenderId;
Customer custpmer;
Cyclinder cyclinder;
String surrenderDate;
}
