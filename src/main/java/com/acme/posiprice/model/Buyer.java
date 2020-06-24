package com.acme.posiprice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "buyers")
@Getter
@Setter
public class Buyer extends user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
