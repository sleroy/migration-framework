/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.echoeslabs.rapid.api.rules;

import fr.echoeslabs.rapid.api.analysis.params.ParameterType;

/**
 * This interface defines the rapid parameter.
 *
 * @author sleroy
 */
public @interface RapidParameter {

	String defaultValue() default "";

	String description() default "";

	String name();

	ParameterType type() default ParameterType.STRING;

}
