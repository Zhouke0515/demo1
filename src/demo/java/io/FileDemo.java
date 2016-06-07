package demo.java.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("d://Desktop//test.txt");
		File dir = new File("d:");
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);

		// File.createTempFile("tmp", ".txt", new File("d://Desktop//"));  //创建临时文件
		File[] files = File.listRoots();         //得到跟目录列表
		for (int i = 0, len = files.length; i < len; i++) {
			System.out.print(files[i].isDirectory());         //是否是目录
			System.out.println(files[i].getAbsoluteFile());   //得到绝对路径
		}

		System.out.println(file.getParent());                 //得到上一层目录
		System.out.println(file.getName());                   //得到文件名或目录名
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());          //得到相对路径
		System.out.println(file.getFreeSpace() / 1024 / 1024 / 1024 + "GB");    //得到磁盘空闲空间大小
		System.out.println(file.getTotalSpace() / 1024 / 1024 / 1024 + "GB");   //得到磁盘总空间大小
		System.out.println(file.getUsableSpace() / 1024 / 1024 / 1024 + "GB");  //得到磁盘可用空间大小
		System.out.println(file.getAbsoluteFile());           //返回绝对路径的file对象
		System.out.println(file.getCanonicalFile());          //返回相对路径的file对象
		System.out.println(file.getParentFile());             //得到负目录的file对象

		System.out.println(file.canExecute());            //是否可执行
		System.out.println(file.canRead());               //是否可读
		System.out.println(file.canWrite());              //是否可写

		// System.out.println(file.delete());              //删除
		System.out.println(file.exists());                 //是否存在
		// System.out.println(file.createNewFile());        //创建新文件
		System.out.println(file.compareTo(new File("d://Desktop//output")));       //与指定文件比较

		System.out.println(file.isAbsolute());        //
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());

		System.out.println(file.lastModified());         //最后修改的时间
		System.out.println(file.length());               //文件大小
		System.out.println(file.mkdir());                //创建目录
		System.out.println(file.mkdirs());
		System.out.println(file.renameTo(new File("d://Desktop//test1.txt")));      //移动文件或者重命名文件
		for (int i = 0, len = dir.list().length; i < len; i++) {
			//System.out.println("list:" + dir.list()[i]);       	//得到目录下文件列表
			System.out.println("absPath:" + dir.listFiles()[i]
					.getAbsolutePath());
		}
		System.out.println(file.toPath());
	}

}
