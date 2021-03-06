package com.tikal.hudson.plugins.notification.model;

import com.tikal.hudson.plugins.notification.Phase;

import java.util.Map;

public class BuildState {

	private String fullUrl;

	private int number;

	private Phase phase;

	private String status;

	private String url;
	
	private Map<String, String> parameters;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Phase getPhase() {
		return phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFullUrl() {
		return fullUrl;
	}

	public void setFullUrl(String fullUrl) {
		this.fullUrl = fullUrl;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> params) {
		this.parameters = params;
	}
}
