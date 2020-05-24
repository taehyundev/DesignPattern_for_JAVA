package framework;

public abstract class ItemCreator {
	// ���丮 �޼ҵ� -> ���ø� �޼ҵ� ����
	public Item create() {
		Item item;
		
		//step1
		requestItemsInfo();
		//step2
		item = createItem();
		//step3
		createItemLog();
		return item;
	}
	//�������� �����ϱ� ���� �����ͺ��̽����� ������ ������ ��û
	abstract protected void requestItemsInfo();
	//�������� ���� �� ������ �������� �ҹ��� ����
 	abstract protected void createItemLog();
	//�������� �����ϴ� �˰���
 	abstract protected Item createItem();
}
