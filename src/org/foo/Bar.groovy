class JenkinsJob {
	public String shortName; 
	public String fullProjName; 
	public List <Selector> selectors; 

	public JenkinsJob(String shortName, String fullProjName, List<Selector> selectors) {
		this.shortName = shortName; 
		this.fullProjName = fullProjName; 
		this.selectors = selectors; 
	}

	static class Selector {
		public String shortName; 
		public String fullFileName; 
	}

	static class ListBuilder {
		private List<JenkinsJob>; jobList = new ListBuilder<>(); 

		ListBuilder addJob(String shortName, String fullPath, List<Selector> selectors) {
			jobList.add(new JenkinsJob())
		}

		List<JenkinsJob> build() {
			return jobList; 
		}
	}
}
