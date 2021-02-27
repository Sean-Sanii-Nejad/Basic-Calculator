import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    final int FIRST_COLUMN = 2;
    final int SECOND_COLUMN = 86;
    final int THIRD_COLUMN = 170;
    final int FORTH_COLUMN = 254;

    final int ZERO_ROW = 310;
    final int FIRST_ROW = 258;
    final int SECOND_ROW = 206;
    final int THIRD_ROW = 154;
    final int FORTH_ROW = 102;

    final int HEIGHT = 50;
    final int WIDTH = 82;

    final String FONT_SIZE = "-fx-font-size: 20";

    int num1 = 0;
    int num2 = 0;
    String operator = "";
    String answer = "";
    boolean start = true;

    Button button0 = new Button("0");
    Button button1 = new Button("1");
    Button button2 = new Button("2");
    Button button3 = new Button("3");
    Button button4 = new Button("4");
    Button button5 = new Button("5");
    Button button6 = new Button("6");
    Button button7 = new Button("7");
    Button button8 = new Button("8");
    Button button9 = new Button("9");
    Button buttonAddition = new Button("+");
    Button buttonSubtraction = new Button("-");
    Button buttonMultiplication = new Button("x");
    Button buttonDivision = new Button("/");
    Button buttonEqual = new Button("=");
    Button buttonClear = new Button("C");
    Button buttonPower = new Button("x^2");

    TextField answerText = new TextField();

    Pane root = new Pane();
    Scene scene = new Scene(root, 338, 364);

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculator");

        answerText.setEditable(false);

        answerText.setPrefWidth(338);
        answerText.setPrefHeight(100);
        answerText.setStyle("-fx-font-size: 40");

        button0.setOnAction(this);
        button0.setLayoutX(SECOND_COLUMN);
        button0.setLayoutY(ZERO_ROW);
        button0.setPrefHeight(HEIGHT);
        button0.setPrefWidth(WIDTH);
        button0.setStyle(FONT_SIZE);

        button1.setOnAction(this);
        button1.setLayoutX(FIRST_COLUMN);
        button1.setLayoutY(FIRST_ROW);
        button1.setPrefHeight(HEIGHT);
        button1.setPrefWidth(WIDTH);
        button1.setStyle(FONT_SIZE);

        button2.setOnAction(this);
        button2.setLayoutX(SECOND_COLUMN);
        button2.setLayoutY(FIRST_ROW);
        button2.setPrefHeight(HEIGHT);
        button2.setPrefWidth(WIDTH);
        button2.setStyle(FONT_SIZE);

        button3.setOnAction(this);
        button3.setLayoutX(THIRD_COLUMN);
        button3.setLayoutY(FIRST_ROW);
        button3.setPrefHeight(HEIGHT);
        button3.setPrefWidth(WIDTH);
        button3.setStyle(FONT_SIZE);

        button4.setOnAction(this);
        button4.setLayoutX(FIRST_COLUMN);
        button4.setLayoutY(SECOND_ROW);
        button4.setPrefHeight(HEIGHT);
        button4.setPrefWidth(WIDTH);
        button4.setStyle(FONT_SIZE);

        button5.setOnAction(this);
        button5.setLayoutX(SECOND_COLUMN);
        button5.setLayoutY(SECOND_ROW);
        button5.setPrefHeight(HEIGHT);
        button5.setPrefWidth(WIDTH);
        button5.setStyle(FONT_SIZE);

        button6.setOnAction(this);
        button6.setLayoutX(THIRD_COLUMN);
        button6.setLayoutY(SECOND_ROW);
        button6.setPrefHeight(HEIGHT);
        button6.setPrefWidth(WIDTH);
        button6.setStyle(FONT_SIZE);

        button7.setOnAction(this);
        button7.setLayoutX(FIRST_COLUMN);
        button7.setLayoutY(THIRD_ROW);
        button7.setPrefHeight(HEIGHT);
        button7.setPrefWidth(WIDTH);
        button7.setStyle(FONT_SIZE);

        button8.setOnAction(this);
        button8.setLayoutX(SECOND_COLUMN);
        button8.setLayoutY(THIRD_ROW);
        button8.setPrefHeight(HEIGHT);
        button8.setPrefWidth(WIDTH);
        button8.setStyle(FONT_SIZE);

        button9.setOnAction(this);
        button9.setLayoutX(THIRD_COLUMN);
        button9.setLayoutY(THIRD_ROW);
        button9.setPrefHeight(HEIGHT);
        button9.setPrefWidth(WIDTH);
        button9.setStyle(FONT_SIZE);

        buttonAddition.setOnAction(this);
        buttonAddition.setLayoutX(FIRST_COLUMN);
        buttonAddition.setLayoutY(FORTH_ROW);
        buttonAddition.setPrefHeight(HEIGHT);
        buttonAddition.setPrefWidth(WIDTH);
        buttonAddition.setStyle(FONT_SIZE);

        buttonSubtraction.setOnAction(this);
        buttonSubtraction.setLayoutX(SECOND_COLUMN);
        buttonSubtraction.setLayoutY(FORTH_ROW);
        buttonSubtraction.setPrefHeight(HEIGHT);
        buttonSubtraction.setPrefWidth(WIDTH);
        buttonSubtraction.setStyle(FONT_SIZE);

        buttonMultiplication.setOnAction(this);
        buttonMultiplication.setLayoutX(THIRD_COLUMN);
        buttonMultiplication.setLayoutY(FORTH_ROW);
        buttonMultiplication.setPrefHeight(HEIGHT);
        buttonMultiplication.setPrefWidth(WIDTH);
        buttonMultiplication.setStyle(FONT_SIZE);

        buttonDivision.setOnAction(this);
        buttonDivision.setLayoutX(FORTH_COLUMN);
        buttonDivision.setLayoutY(FORTH_ROW);
        buttonDivision.setPrefHeight(HEIGHT);
        buttonDivision.setPrefWidth(WIDTH);
        buttonDivision.setStyle(FONT_SIZE);

        buttonEqual.setOnAction(this);
        buttonEqual.setLayoutX(FORTH_COLUMN);
        buttonEqual.setLayoutY(FIRST_ROW);
        buttonEqual.setPrefHeight(100);
        buttonEqual.setPrefWidth(WIDTH);
        buttonEqual.setStyle(FONT_SIZE);

        buttonClear.setOnAction(this);
        buttonClear.setLayoutX(FORTH_COLUMN);
        buttonClear.setLayoutY(SECOND_ROW);
        buttonClear.setPrefHeight(HEIGHT);
        buttonClear.setPrefWidth(WIDTH);
        buttonClear.setStyle(FONT_SIZE);

        buttonPower.setOnAction(this);
        buttonPower.setLayoutX(FORTH_COLUMN);
        buttonPower.setLayoutY(THIRD_ROW);
        buttonPower.setPrefHeight(HEIGHT);
        buttonPower.setPrefWidth(WIDTH);
        buttonPower.setStyle(FONT_SIZE);

        root.getChildren().addAll(button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
                buttonAddition, buttonSubtraction, buttonMultiplication, buttonDivision, buttonEqual, buttonClear, buttonPower,
                answerText);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public int calculate(int number1, int number2, String operator){
        switch(operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "x":
                return number1 * number2;
            case "/":
                if(number2 ==0){
                    return 0;
                }
                return number1 / number2;
        }
        return 0;
    }

    public int calculate(int number1, String operator){
        switch(operator) {
            case "x^2":
                return number1 * number1;
        }
        return 0;
    }

    @Override
    public void handle(ActionEvent event){
        if(start){
            answerText.clear();
            operator = "";
            start = false;
        }
        if(event.getSource()==buttonEqual){
            num2 = Integer.parseInt((answerText.getText()));
            answerText.setText(Integer.toString(calculate(num1, num2, operator)));
            answer = answerText.getText();
            start = true;
        }
        if(event.getSource()==buttonClear){
            answerText.clear();
        }
        if(event.getSource()==buttonAddition){
            if(answerText.getText().isEmpty()) {
                answerText.setText(answer);
            }
            num1 = Integer.parseInt(answerText.getText());
            operator = "+";
            answerText.clear();
        }
        if(event.getSource()==buttonSubtraction){
            if(answerText.getText().isEmpty()) {
                answerText.setText(answer);
            }
            num1 = Integer.parseInt(answerText.getText());
            operator = "-";
            answerText.clear();
        }
        if(event.getSource()==buttonMultiplication){
            if(answerText.getText().isEmpty()) {
                answerText.setText(answer);
            }
            num1 = Integer.parseInt(answerText.getText());
            operator = "x";
            answerText.clear();
        }
        if(event.getSource()==buttonDivision){
            if(answerText.getText().isEmpty()) {
                answerText.setText(answer);
            }
            num1 = Integer.parseInt(answerText.getText());
            operator = "/";
            answerText.clear();
        }

        if(event.getSource()==buttonPower){
            if(answerText.getText().isEmpty()) {
                answerText.setText(answer);
            }
            num1 = Integer.parseInt(answerText.getText());
            operator = "x^2";
            answerText.setText(Integer.toString(calculate(num1, operator)));
        }
        if(event.getSource()==button0){
            String value = "0";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button1){
            String value = "1";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button2){
            String value = "2";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button3){
            String value = "3";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button4){
            String value = "4";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button5){
            String value = "5";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button6){
            String value = "6";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button7){
            String value = "7";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button8){
            String value = "8";
            answerText.setText(answerText.getText() + value);
        }
        if(event.getSource()==button9){
            String value = "9";
            answerText.setText(answerText.getText() + value);
        }
    }
}
