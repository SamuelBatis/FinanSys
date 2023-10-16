package com.batis.FinanSys.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long contaOrigem;
  private Long contaDestino;
  private CategoriaTransacao categoriaTransacao;
  private Double valor;
  private LocalDate dataTransacao;
  private String descricao;
  private TipoTransacao tipoTransacao;
}
