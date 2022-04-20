import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
 
public class Main {
	public static void main(String[] args) {
		// Se inicializa el contexto de la API
		ApiContextInitializer.init();
 
		// Se crea un nuevo Bot API
		final TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
 
		try {
			// Se registra el bot
			telegramBotsApi.registerBot(new EchoBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}