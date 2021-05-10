package com.quest.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ConfigDto {
    int cityId;
    String cityName;
    int frequency;
    int threshold;

}
