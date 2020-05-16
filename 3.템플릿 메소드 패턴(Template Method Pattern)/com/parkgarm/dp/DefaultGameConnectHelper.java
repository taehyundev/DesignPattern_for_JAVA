package com.parkgarm.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		// TODO Auto-generated method stub
		System.out.println("디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("아이디/비번 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub'
		System.out.println("권한확인");
		//서버에서 유저이름 유저의 나이를 알수있다.
		//나이를 확인하고 시간을 확인하고 shutdown
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("접속단계");
		return null;
	}

}
