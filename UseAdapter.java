//继承新接口的实现类 
   public class UseAdapter implements IAdapter
   {
	   private IExtraAdapter exAdapter; //老接口
        public UseAdapter(String adapterType)
        {
            //工厂返回老接口的一个实现实例
            Manager manager=new Manager();
            exAdapter = manager.GetAdapter(adapterType);
        }
        
        //下面三个实现新接口的方法，调用三个自定义方法
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
       
        //这三个自定义方法，在做一些新需求的额外操作以后，调用老接口的实现方法，
        //完成了新老接口的适配
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