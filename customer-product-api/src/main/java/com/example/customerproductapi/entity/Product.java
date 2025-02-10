package com.example.customerproductapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Setter
    private String bookTitle;
    @Setter
    private double bookPrice;
    @Setter
    private int bookQuantity;
	public Object getBookTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBookTitle(Object bookTitle2) {
		// TODO Auto-generated method stub
		
	}
	public Object getBookPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBookPrice(Object bookPrice2) {
		// TODO Auto-generated method stub
		
	}
	public Object getBookQuantity() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBookQuantity(Object bookQuantity2) {
		// TODO Auto-generated method stub
		
	}
}
