package com.github.kcrebound.smenafluttersnippets.services

import com.github.kcrebound.smenafluttersnippets.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
