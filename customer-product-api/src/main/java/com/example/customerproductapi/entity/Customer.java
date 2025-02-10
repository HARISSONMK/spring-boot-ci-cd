package com.example.customerproductapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String firstName;
    @Setter
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @ElementCollection
    private List<String> familyMembers;

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFamilyMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFirstName(Object firstName2) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(Object lastName2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	public void setFamilyMembers(Object familyMembers2) {
		// TODO Auto-generated method stub
		
	}
}
