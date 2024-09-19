package Design_patterns_20230831.daili;

public class DocumentProxy implements  Document
{
	/**
	 * 在不改变原始对象的前提下,通过引入一个代理对象来控制原始对象的访问,实现额外功能
	 */
	private RealDocument realDocument;
	private String content;
	private static int accessCount = 0;

	public DocumentProxy(String content)
	{
		this.content = content;
	}

	@Override
	public void displayContent()
	{
		accessCount++;
		if(realDocument == null){
			realDocument = new RealDocument(content);
		}
		realDocument.displayContent();
		System.out.println("Document accessed"+accessCount+"times");
	}
}
