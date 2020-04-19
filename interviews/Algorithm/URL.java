class URL {
	// Assume string has sufficient free space at the end
	// public static void replaceSpaces(char[] str, int trueLength) {
    //     int count = 0, pointer = 0;
	// 	for(int i = 0; i < trueLength; i++) { 
    //         if(str[i] == ' ') { 
    //             count++;
    //         }
    //     }
    //     pointer = (count * 2) + trueLength;
    //     if (trueLength < str.length) str[trueLength] = '\0';
    //     for(int i = trueLength - 1; i >= 0; i--) { 
    //         if (str[i] == ' ') {
    //             str[pointer - 1] = '0';
    //             str[pointer - 2] = '2';
    //             str[pointer - 3] = '%';
    //             pointer -= 3;
    //         } else { 
    //             str[pointer] = str[i];
    //             pointer--;
    //         }
    //     }
    //}

    public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) str[trueLength] = '\0';
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
    
    public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);	
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < arr.length; i ++) { 
            temp.append(arr[i]);
        }
		System.out.println("\"" + temp.toString() + "\"");
	}
}