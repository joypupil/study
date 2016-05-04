package com.joypupil.study.tools.验证码生成;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		MakeCertPic certPic = new MakeCertPic();
		certPic.getCertPic(0, 0, new FileOutputStream(new File("D://test.JPEG")));

	}

}
