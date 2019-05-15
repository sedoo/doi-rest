package fr.sedoo.bgi.rest;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!prod")
public class TestMail implements Mail {
	
	public TestMail() {
		System.out.println("Je suis un mél de test");
	}

	@Override
	public void envoyer() {
		System.out.println("Je suis un mél de test qui envoie un message");
	}
	
}
