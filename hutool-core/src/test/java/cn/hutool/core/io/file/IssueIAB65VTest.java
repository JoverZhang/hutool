package cn.hutool.core.io.file;

import cn.hutool.core.io.FileUtil;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
<<<<<<< HEAD
 * https://gitee.com/dromara/hutool/issues/IAB65V
=======
 * https://gitee.com/chinabugotech/hutool/issues/IAB65V
>>>>>>> 0a9627809 (release 5.8.37)
 */
public class IssueIAB65VTest {
	@Test
	public void getAbsolutePathTest() {
		String path = "D:\\test\\personal\n";

		File file = FileUtil.file(path);
		if(FileUtil.isWindows()){
			// 换行符自动去除
			assertEquals("D:\\test\\personal", file.toString());
		}
	}
}
