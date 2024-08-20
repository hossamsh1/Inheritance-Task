open class Employee (
    val name:String
    ,val id:Int
    ){
    open val role:String?="Employee"
   open fun work():String{
     return "$name - ID : $id , who is an $role working"
    }

    open fun report():String{
        return "$name - ID:$id  is reporting to the manager"
    }


}


class Manager(name: String,id: Int,val departmint:String): Employee(name, id) {
    override val role: String="Manager"

    override fun work(): String {
        return "$name - ID:$id , who is a $role , is managing the $departmint"
    }

    override fun report(): String {
        return "$name  - ID:$id is reporting to the company board"
    }
}

class Developer(name: String,id: Int,val programmingLanguage:String): Employee(name,id) {
    override val role: String="Developer"

    override fun work(): String {
        return "$name - ID$id , who is $role , is coding in $programmingLanguage "
    }

    override fun report(): String {
        return "$name - ID$id is reporting to their manager "
    }

}