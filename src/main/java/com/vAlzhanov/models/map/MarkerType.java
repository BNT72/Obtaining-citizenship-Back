package com.vAlzhanov.models.map;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "marker_type")
public class MarkerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private EMarkerType name;

}