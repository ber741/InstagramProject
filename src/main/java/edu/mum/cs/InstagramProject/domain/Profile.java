package edu.mum.cs.InstagramProject.domain;

public class Profile {
	
	private String name;
	private String userName;
	private String website;
	private String bio;
	private String emial;
	private String phoneNumber;
	private String gender;
	private String photoUrl;

	public Profile() {
		super();
	}

	public Profile(String name, String userName, String website, String bio, String emial, String phoneNumber,
			String gender, String photoUrl) {
		super();
		this.name = name;
		this.userName = userName;
		this.website = website;
		this.bio = bio;
		this.emial = emial;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.photoUrl = photoUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bio == null) ? 0 : bio.hashCode());
		result = prime * result + ((emial == null) ? 0 : emial.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((photoUrl == null) ? 0 : photoUrl.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Profile other = (Profile) obj;
		if (bio == null) {
			if (other.bio != null) {
				return false;
			}
		} else if (!bio.equals(other.bio)) {
			return false;
		}
		if (emial == null) {
			if (other.emial != null) {
				return false;
			}
		} else if (!emial.equals(other.emial)) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phoneNumber == null) {
			if (other.phoneNumber != null) {
				return false;
			}
		} else if (!phoneNumber.equals(other.phoneNumber)) {
			return false;
		}
		if (photoUrl == null) {
			if (other.photoUrl != null) {
				return false;
			}
		} else if (!photoUrl.equals(other.photoUrl)) {
			return false;
		}
		if (userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else if (!userName.equals(other.userName)) {
			return false;
		}
		if (website == null) {
			if (other.website != null) {
				return false;
			}
		} else if (!website.equals(other.website)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", userName=" + userName + ", website=" + website + ", bio=" + bio + ", emial="
				+ emial + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", photoUrl=" + photoUrl + "]";
	}

}
