package globalview_page;


import baselibrary.BaseLibrary;

public class HomepageTitle extends BaseLibrary

{
	public void gettitleGolbalView()
	{
		String title =driver.getTitle();
		System.out.println("Title is "+title);
		
		
	}
}
