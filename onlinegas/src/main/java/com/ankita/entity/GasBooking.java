package com.ankita.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GasBooking {
int gasBookingId;
int customerId;
boolean status;
float bill;
String date; 
}
