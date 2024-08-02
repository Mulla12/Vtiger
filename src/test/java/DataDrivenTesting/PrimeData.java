package DataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class PrimeData {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
				
				int row = 0;
				for( ; ; )
				{
					try {
						String fetched= ExcelData.getData("PrimeNumber", row, 0);
						
						if(fetched!=" ")
						{
							isPrime((int)Double.parseDouble(fetched));
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
		
		public static void isPrime(int num)
		{
			for(int i=2;i<num; i++)
			{
				if(num%i==0)
				{
					System.out.println("Not Prime : "+num);
					System.out.println();
					return;
				}
			}
			System.out.println("Prime : "+num);
			System.out.println();
		}
	}


