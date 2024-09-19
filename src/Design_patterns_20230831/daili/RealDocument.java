package Design_patterns_20230831.daili;

public class RealDocument implements  Document
{
	private String content;

	public RealDocument(String content)
	{
		this.content = content;
	}

	@Override
	public void displayContent()
	{
		System.out.println("Displaying content"+content);
	}
}
