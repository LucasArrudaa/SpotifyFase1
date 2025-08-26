package exceptions;

public class PlaylistVazia extends RuntimeException {
  public PlaylistVazia(String message) {
    super(message);
  }
}
