package cn.hutool.json;

import lombok.Data;
<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * https://github.com/dromara/hutool/issues/3506
=======
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * https://github.com/chinabugotech/hutool/issues/3506
>>>>>>> 0a9627809 (release 5.8.37)
 */
public class Issue3506Test {

	@Test
	public void test3506() {
		Languages languages = new Languages();
		languages.setLanguageType(Java.class);
		String hutoolJSONString = JSONUtil.toJsonStr(languages);
		final Languages bean = JSONUtil.toBean(hutoolJSONString, Languages.class);
		assertNotNull(bean);
		assertEquals(bean.getLanguageType(), Java.class);
	}

	@Data
	public static class Languages {
		private Class<? extends Language> languageType;
	}

	public interface Language {
	}

	public static class Java implements Language {
	}
}
