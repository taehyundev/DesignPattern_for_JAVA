package com.parkgarm.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ�");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("���̵�/��� Ȯ�� ����");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub'
		System.out.println("����Ȯ��");
		//�������� �����̸� ������ ���̸� �˼��ִ�.
		//���̸� Ȯ���ϰ� �ð��� Ȯ���ϰ� shutdown
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("���Ӵܰ�");
		return null;
	}

}
