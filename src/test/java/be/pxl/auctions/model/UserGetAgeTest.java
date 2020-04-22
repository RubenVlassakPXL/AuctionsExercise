package be.pxl.auctions.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserGetAgeTest {

	public static final int YEARS = 15;

	@Test
	public void returnsCorrectAgeWhenHavingBirthdayToday() {
		User user = new User();
		user.setDateOfBirth(LocalDate.now().minusYears(YEARS)); // iemand die vandaag 15 jaar wordt

		int currentAge = user.getAge();

		Assertions.assertEquals(YEARS, currentAge);
	}

	@Test
	public void returnsCorrectAgeWhenHavingBirthdayTomorrow() {
		User user = new User();
		user.setDateOfBirth(LocalDate.now().minusYears(YEARS).plusDays(1)); // iemand die morgen 15 jaar wordt

		int currentAge = user.getAge();

		Assertions.assertEquals(YEARS - 1, currentAge); // vandaag is hij nog 14 jaar
	}

	@Test
	public void returnsCorrectAgeWhenBirthdayWasYesterday() {
		User user = new User();
		user.setDateOfBirth(LocalDate.now().minusYears(YEARS).minusDays(1)); // iemand die morgen 15 jaar wordt

		int currentAge = user.getAge();

		Assertions.assertEquals(YEARS, currentAge); // vandaag is hij al 15 jaar
	}

}
