package swp.portal.beans;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.vaadin.cdi.annotation.VaadinSessionScoped;

import swp.entity.GeraetTO;

@VaadinSessionScoped
public class UserMB {

	private boolean isAdmin = false;
	private boolean isLoggedIn = false;
	private String username;
	private String name;
	private String surname;
	private String matrikelNr;
	private String email;
	private ArrayList<Integer> warenkorb = new ArrayList<>();

	@Inject
	GeraetMB geraetMB;

	public List<GeraetTO> getWarenkorb() {
		ArrayList<GeraetTO> list = new ArrayList<>();
		for (int i : warenkorb) {
			GeraetTO gTO = geraetMB.getGeraet(i);
			if (gTO != null)
				list.add(gTO);
		}
		return list;
	}

	public void addToWarenkorb(int id) {
		warenkorb.add(id);
	}

	public void removeFromWarenkorb(Integer id) {
		warenkorb.remove(id);
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
		if (!isLoggedIn)
			this.isAdmin = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(String matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void emptyWarenkorb() {
		this.warenkorb.clear();

	}

	public int countWarenkorb() {
		return warenkorb.size();
	}

}
