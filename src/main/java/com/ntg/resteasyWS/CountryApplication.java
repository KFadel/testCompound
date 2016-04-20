package com.ntg.resteasyWS;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/resteasyNew")
public class CountryApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public CountryApplication() {
		singletons.add(new CountryWS());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
