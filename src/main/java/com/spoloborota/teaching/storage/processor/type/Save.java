package com.spoloborota.teaching.storage.processor.type;

import java.io.FileWriter;
import java.io.IOException;

import com.spoloborota.teaching.storage.model.RAM;
//import com.spoloborota.teaching.storage.view.*;

public class Save {

	public static String process(RAM ram) {	
		String isSaved = ram.Save();
		return isSaved;
	}
	{
	
	try(FileWriter writer = new FileWriter("C:\\SomeDir\\notes3.txt", false))
    {
       // ������ ���� ������
        String text = "���� ���� ����, ���� ���� ����";
        writer.write(text);
        // ������ �� ��������
        writer.append('\n');
        writer.append('E');
         
        writer.flush();
    }
    catch(IOException ex){
         
        System.out.println(ex.getMessage());
    } 
} 
	

	
}
