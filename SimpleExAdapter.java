//�Ͻӿڵ�һ��ʵ��
    public class SimpleExAdapter implements IExtraAdapter
    {
        public void openResource()
        {
        	System.out.println("simple adapter has opened the resource");
        }
        public void closeResource()
        {
        	System.out.println("simple adapter has closed the resource");
        }
        public void freeResource()
        {
        	System.out.println("simple adapter has freed the resource");
        }
    }