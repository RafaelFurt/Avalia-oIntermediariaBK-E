package com.avalicao1backend.avalicaointermediaria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.avalicao1backend.avalicaointermediaria.model.Musica;

public interface MusicaRepository extends MongoRepository<Musica, String> {
    
}
