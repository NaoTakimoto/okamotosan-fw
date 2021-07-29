package application.actions;

import application.beans.UserInfoEntity;
import application.businessLogic.BusinessLogic;
import application.entity.User;
import jisaku_dicontainer.annotation.ActionMethod;
import jisaku_dicontainer.annotation.FormInjection;
import jisaku_dicontainer.annotation.Service;
import jisaku_servlet.annotation.Login;
import jisaku_servlet.servlet.Model;


public class Action {

	@Service
	BusinessLogic bl1;

	@FormInjection
	UserInfoEntity userInfo;

	@ActionMethod("login")
	@Login
	public Model actionMethod1() {
System.out.println("1");
		//Login処理
		User user = new User();
		//BigDecimal bigUserId = BigDecimal.valueOf(userInfo.getUserID());
		//user.setUserID(bigUserId);
		user.setUserID(userInfo.getUserID());
		user.setUserPassword(userInfo.getUserPassword());
		if(!bl1.login(user)) {
			/*
			 * ログイン失敗
			 * ログイン画面を再度表示
			 */
			Model model  = new Model();
			model.setNextPage("login.jsp");
			model.setLoginCheckerFlag(false);
			return model;
		}

		//task一覧を取得
		//ArrayList<Task_list> taskList = bl1.getList();

		//taskListをセッションにセット
		Model model  = new Model();
//		Value value = new Value();
//		value.setName("tasklist");
//		value.setObj(taskList);
//		model.getSessionObj().add(value);
//		model.setLoginCheckerFlag(true);

		//次画面をセット
		model.setNextPage("input.jsp");

		return model;
	}
}
