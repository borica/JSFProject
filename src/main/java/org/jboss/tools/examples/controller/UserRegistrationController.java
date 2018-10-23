package org.jboss.tools.examples.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.jboss.tools.examples.enumeration.GenderEnum;
import org.jboss.tools.examples.model.Member;

@Named
@ViewScoped
public class UserRegistrationController implements Serializable {
	
	private static final long serialVersionUID = -7217377174411773918L;

	private List<GenderEnum> genders;
	private Member userRegistration;
	
	public String startActivity() {
		this.genders = GenderEnum.listGender();
		this.setUserRegistration(new Member());
		
		return "/pages/user_registration.xhtml";
	}
	
	@PostConstruct
    public void init() {
		this.genders = GenderEnum.listGender();
		this.setUserRegistration(new Member());
	}
	
	public void testarMember() {
		System.out.println("-------------- TESTE DE MEMBER --------------");
		System.out.println("Nome: " + userRegistration.getName());
		System.out.println("Email: " + userRegistration.getEmail());
		System.out.println("Gênero: " + userRegistration.getGender().getDescricao());
		System.out.println("Telefone: " + userRegistration.getPhoneNumber());
		System.out.println("--------------- FIM DO TESTE ----------------");
	}
	
	public List<GenderEnum> getGenders() {
		return genders;
	}

	public Member getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(Member userRegistration) {
		this.userRegistration = userRegistration;
	}

}
