
public class Main {

	public static void main(String[] args) {
		  //ʵ���˽ӿڵ�ʵ����ʹ��
        IAdapter instance = new UseAdapter("simple");
        instance.NewOpenResource();
        instance.NewColseResource();
        instance.NewFreeResource();
	}

}
