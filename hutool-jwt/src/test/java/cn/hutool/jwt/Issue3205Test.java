package cn.hutool.jwt;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.KeyUtil;
import cn.hutool.jwt.signers.AlgorithmUtil;
import cn.hutool.jwt.signers.JWTSigner;
import cn.hutool.jwt.signers.JWTSignerUtil;
import io.jsonwebtoken.Jwts;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.security.KeyPair;

/**
<<<<<<< HEAD
 *https://github.com/dromara/hutool/issues/3205
=======
 *https://github.com/chinabugotech/hutool/issues/3205
>>>>>>> 0a9627809 (release 5.8.37)
 */
public class Issue3205Test {
	@Test
	public void es256Test() {
		final String id = "es256";
		final KeyPair keyPair = KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id));
		final JWTSigner signer = JWTSignerUtil.createSigner(id, keyPair);

		final JWT jwt = JWT.create()
			.setPayload("sub", "1234567890")
			.setPayload("name", "looly")
			.setPayload("admin", true)
			.setExpiresAt(DateUtil.tomorrow())
			.setSigner(signer);

		final String token = jwt.sign();

		final boolean signed = Jwts.parser().verifyWith(keyPair.getPublic()).build().isSigned(token);

		assertTrue(signed);
	}
}
