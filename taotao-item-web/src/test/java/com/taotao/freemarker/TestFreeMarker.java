package com.taotao.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class TestFreeMarker {

	@Test
	public void testFreemarker() throws Exception {
		//1.创建一个模板文件
		//2.创建一个Configuration对象
		Configuration configuration = new Configuration(Configuration.getVersion());
		//3.设置模板所在的路径
		configuration.setDirectoryForTemplateLoading(new File("E:/taotao2/taotao-item-web/src/main/webapp/WEB-INF/ftl"));
		//4.设置模板的字符集，一般utf-8
		configuration.setDefaultEncoding("utf-8");
		//5.使用Configuration对象加载一个模板文件，需要指定模板文件的文件名。
		//Template template = configuration.getTemplate("hello.ftl");
		Template template = configuration.getTemplate("student.ftl");
		//6.创建一个数据集，可以是pojo也可以是map，推荐使用map
		Map data = new HashMap<>();
		data.put("hello", "hello freemarker");
		Student student = new Student(1, "小米", 11, "北京昌平回龙观");
		data.put("student", student);
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(1, "小米", 11, "北京昌平回龙观"));
		stuList.add(new Student(2, "小米2", 12, "北京昌平回龙观"));
		stuList.add(new Student(3, "小米3", 13, "北京昌平回龙观"));
		stuList.add(new Student(4, "小米4", 14, "北京昌平回龙观"));
		stuList.add(new Student(5, "小米5", 15, "北京昌平回龙观"));
		stuList.add(new Student(6, "小米6", 16, "北京昌平回龙观"));
		stuList.add(new Student(7, "小米7", 17, "北京昌平回龙观"));
		data.put("stuList", stuList);
		//日期类型的处理
		data.put("date", new Date());
		data.put("val","123456");
		//7.创建一个Writer对象，指定输出文件的路径及文件名。
		//Writer out = new FileWriter(new File("E:/taotao2/freemark/hello.html"));
		Writer out = new FileWriter(new File("E:/taotao2/freemark/student.html"));
		//8.使用模板对象的process方法输出文件。
		template.process(data, out);
		//9.关闭流
		out.close();
	}
}
