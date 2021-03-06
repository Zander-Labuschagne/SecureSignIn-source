package cryogen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application
{
	@Override
	public void start(Stage ssiWindow) throws Exception
	{
		ssiWindow.initStyle(StageStyle.DECORATED);
		ssiWindow.getIcons().add(new Image(getClass().getResourceAsStream("/cryogen/icon.png")));
		ssiWindow.setTitle("Secure Sign In v3.5");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SecureSignIn.fxml"));
		ssiWindow.setMinHeight(272);
		ssiWindow.setMinWidth(442);
		ssiWindow.setMaxHeight(272);
		ssiWindow.setMaxWidth(442);
		ssiWindow.setHeight(272);
		ssiWindow.setWidth(442);
		ssiWindow.setResizable(true);

		ssiWindow.setScene(createScene((Pane)loader.load()));
		SecureSignIn ssi = loader.<SecureSignIn>getController();
		ssi.initialize(ssiWindow);
		ssiWindow.show();
	}

	public Scene createScene(Pane layout)
	{
		Scene scene = new Scene(layout, Color.TRANSPARENT);
		return scene;
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
