package de.androbin.util.txt;

public final class FormatUtil {
  private FormatUtil() {
  }
  
  public static String trim( final String s, final int n ) {
    return s.length() <= n ? s : s.substring( 0, n - 3 ) + "...";
  }
}