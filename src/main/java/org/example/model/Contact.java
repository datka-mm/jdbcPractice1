package org.example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contact {

    private Long id;
    private String contactName;
    private String phoneNumber;
    private Long phoneId;

}
