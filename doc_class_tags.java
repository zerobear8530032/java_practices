
package javaDoc;

/**
 * this class is my sample code used to learn java doc
 * @author abdulsaboor(zerobear)
 * @version 18.0.1
 * @since 2018
 * @see <a href=>https://idratherbewriting.com/learnapidoc/nativelibraryapis_create_javadoc.html</a>
 */

//the above tags are always be present over the class:
//@author name -> this is used for giving author name
//@version name -> this is used for giving version name
//@since year -> this is used for giving it working from 
//@see name -> this is used for giving an heading

public class doc_class_tags {
	
	void add(int a,int b) {
		System.out.println("a + b :"+(a+b));
	}
	
	
	void sub(int a,int b) {
		System.out.println("a - b :"+(a-b));
	}
	
public static void main(String args[])
{
	
System.out.println("this is the main method");
	doc_class_tags d = new doc_class_tags();
	d.add(45, 50);
	d.sub(45, 50);


}
}
