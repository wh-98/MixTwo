//�̳��½ӿڵ�ʵ���� 
   public class UseAdapter implements IAdapter
   {
	   private IExtraAdapter exAdapter; //�Ͻӿ�
        public UseAdapter(String adapterType)
        {
            //���������Ͻӿڵ�һ��ʵ��ʵ��
            Manager manager=new Manager();
            exAdapter = manager.GetAdapter(adapterType);
        }
        
        //��������ʵ���½ӿڵķ��������������Զ��巽��
        public void NewOpenResource()
        {
            this.openResource();
        }
        public void NewColseResource()
        {
            this.closeResource();
        }
        public void NewFreeResource()
        {
            this.freeResource();
        }
       
        //�������Զ��巽��������һЩ������Ķ�������Ժ󣬵����Ͻӿڵ�ʵ�ַ�����
        //��������Ͻӿڵ�����
        private void openResource()
        {
        	 System.out.println("do some special task...");
            exAdapter.openResource();
        }
        private void closeResource()
        {
        	 System.out.println("do some special task...");
            exAdapter.closeResource();
        }
        private void freeResource()
        {
        	 System.out.println("do some special task...");
            exAdapter.freeResource();
        }
   }