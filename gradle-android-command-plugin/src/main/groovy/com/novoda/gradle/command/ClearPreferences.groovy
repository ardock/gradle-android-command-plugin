package com.novoda.gradle.command

import org.gradle.api.tasks.TaskAction

class ClearPreferences extends AdbTask {

    @TaskAction
    void exec() {
        runCommand(['shell', 'pm', 'clear', packageName])
    }
}
