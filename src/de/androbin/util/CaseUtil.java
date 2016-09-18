package de.androbin.util;

public final class CaseUtil
{
	private CaseUtil()
	{
	}
	
	public static String toProperCase( final String s )
	{
		return s.substring( 0, 1 ).toUpperCase() + s.substring( 1 ).toLowerCase();
	}
}