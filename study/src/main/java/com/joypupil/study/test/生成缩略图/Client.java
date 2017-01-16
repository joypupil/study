package com.joypupil.study.test.生成缩略图;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fromPic = new File("F:\\test\\test200x200.gif");
		File toPic = new File("F:\\test\\test100x100");
		String suffix = "gif";
//		Thumbnails.of(file).size(100, 100).toFile(file2);
		createImage(100, 100, fromPic, toPic, suffix);
		toPic = new File("F:\\test\\test200x200");
		createImage(200, 200, fromPic, toPic, suffix);
		toPic = new File("F:\\test\\test400x400");
		createImage(400, 400, fromPic, toPic, suffix);
		toPic = new File("F:\\test\\test800x800");
		createImage(800, 800, fromPic, toPic, suffix);
		toPic = new File("F:\\test\\test1600x1600");
		createImage(1600, 1600, fromPic, toPic, suffix);
//		//压缩至指定图片尺寸（例如：横400高300），保持图片不变形，多余部分裁剪掉(这个是引的网友的代码)  
//		BufferedImage image = ImageIO.read(fromPic);  
//		Thumbnails.Builder<BufferedImage> builder = null;  
//		  
//		int imageWidth = image.getWidth();  
//		int imageHeitht = image.getHeight();  
//		if ((float)300 / 400 != (float)imageWidth / imageHeitht) {  
//		    if (imageWidth > imageHeitht) {  
//		        image = Thumbnails.of(fromPic).height(100).asBufferedImage();  
//		    } else {  
//		        image = Thumbnails.of(fromPic).width(100).asBufferedImage();  
//		    }  
//		    builder = Thumbnails.of(image).sourceRegion(Positions.CENTER, 100, 100).size(100, 100);  
//		} else {  
//		    builder = Thumbnails.of(image).size(100, 100);  
//		}  
//		builder.outputFormat("jpg").toFile(toPic);  

	}
	
	public static void createImage(int width, int height, File fromPic, File toPic, String suffix) throws IOException{
		BufferedImage image = ImageIO.read(fromPic);  
		Thumbnails.Builder<BufferedImage> builder = null;  
		int imageWidth = image.getWidth();  
		int imageHeitht = image.getHeight();  
		if ((float)width / height != (float)imageWidth / imageHeitht) {  
		    if (imageWidth > imageHeitht) {  
		        image = Thumbnails.of(fromPic).height(height).asBufferedImage();  
		    } else {  
		        image = Thumbnails.of(fromPic).width(width).asBufferedImage();  
		    }  
		    builder = Thumbnails.of(image).sourceRegion(Positions.CENTER, width, height).size(width, height);  
		} else {  
		    builder = Thumbnails.of(image).size(width, height);  
		}  
		builder.outputFormat(suffix).toFile(toPic);
	}

}
