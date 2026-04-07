package Exercise2

data class WebResponse(val statusCode: Int, val statusMessage: String, val body: String?)

fun main() { // part 1
    val webResponse = WebResponse(200, "success", "this is a success response")
    val webResponse2 = WebResponse(404, "not found", "this is a not found response")

    println(webResponse)
    println(webResponse2)

    println(describeStatus(545))

    println(routeRequest("/home", "John"))
    println(routeRequest("/grades", null))
    println(routeRequest("/other", "John"))
}

fun describeStatus(code: Int): String {  // part 2
    val result = when(code) {
        in 200..299 -> "Success: The request was fulfilled."
        in 400..499 -> "Client Error. Check your URL or your parameters."
        in 500..599 -> "Server Error. The Lehman Sever is having trouble."
        else -> "Unknown status code."
    }
    return result
}

fun routeRequest(path: String, user: String?): String {  // part 3
    val result = when(path) {
        "/home" -> "Welcome to the Lehman Homepage, ${user ?: "Guest"}!"
        "/grades" -> user?.let { "Loading grades for $it..." } ?: "Error: Unauthorized access to grades."
        else -> "404: Path $path not found."
    }
    return result
}