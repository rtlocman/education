public class Task29{
/** 	Все задачи заключаются в том, чтобы написать метод, который:
	1. принимает массив чаров, выводит его на экран
	2. принимает 2м массив строк, выводит его на экран
	3. принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
	4. принимает 2м массив интов,  ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
	5. приминает 2 инта, а и б, возвращает большее их этих 2х чисел
	6. принимает 3 инта, возвращает большее из них
	7. приминает 5 интов, возвращает большее из них
	8. принимает массив чаров, возвращает строку состоящую из символов массива
	9. принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
	10. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
	11. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
	12. метод принимает инт, и возвращает факториал от заданого инта
	13. принимает инт год, и возвращает тру если год высокосный
	14. Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
	15. приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
	16. метод приминает дабл, выводит на екран этот дабл с точностью не больше чем 3 знака после точки
	17. метод принимает массив интов сортирует его по возрастанию
	18. метод приминимает массив интов сортирует его по убыванию (нельзя использовать методы сторонних классов)
	19. метод принимает массив интов и булен, если булен тру то сортирует по убываниию, иначе по возрастанию
	20. принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
	21. принимает два массива интов одинаковых по длинне, возращает массив интов который состоит из перемноженных елементов входящих массивов
	22. принимает два массива интов, возвращает массив из елементов которые не совпадают в массивах
	23. принимает масив интов, возвращает его же но в реверсном порядке
	24. "принимает 2 инта
		1) размер выходного массива
		2) верхняя граница
	 	возвращает массив интов заданой длинный, который содержит случайные числа от нуля до верхней границы"
	25. "принимает 3 инта
		1) размер выходного массива
		2) нижняя граница
		3) верхняя граница
		возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы"
	26. принимает строку, возвращает тру если в строка содержит однин символ @, и хотя бы одну точку
	27. принимает строку, возращает эту же строку, но символы в ней расположены задом-наперед
	28. принимает два массива интов, возвращает массив состоящий из всех елементов входящих массивов
	29. принимает массив интов, возвращает больший из них
*/
//=============================
static public void main(String[] args) {
//1. принимает массив чаров, выводит его на экран
/*		String str = "You can view these locks";
		outCharArray(str.toCharArray(),false);
		outCharArray(str.toCharArray(),true);*/
//2. принимает 2м массив строк, выводит его на экран
//		String[][]	strArr2 = {{"qwew","ewwe","eeee"},{"rrr","ffff"}};
/*		String[][]	strArr2 =  {{"he","general","contract","of","hashCode","is:"},
								{"Whenever","it","is","invoked","on","the","same","object","more","than","once","during","an","execution","of","a","Java","application,"},
								{"the","hashCode","method","must","consistently","return","the","same","integer,","provided","no","information","used","in","equals","comparisons","on","the","object","is","modified."},
								{"This","integer","need","not","remain","consistent","from","one","execution","of","an","application","to","another","execution","of","the","same","application."}};


		outStrArray(strArr2," ","\n");
*/		
//3. принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта		
/*		int[][] intArr2 = {{123,145,17,16},{45,12,75},{15}};
		char[][] charArr2 = convInt2Char(intArr2);
		for(char[] row : charArr2){
			for(char c : row){
				System.out.print(c+" ");
			}
			System.out.println("");	
		}
*/
//4. принимает 2м массив интов,  ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)		
/*		int[][] intArr2 = {{123,145,17,-16},
					       {45,-12,75},
						   {15},
						   {65535,128,512,-2}};
		invIntArray(intArr2);
		for(int[] row : intArr2){
			for(int i : row){
				System.out.print(i+" ");
			}
			System.out.println("");	
		}
*/
//	5. приминает 2 инта, а и б, возвращает большее их этих 2х чисел
//	6. принимает 3 инта, возвращает большее из них
//	7. приминает 5 интов, возвращает большее из них
// см Task8.java
//8. принимает массив чаров, возвращает строку состоящую из символов массива
//		System.out.println(charToString(new char[]{'H','e','l','l','o',' ','W','o','r','l','d','!','!','!'}));
//9. принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
//		System.out.println("the first array is consist in second one its:"+indexOfCharArray(("point of").toCharArray(),("Is this poi? No! This is our point, some point of view").toCharArray()));
//10. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
//11. принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
// см Task8.java

//12. метод принимает инт, и возвращает факториал от заданого инта
//		System.out.println("20! = "+ factorial(20));	
//13. принимает инт год, и возвращает тру если год высокосный
//		System.out.println("Is the 2016 leap-year :"+isLeapYear(2016));
//14. Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
// см Task8.java

//15. приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
//		showMultipleNumbers(3, new int[]{33,124,53,78,901,746,543});
//16. метод приминает дабл, выводит на екран этот дабл с точностью не больше чем 3 знака после точки
//		System.out.println("rounded num is = " + round(4235.45683185,3));
//17. метод принимает массив интов сортирует его по возрастанию
/*		int[] arr = orderIntArrayAsc(new int[]{123,432,34,5,233,11,45,75,69,32,55,14,300,101});
		for(int i:arr)
			System.out.print(" "+i);
		System.out.println();
*/		
//18. метод приминимает массив интов сортирует его по убыванию (нельзя использовать методы сторонних классов)
/*		arr = orderIntArrayDesc(new int[]{123,432,34,5,233,11,45,75,69,32,55,14,300,101});
		for(int i:arr)
			System.out.print(" "+i);
		System.out.println();
*/		
//19. метод принимает массив интов и булен, если булен тру то сортирует по убываниию, иначе по возрастанию
/*		arr = orderIntArray(false,new int[]{123,432,34,5,233,11,45,75,69,32,55,14,300,101});
		for(int i:arr)
			System.out.print(" "+i);
		System.out.println();
*/		
//20. принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
// см Task8.java
//21. принимает два массива интов одинаковых по длинне, возращает массив интов который состоит из перемноженных елементов входящих массивов
/*		for(int i: multArray(new int[]{1,2,3,4,5,6,7,8,9},new int[]{10,9,8,7,6,5})){
			System.out.print(" "+i);
		}
*/		
//22. принимает два массива интов, возвращает массив из елементов которые не совпадают в массивах
/*		for(int i: intersctArray(new int[]{1,2,3,4,0,6,7,8,9},new int[]{1,10,9,8,7,6,5,1})){
			System.out.print(" "+i);
		}
*/		
//23. принимает масив интов, возвращает его же но в реверсном порядке
/*		for(int i: revArray(new int[]{1,2,3,4,5,6,7,8,9,10})){
			System.out.print(" "+i);
		}
*/
//24. "принимает 2 инта
//	1) размер выходного массива
//	2) верхняя граница
// 	возвращает массив интов заданой длинный, который содержит случайные числа от нуля до верхней границы"
/*		for(int i: genRndArrayFrom0(100,100)){
			System.out.print(" "+i);
		}
*/		
//25. "принимает 3 инта
//	1) размер выходного массива
//	2) нижняя граница
//	3) верхняя граница
//	возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы"
/*		for(int i: genRndArray(100,100,-10)){
			System.out.print(" "+i);
		}
*/		
//26. принимает строку, возвращает тру если в строка содержит однин символ @, и хотя бы одну точку
/*		System.out.print("the string is fulfil conditions :"+checkString("ksd.jf sdfkjrew @xdcv @skdj.fsdrf .swer"));	
		System.out.print("the string is fulfil conditions :"+checkString("ksd.jf sdfkjrew @xdcv skdj.fsdrf .swer"));	
*/		
//27. принимает строку, возращает эту же строку, но символы в ней расположены задом-наперед
//		System.out.print("the string in mirror state  :"+revString("The equals method implements"));
//28. принимает два массива интов, возвращает массив состоящий из всех елементов входящих массивов
/*		for(int i: unionArrays(new int[]{1,2,3,4,0,6,7,8,9},new int[]{1,10,9,8,7,6,5,1})){
			System.out.print(" "+i);
		}		
*/		
//29. принимает массив интов, возвращает больший из них
		for(int i: maxArrays(new int[]{1,2,3,4,0,6,7,8,9},new int[]{1,10,8,7,6,5,1})){
			System.out.print(" "+i);
		}		
	}
 //=============================
	static public void outCharArray(char[] charArray,boolean withEndOfLine){
  		for(char c : charArray){
  			System.out.printf((withEndOfLine?"\n":"")+"%c",c);
  		}
  	}
//=============================
	static public void outStrArray(String[][] stringArray2, String colDelemiter, String rowDelemiter){
  		for(String[] sa: stringArray2){
  			for(String s : sa){
  				System.out.print(s+colDelemiter);
  			}
  			System.out.print(rowDelemiter);
  		}
  	}
//=============================
	static public char[][] convInt2Char(int[][] intArrray2){
		char[][] retValue = new char[intArrray2.length][];
		for(int iRow=0;iRow< intArrray2.length; iRow++){
			retValue[iRow] = new char[intArrray2[iRow].length];
			for(int iCol=0;iCol<intArrray2[iRow].length;iCol++){
				retValue[iRow][iCol] = (char)intArrray2[iRow][iCol];
			}
		}
		return retValue;
	}
//=============================
	static public void invIntArray(int[][] intArrray2){
		for(int[] row : intArrray2){
			for(int i=0;i<row.length;i++){
				row[i] *= -1;
			}
		}
	}
//=============================
	static public String charToString(char[] charArray){
		String retValue = "";
		for(char c: charArray){
			retValue = retValue + c;
		}
		return retValue;
	}
//=============================
	static public boolean indexOfCharArray(char[] searchCharArray, char[] srcCharArray){
		boolean retValue = false;
		int resIndex;
		for(int curIdx=0;curIdx<srcCharArray.length;curIdx++){
System.out.println(srcCharArray[curIdx]);			
			if(srcCharArray[curIdx]==searchCharArray[0]){
				for(resIndex=0;resIndex<searchCharArray.length;resIndex++){
System.out.print(srcCharArray[curIdx+resIndex]);			
					if(srcCharArray[curIdx+resIndex]!=searchCharArray[resIndex]){
System.out.println("X");			
						break;
					}
				}
				if(resIndex == searchCharArray.length){
					retValue = true;
System.out.println("");					
					break;
				}
			}
				
		}
		return retValue;
	}
//=============================
	static public long factorial(long x){
		long rv = ((x>1)?(x*factorial(x-1)):1);
		System.out.println("x= "+x+ "  "+rv);	
		return rv;
	}
//=============================
	static public boolean isLeapYear(int year){
		return ((year % 4 == 0)||(year % 100 == 0)||(year % 400 == 0));
	}
	
//=============================
	static public void showMultipleNumbers(int elemNum, int[] intArrray){
		for(int i: intArrray) {
			System.out.print(((i % elemNum == 0)?(i+" "):""));
		}
	}
//=============================
	static public double round(double value,int precision){
		double shift = Math.pow(10,precision);
		return Math.round(value * shift)/shift;
	}
//=============================
	static public int[] orderIntArray(boolean direction,int[] intArr){
		for(int outerIdx = 0;  outerIdx < intArr.length; outerIdx++){
			for(int innerIdx = outerIdx; innerIdx< intArr.length; innerIdx++){
				if(intArr[innerIdx] == intArr[outerIdx]){
					//nothing
				}else if((intArr[innerIdx] > intArr[outerIdx])==direction){
					int t = intArr[innerIdx];
					intArr[innerIdx] = intArr[outerIdx];
					intArr[outerIdx] = t;
				}
			}
		}
		return intArr;
	}
//=============================
	static public int[] orderIntArrayAsc(int[] intArr){
		return orderIntArray(false,intArr);
	}
//=============================
	static public int[] orderIntArrayDesc(int[] intArr){
		return orderIntArray(true,intArr);
	}
//=============================
	static public int[] multArray(int[] intA1,int[] intA2){
		int dimm = Math.min(intA1.length,intA2.length);
		int[] retValue = new int[dimm];
		for(int i=0;i<dimm;i++){
			retValue[i] = intA1[i] * intA2[i];
		}
		return retValue;
	}
		
//=============================
	static public int[] revArray(int[] intArr){
		int last = intArr.length-1;
		for(int i=0;i<(intArr.length/2);i++){
			int tmp = intArr[i];
			intArr[i] = intArr[last-i];
			intArr[last-i] = tmp;
		}
		return intArr;
	}
	
//=============================
	static public int[] intersctArray(int[] intA1,int[] intA2){
		int shift = intA1.length;
		int countOfEq=0;
		int[] usedIdx = new int[intA1.length+intA2.length];

		for(int ia1=0;ia1<intA1.length;ia1++)
			for(int ia2=0;ia2<intA2.length;ia2++)
				if(intA1[ia1] == intA2[ia2]){
					usedIdx[ia1]++;
					usedIdx[ia2+shift]++;
					countOfEq+=((usedIdx[ia1]==1)?1:0)+((usedIdx[ia2+shift]==1)?1:0);
				}
System.out.print("index :");				
for(int i=0;i<usedIdx.length;i++){
	System.out.print(" "+usedIdx[i]);
}
		int[] retValue = new int[usedIdx.length - countOfEq];
System.out.println("result length = "+retValue.length);
		for(int i=0,e=0;i<usedIdx.length;i++)
		   if(usedIdx[i]==0){
System.out.println(" i="+i+"  "+((i<shift)?"intA1 :"+i:"intA2 :"+(i-shift)));		   	
			retValue[e++] = ((i<shift)?intA1[i]:intA2[i-shift]);
		}
		return retValue;
	}
	
//=============================
	static public int[] genRndArrayFrom0(int siseArr,int highBorder){
		return genRndArray(siseArr,highBorder,0);
	}
	
//=============================
	static public int[] genRndArray(int siseArr,int highBorder,int lowBorder){
		int wideBorder = highBorder - lowBorder+1;
		int[] retValue = new int[siseArr];
		for(int i=0;i<siseArr;i++)
			retValue[i] = ((int)(Math.random() * wideBorder) + lowBorder);
		return retValue;
	}
//=============================
	static public boolean checkString(String str){
		int collectResult = 0;
		for(char c : str.toCharArray()){
			collectResult += ((c=='@')?2:0);
			collectResult |= ((c=='.')?1:0);
System.out.printf(" %c   %x\n",c,collectResult);
		}
		return (collectResult == 3);
	}
//=============================
	static public int[] unionArrays(int[] intA1,int[] intA2){
		int idx = 0;
		int[] retValue = new int[intA1.length+intA2.length];
		for(int i:intA1)
			retValue[idx++] = i;
		for(int i:intA2)
			retValue[idx++] = i;
		return retValue;
	}

//=============================
	static public int[] maxArrays(int[] intA1,int[] intA2){
		return ((intA1.length > intA2.length)?intA1:intA2);
	}
//=============================
	static public String revString(String str){
		char[] src = str.toCharArray();
		for(int i=0;i<src.length/2;i++){
			char c = src[src.length-i-1];
			src[src.length-i-1] = src[i];
			src[i] = c;
		} 
		return String.valueOf(src);
	}
}