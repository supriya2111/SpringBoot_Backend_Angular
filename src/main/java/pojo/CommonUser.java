package pojo;


import java.util.Date;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonUser {

		
			private String password;
			private String username;

			public String getPassword() {
				return password;
			}

			public String getUsername() {
				return username;
			}
	
			public void setPassword(String password) {
				this.password = password;
			}

			public void setUsername(String username) {
				this.username = username;
			}
		
}
