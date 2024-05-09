package pojo;


import java.util.Date;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonUser {

			private String firstname;
			private String emailid;
			private String contact;
			private String password;
			private String username;
			private String roletype;
			private int loginid;
			private int roleid;	
			private int status;	
			
			int clubid;
			private String ownername;	
			private int licenseno;
			private Date edate;
			
			public CommonUser(String name, String emailid, String contact, String password, String username,
					String roletype, int loginid, int roleid, int state) {
				super();
				this.firstname = firstname;
				this.emailid = emailid;
				this.contact = contact;
				this.password = password;
				this.username = username;
				this.roletype = roletype;
				this.loginid = loginid;
				this.roleid = roleid;
				status = state;
			}		
			
			public CommonUser(int roleid, int state, int id) {
				this.roleid = roleid;
				status = state;
				clubid = id;
			}

			public String getFirstname() {
				return firstname;
			}

			public String getEmailid() {
				return emailid;
			}

			public String getContact() {
				return contact;
			}

			public String getPassword() {
				return password;
			}

			public String getUsername() {
				return username;
			}

			public String getRoletype() {
				return roletype;
			}

			public int getLoginid() {
				return loginid;
			}

			public int getRoleid() {
				return roleid;
			}

			public int getStatus() {
				return status;
			}

			public int getClubid() {
				return clubid;
			}

			public String getOwnername() {
				return ownername;
			}

			public int getLicenseno() {
				return licenseno;
			}

			public Date getEdate() {
				return edate;
			}

			public void setName(String firstname) {
				this.firstname = firstname;
			}

			public void setEmailid(String emailid) {
				this.emailid = emailid;
			}

			public void setContact(String contact) {
				this.contact = contact;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public void setRoletype(String roletype) {
				this.roletype = roletype;
			}

			public void setLoginid(int loginid) {
				this.loginid = loginid;
			}

			public void setRoleid(int roleid) {
				this.roleid = roleid;
			}

			public void setStatus(int status) {
				this.status = status;
			}

			public void setClubid(int clubid) {
				this.clubid = clubid;
			}

			public void setOwnername(String ownername) {
				this.ownername = ownername;
			}

			public void setLicenseno(int licenseno) {
				this.licenseno = licenseno;
			}

			public void setEdate(Date edate) {
				this.edate = edate;
			}
			
			
}
