package entity;

import java.io.Serializable;

public class Person implements Serializable{
		private int id;
		private String username;
		private String realname;
		private String password;
		
		public Person() {
			super();
		}
		public Person(int id, String username, String realname, String password) {
			super();
			this.id = id;
			this.username = username;
			this.realname = realname;
			this.password = password;
		}
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the username
		 */
		public String getUsername() {
			return username;
		}
		/**
		 * @param username the username to set
		 */
		public void setUsername(String username) {
			this.username = username;
		}
		/**
		 * @return the realname
		 */
		public String getRealname() {
			return realname;
		}
		/**
		 * @param realname the realname to set
		 */
		public void setRealname(String realname) {
			this.realname = realname;
		}
		/**
		 * @return the password
		 */
		public String getPassword() {
			return password;
		}
		/**
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Person [id=" + id + ", username=" + username
					+ ", realname=" + realname + ", password=" + password + "]";
		}
		
		


}
