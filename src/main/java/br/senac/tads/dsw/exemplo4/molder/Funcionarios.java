package br.senac.tads.dsw.exemplo4.molder;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity 
public class Funcionarios {
    @Id 
    private Long id;

    @NotBlank 
    private String nome;

    @PastOrPresent 
    private String datacontratacao;

    @NotNull 
    private Boolean trabalhoRemoto;

    @ManyToOne 
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;




    
}
