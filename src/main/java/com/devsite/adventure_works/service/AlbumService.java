package com.devsite.adventure_works.service;

import com.devsite.adventure_works.config.ConfigWebClient;
import com.devsite.adventure_works.dto.AlbumDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class AlbumService {

    private final WebClient webClient;

    public AlbumService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<AlbumDto> getAllAlbums() {
        return webClient.get().uri("/albums").retrieve().bodyToFlux(AlbumDto.class);
    }
}
