fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem[0])
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
    val newSolarSystem = solarSystem + arrayOf("Pluto")
    println(newSolarSystem[8])
}
