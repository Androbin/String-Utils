package de.androbin.util.txt;

import java.util.*;

public final class CaseUtil {
  private CaseUtil() {
  }
  
  public static String toLowerCamelCase( final String sentence ) {
    final String[] words = sentence.split( "_" );
    final Iterator<String> iter = Arrays.stream( words ).iterator();
    final StringBuilder sb = new StringBuilder( iter.next().toLowerCase() );
    
    iter.forEachRemaining( word -> sb.append( toProperCase( iter.next() ) ) );
    return sb.toString();
  }
  
  public static String toProperCase( final String word ) {
    return word.substring( 0, 1 ).toUpperCase() + word.substring( 1 ).toLowerCase();
  }
  
  public static String toUpperCamelCase( final String sentence ) {
    final String[] words = sentence.split( "_" );
    final Iterator<String> iter = Arrays.stream( words ).iterator();
    final StringBuilder sb = new StringBuilder();
    
    iter.forEachRemaining( word -> sb.append( toProperCase( iter.next() ) ) );
    return sb.toString();
  }
}