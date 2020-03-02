
public class Main {

	public static void main(String[] args) {
		  //实现了接口的实例的使用
        IAdapter instance = new UseAdapter("simple");
        instance.NewOpenResource();
        instance.NewColseResource();
        instance.NewFreeResource();
	}

}
