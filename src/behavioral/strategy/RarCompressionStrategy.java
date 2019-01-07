package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy {

	public void compressFiles(ArrayList<File> files) {
		// using RAR approach
		System.out.println("using RAR approach");
	}
}
