package com.parkgarm.dp;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id,String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
// ���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {
		//���� �۾� -> ��ȣȭ �� ���ڿ��� ���ڵ��Ѵ�.
		String decodedInfo = doSecurity(encodedInfo);
		//��ȯ �� ���� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�.
		String id ="aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		String userName="userName";
		int i = authorization(userName);
		
		switch(i) {
		case -1:
			throw new Error("�˴ٿ�");
		case 0://���� �Ŵ���
			break;
		case 1://����ȸ��
			break;
		case 2://����ȸ��
			break;
		case 3://No Permittion
			break;
		default://��Ÿ��Ȳ
			break;
		}
		return connection(decodedInfo);
	}
}
