def call(Closure body) {
  podTemplate(yaml: libraryResource('podTemplates/maven-pod.yaml')) {
    node(POD_LABEL) {
      body.call()
    }
  }
}
