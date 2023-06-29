/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

data class Question<T>(
	val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    override val progressText: String
    	get() = "${answered} of ${total} answered"
    
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
	}
    
    override fun printProgressBar(){
        repeat(Quiz.answered){print("▓")}
    repeat(Quiz.total - Quiz.answered){print("▒")}
    println()
    println(progressText)
    }
    
    fun printQuiz(){
        question1.let(){
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let(){
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let(){
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

//unneeded due to the ProgressPrintable being used instead of extensions.
//
//
//val Quiz.StudentProgress.progressText: String
//	get() = "${answered} of ${total} answered"
//	
//fun Quiz.StudentProgress.printProgressBar(){
//    repeat(Quiz.answered){print("▓")}
//    repeat(Quiz.total - Quiz.answered){print("▒")}
//    println()
//    println(Quiz.progressText)
//}

fun main() {
    Quiz().apply {
        printProgressBar()
    	printQuiz()
    }
}
