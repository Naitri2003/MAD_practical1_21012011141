import java.util.Scanner

fun main(){
    val reader=Scanner(System.`in`)
    print("Enter number:")
    val num= reader.nextInt()
    if (num%2==0){
        println("$num is even number")
    }
    else{
        println("$num is odd number")
    }
}