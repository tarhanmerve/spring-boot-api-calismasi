package com.example.demo.Entities;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="file")
public class File {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Lob
	@Column(name="filedata",length=1000)
	private byte[] filedata;
	
	public File() {}
	
	@OneToOne(cascade= CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name="id", referencedColumnName="user_id")
	private User user;
	
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
    	
    	private Long id;
    	private String name;
    	private String type;
    	private byte[] filedata;
    	
    	 public Builder id(Long id) {
             this.id = id;
             return this;
         }
    	 
    	 public Builder name(String name) {
             this.name = name;
             return this;
         }
    	 
    	 public Builder type(String type) {
             this.type = type;
             return this;
         }
    	 
    	 public Builder filedata(byte[] filedata) {
             this.filedata = filedata;
             return this;
         }
    	 
         public File build() {
             File file = new File();
             file.id=this.id;            
             file.name = this.name;
             file.type=this.type;
             file.filedata=this.filedata;
             return file;
         }
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getFiledata() {
		return filedata;
	}

	public void setFiledata(byte[] filedata) {
		this.filedata = filedata;
	}

	public File(Long id, String name, String type, byte[] filedata) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.filedata = filedata;
	}
}
