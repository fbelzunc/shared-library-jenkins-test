def call(Closure body) {
  podTemplate(yaml: libraryResource('maven-pod.yaml')) {
    node(POD_LABEL) {
      body.call()
    }
  }
}
