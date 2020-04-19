class StringCompression { 
    public static void main(String[] args) {
		String str = "aa";
		System.out.println(str);
		System.out.println(compressBad(str));
    }
    
    public static String compressBad(String str) { 
        StringBuilder temp = new StringBuilder();
        int count = 0;
        for(int i = 0; i < str.length(); i++) { 
            count++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) { 
                temp.append(str.charAt(i));
                temp.append(count);
                count = 0;
            } 
        }
        return str.length() < temp.toString().length() ? str : temp;
    }
}