package org.example.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Phone {

    private Long id;
    private String model;
    private String brand;
    private int price;
    private Long userId;
}
