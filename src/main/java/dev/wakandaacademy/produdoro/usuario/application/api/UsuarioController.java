package dev.wakandaacademy.produdoro.usuario.application.api;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
@Validated
public class UsuarioController implements UsuarioAPI {

	private final UsuarioApplicationService usuarioApplicationService;

	@Override
	
	public  UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
	
		log.info("[start] - UsuarioController - postNovoUsuario");		
		UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);
		log.info("[finish] - UsuarioController - postNovoUsuario");
		return usuarioCriado;
	}

}
