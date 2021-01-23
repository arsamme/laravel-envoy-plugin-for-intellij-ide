package com.github.arsamme.laravelenvoypluginforintellijide.services

import com.github.arsamme.laravelenvoypluginforintellijide.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
