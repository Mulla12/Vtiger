package DataDrivenTesting;

import org.apache.poi.EncryptedDocumentException;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class EvenOdd {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			int row=0;
			for( ; ; )
			{
				try {
					String data= ExcelData.getData("EvenOdd", row, 0);
					
					if(data!=" ")
					{
						checkEvenOdd((int)Double.parseDouble(data));
						row++;
					}else {
						break;
					}
				}catch(NullPointerException n)
				{
					break;
				}
			}
		}
		
		public static void checkEvenOdd(int num)
		{
			if(num%2==0)
			{
				System.out.println("Even : "+num);
				System.out.println();
			}else {
				System.out.println("Odd : "+num);
				System.out.println();
			}
		}
	}


