package org.example.aeroport_jakarta.entities;

import java.time.LocalDateTime;

public class BaseEntity<T>{

    private T id;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;

    public BaseEntity(){};

    public BaseEntity(T id){
        this.id = id;
    }

    //region GET/SET
    public T getId() {
        return id;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    //endregion


}
