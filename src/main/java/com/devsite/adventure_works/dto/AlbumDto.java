package com.devsite.adventure_works.dto;

public class AlbumDto {

    Long userId;
    Long id;
    String title;


    public AlbumDto() {
    }

    public AlbumDto(Long userId, Long id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
