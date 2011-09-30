package de.dubmas.modulob.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Use this class if you want to execute a shell command.<br/>
 * Note that this class is bound to OS X!!
 * 
 * @author steven reinisch - dubmas software planning and construction
 *
 */
public class ShellCommandExecutor {
	
	/**
	 * If you want to call "$chmod +x aFolder/aFile.sh" use this method as follows:<br/><br/>
	 * 
	 * <code>ShellCommandExecutor.execute("chmod", "+x", "aFolder/aFile.sh");</code>
	 * 
	 * @param toolCommand tool that must be called. e.g. "chmod", "aFolder/myScript.sh"
	 * @param args the tool's argument you wish to supply
	 * @return CommandResult containing output of tool invocation in CommandResult.output. If command execution
	 * failed CommandResult.success == false
	 * @throws Exception
	 */
	public static CommandResult execute(String toolCommand, String... args) throws Exception{
		List<String> commands = new ArrayList<String>(5);
		//commands.add("bash");
		commands.add(toolCommand);
		
		for(String arg: args){
			commands.add(arg);
		}
		
		ProcessBuilder pb = new ProcessBuilder(commands);
		pb.directory(new File("."));
		pb.redirectErrorStream(true);
		
		Process p = pb.start();

		//Read output
        StringBuilder out = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null, previous = null;
        while ((line = br.readLine()) != null)
            if (!line.equals(previous)) {
                previous = line;
                out.append(line).append('\n');
            }

        CommandResult cr = new CommandResult(out.toString(), true);
        
        //Check result
        if (p.waitFor() != 0){
            cr.success = false;
        } 

        return cr;
	}
	
	public static class CommandResult {
		String output;
		boolean success;
		
		public CommandResult(String output, boolean success) {
			this.output  = output;
			this.success = success;
		}
	}
}
	
