package com.esprit.achat.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item_factureavoir")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ItemFactureAvoir implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "facture_id", updatable = false)
    private FactureAvoir factureAvoir;

    @Column(name = "code")
    private String code; // reference doc

    @Column(name = "LABEL")
    private String label;

    @Column(name = "QUANTITY")
    private Double quantity;

    @Column(name = "PRICE_HT")
    private Double priceHt;

    @Column(name = "MONTANT_HT")
    private Double montantHt;
    @Column(name = "MONTANT_TTC")
    private Double montantTtc;
}
