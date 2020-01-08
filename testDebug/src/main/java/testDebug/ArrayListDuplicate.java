/** All copyright reserved 2019.
 * 
 */
package testDebug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Anil Jul 31, 2019
 */
public class ArrayListDuplicate {

	public static void main(String[] args) {
		List<String> element = new ArrayList<String>();
		element.add("anil");
		element.add("sam");
		element.add("bibhu");
		element.add("deepak");
		element.add("bandi");
		element.add("ram");
		element.add("anil");
		
		ArrayList<String> dupcheckList = new ArrayList<String>();
		Iterator<String> itr = element.iterator();
		System.out.println(itr);
		while(itr.hasNext()){
			String temp =itr.next();
			if(dupcheckList.contains(temp)){
				itr.remove();
			}else{
				dupcheckList.add(temp);
			}
		}
		System.out.println(dupcheckList);
	}

}
