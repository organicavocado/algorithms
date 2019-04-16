package tech.orgavo.expiringmap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExpiringMapTest {
	
	ExpiringMap<Integer, String> expiringMap = new ExpiringMap<>();
	
	@Test
	public void testPut() {
		expiringMap.put(1, "valueA", 1000L);
	}
	
	@Test
	public void testGet() {
		assertEquals("ValueA", expiringMap.get(1));
	}

}
