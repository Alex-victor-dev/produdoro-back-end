package dev.wakandaacademy.produdoro.credencial.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
@Service
public class CredencialService implements CredencialApplicationSevice {

	@Override
	public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {

	}

}
