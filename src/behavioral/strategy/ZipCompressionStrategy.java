package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {

	public void compressFiles(ArrayList<File> files) {
		// using ZIP approach
		System.out.println("using ZIP approach");
	}
}
