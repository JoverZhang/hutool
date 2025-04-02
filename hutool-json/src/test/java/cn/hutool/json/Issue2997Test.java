package cn.hutool.json;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Issue2997Test {
	@Test
	public void toBeanTest() {
		// https://github.com/dromara/hutool/issues/2997
=======
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Issue2997Test {
	@Test
	public void toBeanTest() {
		// https://github.com/chinabugotech/hutool/issues/2997
>>>>>>> 0a9627809 (release 5.8.37)
		final Object o = JSONUtil.toBean("{}", Object.class);
		assertEquals(JSONObject.class, o.getClass());
	}
}
