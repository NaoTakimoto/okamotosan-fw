package application.businessLogic;

import java.util.Optional;

import application.entity.User;
import jisaku_jpa.dbMapper.Repository;
import jisaku_jpa.dbMapper.RepositoryImpl;

public class BusinessLogic {
	
	Repository<User, Integer> User_idRepos = new RepositoryImpl<>();

	//ログイン
	public boolean login(User user) {
System.out.println("2");
		Optional<User> uiOpt = User_idRepos.findById(user.getUserID());
		if(uiOpt.isPresent()) {
			User ui = uiOpt.get();
			if(user.getUserPassword().equals(ui.getUserPassword())) {
				//ログイン成功
				System.out.println("ログインに成功しました。");
				return true;
			}else {
				//ログイン失敗
				System.out.println("ログインに失敗しました。");
				return false;
			}
		}else {
			//ログイン失敗
			System.out.println("ログインに失敗しました。");
			return false;
		}
	}
}
