import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by noMoon on 2015-12-12.
 */
public class Converter {
    public static void main(String[] args) throws Exception{
        File outputFile = new File("Happy.out");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        int n=24;

        String filePrefix="q1_1_";
        String fileSuffix=".jpg";
        for (int i=1;i<=n;i+=4){
            bw.newLine();
            bw.write("\\newpage");
            bw.newLine();
            bw.write("\\begin{figure}[htbp]");
            bw.newLine();
            bw.write("\\begin{center}");
            bw.newLine();
            bw.write("\\begin{tabular}{c c}");

            String[] filenames=new String[4];
            for(int j=0;j<4;j++){
                filenames[j]=filePrefix+String.valueOf(i+j)+fileSuffix;
            }
            bw.newLine();
            bw.write("\\includegraphics[width=7cm]{"+filenames[0]+"}  &");
            bw.newLine();
            bw.write("\\includegraphics[width=7cm]{"+filenames[1]+"} \\\\");
            bw.newLine();
            bw.write("\\includegraphics[width=7cm]{"+filenames[2]+"}  &");
            bw.newLine();
            bw.write("\\includegraphics[width=7cm]{"+filenames[3]+"} \\\\");
            bw.newLine();
            bw.write("\\end{tabular}");
            bw.newLine();
            bw.write("\\end{center}");
            bw.newLine();
            bw.write("\\label{fig8}");
            bw.newLine();
            bw.write("\\end{figure}");
            bw.newLine();
            bw.write("\\clearpage");
        }
        bw.close();
    }
}









