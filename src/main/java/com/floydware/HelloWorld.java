package com.floydware;

import jargs.gnu.CmdLineParser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String args[]) throws Exception{

		CmdLineParser parser = new CmdLineParser();

		CmdLineParser.Option verboseOpt = parser.addBooleanOption('v', "verbose");

		try {
			parser.parse(args);
			boolean verbose = parser.getOptionValue(verboseOpt) != null;
			if (verbose)
				Logger.getLogger("").setLevel(Level.ALL);
			else
				Logger.getLogger("").setLevel(Level.WARNING);

		} catch (CmdLineParser.OptionException e) {
			usage();
			System.exit(1);
		} finally {
		}

		helloWorld();
	}

	private static void usage() {
		System.out.println("\nUsage: java -jar HelloWorld.jar [options]\n\n"
				+ "Global Options\n"
				+ "  -h, --help                Displays this information\n"
				+ "  -v, --verbose             Display informational messages and warnings\n\n");
	}

	private static void helloWorld() {
		System.out.println("Did you ever play tic-tac-toe?");
	}
}
