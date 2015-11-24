package so.chaos.simple.utils.impl;

import java.io.Serializable;
import java.util.Objects;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import so.chaos.simple.utils.NamedData;

public class TestNamedData {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestNamedData.class);
	
	
	private class Stu {
		private String name;
		private Integer age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
	}
	@Test
	public void test1() {
        
		NamedData nd = KeyValue.newInstance("姓名", "程超");
		
		LOGGER.info("NamedData : {}", nd);
		Assert.assertEquals("KeyValue : { key : 姓名, value : 程超}", nd.toString());
		
		Pair<Serializable, ?> pair = Pair.of(nd.getKey(), nd.getValue());
		
		Triple<String, Long, Long> triple = Triple.of("bird", System.currentTimeMillis(), System.currentTimeMillis() + 3600);
		
		LOGGER.info("pair : {}", pair);
		LOGGER.info("triple : {}", triple);
		
		
		Stu stu = new Stu();
		stu.setAge(10);
		stu.setName("hai");
		
		Stu[] array = new Stu[] { stu };
		
		String arrayStr = org.apache.commons.lang3.ArrayUtils.toString(array);
		
		System.out.println(arrayStr);
		System.out.println(Objects.toString(null, "kao"));
		System.out.println("-- end --");
		
	}
}
