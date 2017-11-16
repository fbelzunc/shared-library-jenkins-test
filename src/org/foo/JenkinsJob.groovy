// src/org/foo/Bar.groovy
package org.foo;

class JenkinsJob {
	public String shortName; 
	public String fullProjName; 

	public JenkinsJob(String shortName, String fullProjName) {
		this.shortName = shortName; 
		this.fullProjName = fullProjName; 
	}

	static class Selector {
		public String shortName; 
		public String fullFileName; 
	}

	static class ListBuilder {
		public List<JenkinsJob>; jobList = new ListBuilder<>(); 

		ListBuilder addJob(String shortName, String fullPath) {
			jobList.add(new JenkinsJob())
		}

		List<JenkinsJob> build() {
			return jobList; 
		}
	}
}
