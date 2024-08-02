package DataDrivenTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;

public class RepeatData {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Set<Integer> set = new LinkedHashSet();
		
		List<Integer> list = new ArrayList();
		
		int row=0;
 
		while(true)
		{
			try {
				String fetched= ExcelData.getData("Frequency", row, 0);
				
				if(fetched!=" ")
				{
					int number = (int)Double.parseDouble(fetched);
					
					set.add(number);
					list.add(number);
					
					row++;
				}
			}catch(NullPointerException n)
			{
				break;
			}
			
		}
		for(Integer i:set)
		{
			int rep = Collections.frequency(list, i);
			System.out.println(i+" Digit Repeated = "+rep+" Times");
			System.out.println();
		}
	}
}