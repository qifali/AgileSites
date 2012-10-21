package wcs.core;

import java.util.Map;

/**
 * Interface for the Router (assemble/disassemble) and post (actions)
 * 
 * TODO
 * 
 * @author msciab
 *
 */

public interface Router {
	
	public void decode(String url);
	
	public void encode(Map<String, String[]> map);
	
	public void post(Map<String, String[]> map);
}
