package dev.wakandaacademy.produdoro.usuario.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioRequest;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {

	private final UsuarioRepository usuarioRepository;
	private final PomodoroApplicationService pomodorService;

	@Override
	public UsuarioResponse criaNovoUsuario(@Valid UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioApplicationService - criaNovoUsuario");
		var configuracaoPadrao = pomodorService;
		log.info("[finaliza] UsuarioApplicationService - criaNovoUsuario");
		return null;
	}

}
