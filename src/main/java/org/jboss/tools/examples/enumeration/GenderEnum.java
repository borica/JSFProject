package org.jboss.tools.examples.enumeration;
import java.util.ArrayList;
import java.util.List;

public enum GenderEnum {
	
	FEMALE(1, "Female", "Feminino"),
	MALE(2, "Male", "Masculino");
	
	private Integer id;
	private String description;
	private String descricao;
	
	GenderEnum(Integer id, String description, String descricao){
		this.setId(id);
		this.setDescription(description);
		this.setDescricao(descricao);
	}
	
	public static List<GenderEnum> listGender(){
		List<GenderEnum> allGenders = new ArrayList<GenderEnum>();
		for (GenderEnum gender : values()) {
			allGenders.add(gender);
		}
		return allGenders;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
