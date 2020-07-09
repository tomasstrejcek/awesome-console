package com.github.tomasstrejcek.awesomeconsole.services

import com.intellij.openapi.project.Project
import com.github.tomasstrejcek.awesomeconsole.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
