package com.zh.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DocumentTools {

	public static Document getDocument() throws Exception
	{
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("src/myClass_new.xml"));
		return doc;
	}
	
	public static void updateDocument(Document doc) throws Exception
	{
		OutputFormat output=OutputFormat.createPrettyPrint();
		output.setEncoding("utf-8");
		XMLWriter writer=new XMLWriter(new FileOutputStream(new File("src/myClass_new.xml")),output);
		writer.write(doc);
		writer.close();
	}
}
