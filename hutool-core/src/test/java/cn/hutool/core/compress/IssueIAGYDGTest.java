package cn.hutool.core.compress;

import cn.hutool.core.util.ZipUtil;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
<<<<<<< HEAD
 * https://gitee.com/dromara/hutool/issues/IAGYDG
=======
 * https://gitee.com/chinabugotech/hutool/issues/IAGYDG
>>>>>>> 0a9627809 (release 5.8.37)
 */
public class IssueIAGYDGTest {
	@Test
	@Disabled
	public void zipTest() {
		// 第一次压缩后，IssueIAGYDG.zip也会作为文件压缩到IssueIAGYDG.zip中，导致死循环
		final File filea = new File("d:/test/");
		final File fileb = new File("d:/test/IssueIAGYDG.zip");
		ZipUtil.zip(fileb, false, filea.listFiles());
	}
}
