package br.com.etechoracio.ingresso.entity;

import br.com.etechoracio.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingresso.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
    @Setter
    @Entity
    @Table(name = "TBL_FILME")
    public class Filme {


        @Id
        @GeneratedValue(strategy = GenerationType. IDENTITY)
        @Column(name = "ID_FILME")
        private Long id;

        @Column(name = "TX_NOME")
        private String nome;

        @Enumerated(EnumType.STRING)
        @Column(name = "TP_GENERO")
        private CategoriaFilmeEnum genero;

        @Column(name = "NR_DURACAO")
        private String duracao;

        @Enumerated(EnumType.STRING)
        @Column(name = "TP_CLASSIFICACAO")
        private ClassificacaoIndicativaEnum classificacao;

        @Enumerated(EnumType.STRING)
        @Column(name = "CHK_EM_CARTAZ")
        private SimNaoEnum emCartaz;

        @Column(name = "NR_ANO")
        private int ano;

        @Column(name = "TX_CAPA")
        private String capa;

        @Column(name = "TX_DIRETOR")
        private String diretor;

        @Column(name = "TX_ELENCO")
        private String elenco;

        @Column(name = "TX_DESCRICAO")
        private String descricao;

        @Column(name = "NR_AVALIACAO")
        private Double avaliacao;











    }


