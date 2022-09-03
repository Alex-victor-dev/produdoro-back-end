package dev.wakandaacademy.produdoro.usuario.application.service;

import javax.validation.Valid;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioRequest;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

	UsuarioResponse criaNovoUsuario(@Valid UsuarioRequest usuarioRequest);

}
