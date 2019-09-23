package com.gustavo.projetoprogweb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity()
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Produtos")
public class ProdutosEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String preco;

}
