package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfiguracaoUsuario {
	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;

	public ConfiguracaoUsuario(ConfiguracaoPadrao configuracao) {
		this.tempoMinutosFoco = configuracao.getTempoMinutosFoco();
		this.tempoMinutosPausaCurta = configuracao.getTempoMinutosFoco();
		this.tempoMinutosPausaLonga = configuracao.getTempoMinutosPausaLonga();
		this.repeticoesParaPausaLonga = configuracao.getRepeticoesParaPausaLonga();
	}

}
