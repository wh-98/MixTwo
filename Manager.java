
public class Manager {
	  //���ݴ���������ض�Ӧ�Ĺ���ʵ���������ַ��������ǾͿ��Ա���
    //��ÿһ��ʵ�ֽӿڵķ������涼д�ܶ��swith case ����ˡ�
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
