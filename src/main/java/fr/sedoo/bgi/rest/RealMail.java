package fr.sedoo.bgi.rest;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class RealMail implements Mail {
	
	public RealMail() {
		System.out.println("Je suis un mél réel");
	}

	@Override
	public void envoyer() {
		System.out.println("Je suis un mél réel qui envoie un message");
	}
	
}
