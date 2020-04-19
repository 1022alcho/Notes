import java.util.*; 

class OneEdit {
    public static void main(String[] args) {
		String a = "palee";
		String b = "pale";
		boolean isOneEdit1 = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit1);

		String c = "pale";
		String d = "pkle";
		boolean isOneEdit2 = oneEditAway(c, d);
        System.out.println(c + ", " + d + ": " + isOneEdit2);
        
        String e = "pale";
		String f = "pkde";
		boolean isOneEdit3 = oneEditAway(e, f);
		System.out.println(c + ", " + d + ": " + isOneEdit3);
	}

    public static boolean oneEditAway(String a, String b) { 
        if(Math.abs(a.length() - b.length()) > 1) { 
            return false;
        }
        String st = a.length() < b.length() ? a : b;
        String lg = a.length() > b.length() ? a : b;

        int index1 = 0, index2 = 0;
        boolean flag = false;
        while(index1 < st.length() && index2 < lg.length()) { 
            if(a.charAt(index1) != b.charAt(index2)) { 
                if(flag) {
                    return false;
                }
                flag = true;
                if(a.length() == b.length()) { 
                    index1++;
                }
            } else { 
                index1++;
            }
            index2++;
        }
        return true;
    }
}