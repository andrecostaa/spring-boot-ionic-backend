package com.andre.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.andre.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
