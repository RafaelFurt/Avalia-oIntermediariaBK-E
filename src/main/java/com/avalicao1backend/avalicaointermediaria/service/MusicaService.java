package com.avalicao1backend.avalicaointermediaria.service;

import java.util.List;
import java.util.Optional;

import com.avalicao1backend.avalicaointermediaria.shared.MusicaDto;
import com.avalicao1backend.avalicaointermediaria.view.Model.MusicaResponse;


public interface MusicaService {
    MusicaDto inserirMusica(MusicaDto musica);
    List<MusicaDto> obterTodos();
    Optional <MusicaDto> obterPorId(String id);
    MusicaDto atualizarMusica(String id,MusicaResponse musicaResponse);
    void removerMusica(String id);
    MusicaDto atualizarMusica(String id,MusicaDto musicadto);
}
