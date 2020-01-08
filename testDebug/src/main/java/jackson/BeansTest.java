/** All copyright reserved 2019.
 * 
 */
package jackson;

/**
 * @author Anil Oct 1, 2019
 */
public class BeansTest {
	private String fName;
	private String lName;
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeansTest [fName=");
		builder.append(fName);
		builder.append(", lName=");
		builder.append(lName);
		builder.append("]");
		return builder.toString();
	}

	
}
