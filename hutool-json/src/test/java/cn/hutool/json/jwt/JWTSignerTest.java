package cn.hutool.json.jwt;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.KeyUtil;
import cn.hutool.json.jwt.signers.AlgorithmUtil;
import cn.hutool.json.jwt.signers.JWTSigner;
import cn.hutool.json.jwt.signers.JWTSignerUtil;
import org.junit.Assert;
import org.junit.Test;

public class JWTSignerTest {

	@Test
	public void hs256Test(){
		String id = "hs256";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKey(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void hs256Test2(){
		final JWTSigner signer = JWTSignerUtil.hs256("123456".getBytes());

		signAndVerify(signer);
	}

	@Test
	public void hs384Test(){
		String id = "hs384";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKey(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void hs512Test(){
		String id = "hs512";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKey(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void rs256Test(){
		String id = "rs256";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void rs384Test(){
		String id = "rs384";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void rs512Test(){
		String id = "rs512";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void es256Test(){
		String id = "es256";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void es384Test(){
		String id = "es384";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void es512Test(){
		String id = "es512";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void ps256Test(){
		String id = "ps256";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	@Test
	public void ps384Test(){
		String id = "ps384";
		final JWTSigner signer = JWTSignerUtil.createSigner(id, KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(id)));
		Assert.assertEquals(AlgorithmUtil.getAlgorithm(id), signer.getAlgorithm());

		signAndVerify(signer);
	}

	private static void signAndVerify(JWTSigner signer){
		JWT jwt = JWT.create()
				.setPayload("sub", "1234567890")
				.setPayload("name", "looly")
				.setPayload("admin", true)
				.setExpiresAt(DateUtil.tomorrow())
				.setSigner(signer);

		String token = jwt.sign();
		Assert.assertTrue(JWT.of(token).verify(signer));
	}
}
