
public class Manager {
	  //根据传入参数返回对应的工厂实例，用这种方法，我们就可以避免
    //在每一个实现接口的方法里面都写很多的swith case 语句了。
    public IExtraAdapter GetAdapter(String adapterType)
    {
        if (adapterType == "simple")
        {
            return new SimpleExAdapter();
        }
        else
        {
            return new ComplexExAdapter();
        }
    }
}
