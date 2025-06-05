package org.lakdogan.u18.logic;

public class CalculatorService {
    private String current = "";
    private String previous = "";
    private String operator = "";

    public String processInput(String input) {
        if (input.matches("[0-9.,]")) {
            current += input;
            return current;
        }

        if (input.matches("[÷×\\-+]")) {
            operator = input;
            previous = current;
            current = "";
            return operator;
        }

        if (input.equals("=")) {
            try {
                double a = Double.parseDouble(previous.replace(",", "."));
                double b = Double.parseDouble(current.replace(",", "."));
                double result = switch (operator) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "×" -> a * b;
                    case "÷" -> b != 0 ? a / b : 0;
                    default -> 0;
                };
                current = String.valueOf(result).replace(".", ",");
                return current;
            } catch (Exception e) {
                current = "";
                previous = "";
                operator = "";
                return "Fehler";
            }
        }

        if (input.equals("AC")) {
            current = "";
            previous = "";
            operator = "";
            return "0";
        }

        if (input.equals("+/-")) {
            if (!current.isEmpty() && !current.equals("0")) {
                if (current.startsWith("-"))
                    current = current.substring(1);
                else
                    current = "-" + current;
            }
            return current;
        }
        if (input.equals("%")) {
            try {
                double value = Double.parseDouble(current.replace(",", "."));
                value = value / 100.0;
                current = String.valueOf(value).replace(".", ",");
                return current;
            } catch (Exception e) {
                current = "";
                return "Fehler";
            }
        }

        return current.isEmpty() ? "0" : current;
    }
}
