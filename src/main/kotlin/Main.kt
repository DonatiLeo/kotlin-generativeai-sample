package unica.ds4h.miage.donati

import dev.shreyaspatil.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.runBlocking
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() : Unit = runBlocking {
    val apiKey = System.getenv("GEMINI_API_KEY")

    val monModele = GenerativeModel(
        modelName = "gemini-2.5-flash",
        apiKey = apiKey
    )

    val prompt = "raconte moi une histoire de fantômes"
    val response = monModele.generateContent(prompt)
    println(response.text)

}