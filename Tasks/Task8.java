public class Task8{
/** Need
Написать метод который: 
1. принимает 2м массив интов, ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
2. приминает 2 инта, а и б, возвращает большее их этих 2х чисел
3. принимает 3 инта, возвращает большее из них
4. приминает 5 интов, возвращает большее из них
5. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
6. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
7. Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
8. принимает массив байт всегда размером 5000, если в массиве есть повторяющиеся елементы, возвращает тру
*/	
	public static void main(String[] args) {
//1. принимает 2м массив интов, ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
/*		int[] ia = {1,5,75,-34, 22,-0};
		printIntArray(ia);
		invIntArray(ia);
		System.out.println("---------------------");
		printIntArray(ia);
*/
//2. приминает 2 инта, а и б, возвращает большее их этих 2х чисел
//		System.out.println("max val :"+max2(10,101));

//3. принимает 3 инта, возвращает большее из них		
//		System.out.println("max val :"+max3(10,101,1001));

//4. приминает 5 интов, возвращает большее из них
//		System.out.println("max val :"+max5(10,101,65535,32,64));
//		System.out.println("max val :"+maxN(new int[]{55,35,101,57,33}));		

//5. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
//		System.out.println("index of val :"+indexOfRev(1,new int[]{3,4,67,7,9,1,22,34,47}));
//		System.out.println("index of val :"+indexOfRev(100,new int[]{3,4,67,7,9,1,22,34,47}));
//6. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
//		System.out.println("index of val :"+indexOf(1,new int[]{3,4,67,7,9,1,22,34,47}));
//		System.out.println("index of val :"+indexOf(100,new int[]{3,4,67,7,9,1,22,34,47}));
//7. Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
/*		for(String s: getStringWith("dbms_lock",false,new String[]{
				"User locks never conflict with Oracle locks because they are identified with the prefix UL.",
				"You can view these locks using the Enterprise Manager lock monitor screen or the appropriate fixed views.",
				"User locks are automatically released when a session terminates.The lock identifier is a number in the range of 0 to 1073741823.",
				"Because a reserved user lock is the same as an Oracle lock, it has all the functionality of an Oracle lock, such as deadlock detection. ",
				"Be certain that any user locks used in distributed transactions are released upon COMMIT, or an undetected deadlock may occur.",
				"DBMS_LOCK is most efficient with a limit of a few hundred locks for each session. ",
				"Oracle strongly recommends that you develop a standard convention for using these locks in order to avoid conflicts among procedures trying to use the same locks. ",
				"For example, include your company name as part of your lock names."})){
			System.out.println(s);
		}*/
//8. принимает массив байт всегда размером 5000, если в массиве есть повторяющиеся елементы, возвращает тру
	byte[] byteArray= new byte[5000]; //[250];//
	for(int i=0; i<byteArray.length;i++){
		byteArray[i] = (byte)i;
	}
//	byteArray[240] = 77; 

    System.out.println(" The array have non uniq elements it is :"+checkUniq(byteArray));
	}
	public static void invIntArray(int[] intArray){
		for(int i = 0; i < intArray.length; i++){
			intArray[i] *= -1;
		}
	}
	public static void printIntArray(int[] intArray){
		for(int i : intArray){
			System.out.println(i);
		}
	}
	public static int max2(int a, int b){
		return (a>b)?a:b;//Math.max(a,b);
	}
	public static int maxN(int[] intArray){
		int a1 = intArray[0];
		for (int a:intArray){
			a1 = max2(a1,a);
		}
		return a1;
	}
	public static int max3(int a,int b,int c){
		return maxN(new int[]{a,b,c});
	}
	public static int max5(int a1,int a2,int a3, int a4, int a5){
		return maxN(new int[]{a1,a2,a3,a4,a5});
	}

	public static int indexOfRev(int searchInt, int[] intArray){
		int resValue = -1;
		for(int i = intArray.length-1;i>=0; i--){
			if(searchInt == intArray[i]){
				resValue = i;
				break;
			}
		}
		return resValue;
	}

	public static int indexOf(int searchInt, int[] intArray){
		int resValue = -1;
		for(int i = 0; i<intArray.length;i++){
			if(searchInt == intArray[i]){
				resValue = i;
				break;
			}
		}
		return resValue;
	}

	public static String[] getStringWith(String searchStr, boolean caseSensetive, String[] stringArray){
		int[] existIdx = new int[stringArray.length];
		int  existI = 0;
		for(int i=0; i< stringArray.length; i++)
			if((caseSensetive?stringArray[i]:stringArray[i].toUpperCase()).indexOf(caseSensetive?searchStr:searchStr.toUpperCase())>=0){
					existIdx[existI++] = i;
			}
		String[] retValue = new String[existI];
		for(int i=0;i<existI;i++){
			retValue[i] = stringArray[existIdx[i]];
		}	
		return retValue;
	}
	
	public static boolean checkUniq(byte[] byteArray){
		boolean retValue = //false; //
		 			(byteArray.length<Byte.MIN_VALUE || byteArray.length>Byte.MAX_VALUE);
		if(!retValue){
			mainLoop:
			for(int i=0;i<byteArray.length;i++)
				for(int j=i+1;j<byteArray.length;++j)
					if(byteArray[i] == byteArray[j]){
						 retValue = true;
						 break mainLoop;
					}
		}
		return retValue;
	}
}