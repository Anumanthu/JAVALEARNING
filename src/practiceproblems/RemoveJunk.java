package practiceproblems;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="@##^$^&&@*(#@)#@#abdfhdfdfrgWREWREWRrfe$$@$@$@432545464@!!($&$()$_)$($UU$U";
		
		//Regular expressions [^a-zA-Z0-9]
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
