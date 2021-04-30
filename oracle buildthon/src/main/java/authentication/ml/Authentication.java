package authentication.ml;
import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;
public class Authentication {
	public static void main(String[]args)
	{
		try {
			Table data = Table.read().csv("C:\\Users\\Welcome\\OneDrive\\Desktop\\oracle buildthon\\src\\main\\java\\authentication\\ml\\data_banknote_authentication.csv");
     		System.out.println(data.summary());
			Layout l1 = Layout.builder().title("Distribution of entropy").build();
		    HistogramTrace trace = HistogramTrace.builder(data.nCol("Entropy")).build();
		    Plot.show(new Figure(l1,trace));
		    
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
