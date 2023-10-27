package no.hvl.dat108.bean_validation.customvalidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that the annotated date must be after a specified date.
 * This annotation was generated with ChatGPT.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AfterDateValidator.class)
public @interface AfterDate {
	/**
	 * Message to be shown if validation fails.
	 * Default: "Dato må være etter angitt dato".
	 */
	String message() default "Dato må være etter angitt dato";

	/**
	 * Groups.
	 * Default: empty array.
	 */
	Class<?>[] groups() default {};

	/**
	 * Payload.
	 * Default: empty array.
	 */
	Class<? extends Payload>[] payload() default {};

	/**
	 * Specifies the minimum date constraint in the format "yyyy-MM-dd".
	 */
	String date();
}
