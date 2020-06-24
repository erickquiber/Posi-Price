package com.acme.posiprice.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotNull
  @NotBlank
  @Size(max=25)
  private String name;
  @NotNull
  @NotBlank
  private Double price;
  @NotNull
  @NotBlank
  @Lob
  private String description;

  @ManyToMany(fetch = FetchType.LAZY,
  cascade = {CascadeType.PERSIST,CascadeType.MERGE},
  mappedBy = "products")
  @JsonIgnore
  private List<Category> categories;



  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "promoter_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonIgnore
  private Promoter promoters;

}
