var mcversion:String = "1.19.2"
var plugin_name:String = "waterlife"
var name:String = "rrayy"

plugins {
    java
}

repositories {
    mavenCentral()
    maven { 
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") // Spigot
        //url = uri("https://repo.papermc.io/repository/maven-public/")// Paper
    } 
}

dependencies {
    //JUnit Jupiter 사용.
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    compileOnly ("org.spigotmc:spigot-api:"+mcversion+"-R0.1-SNAPSHOT") //spigot-API
    //compileOnly("io.papermc.paper:paper-api:"+mcversion+"-R0.1-SNAPSHOT") // Paper-API
    //implementation("io.github.monun:invfx-api:2.1.0") //InvFX-API

}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}