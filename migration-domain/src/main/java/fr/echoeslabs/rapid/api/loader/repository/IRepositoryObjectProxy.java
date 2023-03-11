
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.echoeslabs.rapid.api.loader.repository;

/**
 * This interface creates a new instance of an object from a repository and a
 * IMigrationContext object.
 *
 * @author sleroy
 */
public interface IRepositoryObjectProxy<I> {

	Class<? extends I> getComponentImpl();

	String getComponentName();

	I getComponentSingleton();

}
