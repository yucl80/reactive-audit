package com.octo.reactive.audit.java.rmi.registry;

import com.octo.reactive.audit.AuditReactive;
import com.octo.reactive.audit.lib.NetworkAuditReactiveException;
import org.junit.Test;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by pprados on 19/05/2014.
 */
public class RegistryTest
{
	@Test(expected = NetworkAuditReactiveException.class)
	public void lookup() throws NotBoundException, RemoteException
	{
		AuditReactive.strict.commit();
		LocateRegistry.createRegistry(1099);
		LocateRegistry.getRegistry().lookup("abc");
	}

}
