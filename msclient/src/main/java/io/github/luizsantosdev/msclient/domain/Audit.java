package io.github.luizsantosdev.msclient.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Data
public abstract class Audit {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //TODO created At é o horario local, implementar um dateUtils

}
