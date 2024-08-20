import org.intellij.lang.annotations.Language

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


addManager("hossam",1,"Android")
addManager("ahmed",2,"IOS")
addManager("Mohamed",3,"Marketing")

addDeveloper("mostafa",1,"Kotlin")
addDeveloper("mohamed",2,"Swift")
addDeveloper("mosa",4,"dart")
}



fun addManager(name:String,id:Int,departmint:String){
    val manager:Employee= Manager(name,id,departmint)
    println(manager.work())
    println("${manager.report()}\n")

}

fun addDeveloper(name: String,id: Int,programingLanguage: String) {
    val developer: Employee = Developer(name, id, programingLanguage)
    println(developer.work())
    println("${developer.report()}\n")
}