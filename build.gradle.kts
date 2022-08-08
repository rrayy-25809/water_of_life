var mcversion:String = "1.19.2"
var plugin_name:String = "waterlife"
var name:String = "rrayy"

plugins {
    id ("java")
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    //JUnit Jupiter 사용.
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    //spigot api 불러오기.
    compileOnly ("org.spigotmc:spigot-api:"+mcversion+"-R0.1-SNAPSHOT")
    //InvFX 불러오기
    //implementation("io.github.monun:invfx-api:2.1.0")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}