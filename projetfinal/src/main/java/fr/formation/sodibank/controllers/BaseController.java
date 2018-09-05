package fr.formation.sodibank.controllers;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import fr.formation.AppLanguage;
import fr.formation.Principal;
import fr.formation.sodibank.entities.User;
import fr.formation.sodibank.entities.User.Role;

public abstract class BaseController {

	protected BaseController() {
		//
	}
	
	
	protected static Role getRole() {
		return getUser().getRole();
	}
	
	protected static User getUser() {
		return getPrincipal().getUser();
	}
	
	protected static Principal getPrincipal() {
		return (Principal) getAuthentication().getPrincipal();
	}
	
	protected static Collection<? extends GrantedAuthority> getAuthorities() {
		return getAuthentication().getAuthorities();
	}
	
		
	protected static Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
	
	protected static Locale getLocale() {
		
		//Classe de Spring qui nous dit dans quelle Locale je suis (langues)
		return LocaleContextHolder.getLocale();
	}

	protected static AppLanguage getAppLanguage() {
		return AppLanguage.valueOfLocale(getLocale());
	}

	protected static void rejectIfTrue(boolean condition, String field, String errorCode, BindingResult result) {
		if (condition) {
			result.rejectValue(field, errorCode);
		}
	}

	protected static void rejectIfFalse(boolean condition, String field, String errorCode, BindingResult result) {
		if (!condition) {
			result.rejectValue(field, errorCode);
		}
	}

	//A chaque fois que je veux fais une requette sur ce controller, tu rentres ici.
	//Binder : classe de Spring
	@InitBinder 
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		AppLanguage lang = getAppLanguage();
		String datePattern = lang.getDatePattern();
		binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {

			@Override
			public void setAsText(String text) {
				if (null != text && !text.isEmpty()) {
					setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern(datePattern)));
				}
			}

			@Override
			public String getAsText() {
				LocalDate value = (LocalDate) getValue();
				if (null == value) {
					return null;
				}
				//Pattern JAVA transforme une date en String
				return DateTimeFormatter.ofPattern(datePattern).format(value);
			}
		});
	}
}
