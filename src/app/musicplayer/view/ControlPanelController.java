package app.musicplayer.view;

import java.net.URL;
import java.util.ResourceBundle;

import app.musicplayer.MusicPlayer;
import app.musicplayer.util.SubView;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**
 * 
 * @version 1.0
 *
 */
public class ControlPanelController implements Initializable {
	
	@FXML private Pane playButton;
	@FXML private Pane playlistButton;
	@FXML private Pane infoButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	
	@FXML
	private void playSong(Event e) {
		
		SubView controller = MusicPlayer.getMainController().getSubViewController();
		controller.play();
		e.consume();
	}
	
	@FXML
	private void addToPlaylist(Event e) {
		e.consume();
	}
	
	@FXML
	private void showInfo(Event e) {
		e.consume();
	}
}