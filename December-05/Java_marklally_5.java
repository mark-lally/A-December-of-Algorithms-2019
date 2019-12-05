package dec5_convert_csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java_marklally_5 {
	
	static File file = null;
	static BufferedReader br = null;
	static BufferedWriter bw = null;
	
	/**
	 * @param csvFilename -> A csv file that will be converted to a HTML table
	 * 
	 * Will create a html file in root directory.
	 */
	static void convertCSVtoHTML(String csvFilename) {
		
		String currentLine="", separator =",";

		String header = "<html>\n"
				+ "\t<body>\n"
				+ "\t\t<table>\n";
		
		StringBuilder toAppend = new StringBuilder(header);
		
		String footer = "\t\t</table>\n"
						+ "\t</body>\n"
						+ "</html>";
		int lineNum = 0;
		
		try {
			file = new File(csvFilename);
			br = new BufferedReader(new FileReader(file));
			bw = new BufferedWriter(new FileWriter("output.html"));
			
			while( (currentLine = br.readLine()) != null) {
				String [] values = currentLine.split(separator);
				lineNum ++;
				toAppend.append("\t\t\t<tr>");
				for(String word:values) {
					if(lineNum == 1) {
						toAppend.append("<th>"+word+"</th>");
					} else {
						toAppend.append("<td>"+word+"</td>");
					}
				}
				toAppend.append("</tr>\n");
			}
		bw.write(toAppend.append(footer).toString());
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					bw.close();
				}catch(IOException exc){
					exc.printStackTrace();
				}
			}
		}	
	}	
}
