package no.hvl.dat108.beanvalidation.customvalidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

/**
 * Validates that a date is after the specified date provided in the {@link no.hvl.dat108.beanvalidation.customvalidator.AfterDate} annotation.
 * This annotation was generated with ChatGPT.
 */
public class AfterDateValidator implements ConstraintValidator<no.hvl.dat108.beanvalidation.customvalidator.AfterDate, LocalDate> {

	private String specifiedDate;

	/**
	 * Initializes the validator with the specified date provided in the annotation.
	 *
	 * @param constraintAnnotation The {@link no.hvl.dat108.beanvalidation.customvalidator.AfterDate} annotation.
	 */
	@Override
	public void initialize(no.hvl.dat108.beanvalidation.customvalidator.AfterDate constraintAnnotation) {
		specifiedDate = constraintAnnotation.date();
	}

	/**
	 * Checks whether the provided date is after the specified date.
	 *
	 * @param value   The date to be validated.
	 * @param context Validation context.
	 *
	 * @return {@code true} if the date is after the specified date, {@code false} otherwise.
	 */
	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if (value == null) {
			return true; // Null values are handled by @NotNull annotation
		}

		LocalDate minDate = LocalDate.parse(specifiedDate);
		System.out.println(minDate);
		System.out.println(value);
		return value.isAfter(minDate);
	}
}
