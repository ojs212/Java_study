package chap14;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * Writer : 문자형 출력스트림 / 2바이트(1char) 단위 출력 
 */
public class WriterEx1 {

	public static void main(String[] args) throws IOException {
		// OutputStreamWriter : 문자형출력스트림(Writer) <- 바이트형출력스트림(OutputStream)
		// PrintStream System.out
		// OutputStream > PrintStream 하위클래스 : PrintStream is a OutputStream
		Writer out = new OutputStreamWriter(System.out);
		out.write('1'); out.write('2'); out.write('3');
		out.write('a'); out.write('b'); out.write('c');
		out.write('가'); out.write('나'); out.write('다');
		out.flush();
	}

}
