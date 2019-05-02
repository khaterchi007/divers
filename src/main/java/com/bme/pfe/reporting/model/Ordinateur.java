package com.bme.pfe.reporting.model;

public class Ordinateur {
	public String adr_ip;
	public String adr_mac;
	public String etat;
	public String fabriquant;
	public String freq_proc;
	public String group_travail;
	public String modele;
	public String num_serie;
	public String os;

	public String processeur;
	public String Ref_ord;
	public String type;

	// const par def
	public Ordinateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ordinateur(final String adr_ip, final String adr_mac, final String etat) {
		super();
		this.adr_ip = adr_ip;
		this.adr_mac = adr_mac;
		this.etat = etat;
	}

	public String getAdr_ip() {
		return adr_ip;
	}

	public String getAdr_mac() {
		return adr_mac;
	}

	public String getEtat() {
		return etat;
	}

	public String getFabriquant() {
		return fabriquant;
	}

	public String getFreq_proc() {
		return freq_proc;
	}

	public String getGroup_travail() {
		return group_travail;
	}

	public String getModele() {
		return modele;
	}

	public String getNum_serie() {
		return num_serie;
	}

	public String getOs() {
		return os;
	}

	public String getProcesseur() {
		return processeur;
	}

	public String getRef_ord() {
		return Ref_ord;
	}

	public String getType() {
		return type;
	}

	public void setAdr_ip(final String adr_ip) {
		this.adr_ip = adr_ip;
	}

	public void setAdr_mac(final String adr_mac) {
		this.adr_mac = adr_mac;
	}

	public void setEtat(final String etat) {
		this.etat = etat;
	}

	public void setFabriquant(final String fabriquant) {
		this.fabriquant = fabriquant;
	}

	public void setFreq_proc(final String freq_proc) {
		this.freq_proc = freq_proc;
	}

	public void setGroup_travail(final String group_travail) {
		this.group_travail = group_travail;
	}

	public void setModele(final String modele) {
		this.modele = modele;
	}

	public void setNum_serie(final String num_serie) {
		this.num_serie = num_serie;
	}

	public void setOs(final String os) {
		this.os = os;
	}

	public void setProcesseur(final String processeur) {
		this.processeur = processeur;
	}

	public void setRef_ord(final String ref_ord) {
		Ref_ord = ref_ord;
	}

	public void setType(final String type) {
		this.type = type;
	}

}
