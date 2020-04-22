package com.rjstudio360.onlinebookstore.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_book")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "sku")
  private String sku;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "unit_price")
  private double unitPrice;

  @Column(name = "imageUrl")
  private String imageUrl;

  @Column(name = "active")
  private boolean active;

  @Column(name = "unit_in_stock")
  private int uniteInStock;

  @CreationTimestamp
  @Column(name = "date_created")
  private Date dateCreated;

  @UpdateTimestamp
  @Column(name = "last_update")
  private Date lastUpdate;

  @ManyToOne
  @JoinColumn(name = "category_id",nullable = false)
  private Category category;
}
