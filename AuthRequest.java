package com.Sampro.sampro;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {
    private String email;
    private String password;
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}