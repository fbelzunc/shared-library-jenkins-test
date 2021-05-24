package org.foo;

@Grab(group='org.codehaus.groovy', module='groovy-yaml', version='3.0.7')

import groovy.yaml.YamlSlurper

class YamlUtil {
  static def parseText(String text) {
    def slurper = new YamlSlurper();
    return slurper.parseText(text);
  }
}
