package com.ttnd.forager.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Greeting")
public class Greeting {
	
	@Id
    private long id;
	
	@Column
    private String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
}