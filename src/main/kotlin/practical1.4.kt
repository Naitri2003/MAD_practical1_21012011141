fun main(){
    println("Enter number")
    val num= readLine()?.toIntOrNull()
    if (num!=null){
        if (num%2==0){
            println("$num is even number")
        }
        else{
            println("$num is odd number")
        }
    }
    else{
        println("Please enter valid number!")
    }
}