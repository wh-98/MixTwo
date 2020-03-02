

//老接口的另外一种实现
    public class ComplexExAdapter implements IExtraAdapter
    {
    	public void openResource()
        {
    		 System.out.println("complex adapter has opened the resource");
        }
        public void closeResource()
        {
        	 System.out.println("complex adapter has closed the resource");
        }
        public void freeResource()
        {
        	 System.out.println("complex adapter has freed the resource");
        }
    }
    