package com.example.ghandbk.dto.schedule.product;

import com.example.ghandbk.collection.enums.SituacaoProduto;
import com.example.ghandbk.dto.supllier.FornecedorDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Builder
public class AgendaProdDto {

    private String nameProduct;
    private Integer amount;
    private SituacaoProduto status;
    private LocalDate dateToPayOrReceive;
    private FornecedorDto fornecedorDto;
}
