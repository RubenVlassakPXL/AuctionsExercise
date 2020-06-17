package be.pxl.auctions.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorIsValidTest {

	@Test
	public void returnsTrueWhenValidEmail() {
		String validEmail = "pietjanssen@pxl.be";
		assertTrue(EmailValidator.isValid(validEmail));
	}

	@Test
	public void returnsFalseWhenAtSignMissing() {
		String invalidEmail = "pietjanssen.pxl.be";
		assertFalse(EmailValidator.isValid(invalidEmail));
	}

}
