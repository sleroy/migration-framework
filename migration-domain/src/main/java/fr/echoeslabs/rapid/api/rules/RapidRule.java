/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.echoeslabs.rapid.api.rules;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This interface defines the description of a rapid rule.
 *
 * @author sleroy
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface RapidRule {

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	String description() default "";

	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	String key();

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String name();

	/**
	 * Gets the parameters.
	 *
	 * @return the parameters
	 */
	RapidParameter[] parameters() default {};

	/**
	 * Type.
	 *
	 * @return the rapid rule type
	 */
	RapidRuleType type() default RapidRuleType.REFACTORING;

}
