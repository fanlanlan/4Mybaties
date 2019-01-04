package sh;

import com.opensymphony.xwork2.Action;

public class RegAction implements Action{
	private UserService userService;
	

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}


	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public String execute() throws Exception {
		userService.register();
		return "success";
	}

	

}
