package dev.wakandaacademy.produdoro.usuario.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
public class UsuarioController implements UsuarioAPI {

	private final UsuarioService usuarioService;

	@Override
	public UsuarioResponse criaNovoUsuario(@Valid UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - criaNovoUsuario");
		UsuarioResponse usuario = usuarioService.criaNovoUsuario(usuarioRequest);
		log.info("[finaliza] UsuarioController - criaNovoUsuario");
		return usuario;
	}

}
