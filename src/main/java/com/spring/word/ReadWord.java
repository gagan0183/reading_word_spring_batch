package com.spring.word;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ReadWord {

	public static void readWordFile() {
		XWPFWordExtractor extractor = null;
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\GEGDC\\gx479932\\All lines.docx");
			XWPFDocument document = new XWPFDocument(OPCPackage.open(fis));
			extractor = new XWPFWordExtractor(document);
			String s = extractor.getText();
			String[] s1 = StringUtils.tokenizeToStringArray(s, "\n");
			for (String a : s1) {
				System.out.println(s1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				extractor.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
