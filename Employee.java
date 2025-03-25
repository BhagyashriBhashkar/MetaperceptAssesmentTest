package com.Sampro.sampro;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees_samp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public Role getRole() {
		// TODO Auto-generated method stub
		return role;
	}

	public void setRole(Role user) {
		// TODO Auto-generated method stub
		this.role=role;
		
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;
		
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		this.password=password;
		
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}
}