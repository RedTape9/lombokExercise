package org.example;

import lombok.Builder;
import lombok.With;

import java.util.List;

@Builder
@With
public record University(String id,
                         String name,
                         List<Course> courses) {

}
