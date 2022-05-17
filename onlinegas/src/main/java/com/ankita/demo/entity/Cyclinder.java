package com.ankita.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cyclinder {
int cyclinderId;
String type;
float weigth;
String strapColour;
float price;
}
