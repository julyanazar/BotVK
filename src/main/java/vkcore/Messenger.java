package vkcore;

import com.vk.api.sdk.objects.messages.Message;
import commands.logic.Commander;

/*
 * класс для многопоточной обработки
 * */
public class Messenger implements Runnable {

	private Message message;

	public Messenger(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		Commander.execute(message);
	}
}