package for_;

public class mytest {
	private void calculate() {
		float won = Float.parseFloat(operand1.getText());
		String result = '';
		String operator = opSelection.getSelectedItm().toString();
		
		if (operator.equals("달러")) {
			result = String.format("%.6f", won / USD_RATE);
		}
		else if (operator.equals("엔화")) {
			result = String.format("%.6f", won / JPY_RATE);
		}
		else if (operator.equals("위안")) {
			result = String.format("%.6f", won / CNY_RATE);
		}
		txtResult.setText(result);
	}

}
