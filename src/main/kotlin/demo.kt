import com.sun.org.apache.xml.internal.security.Init

//class student(var enrollment:Int, var name:String) {
//    constructor():this(141,"Naitri"){
//        println("Enrollment number :$enrollment")
//}
////init {
////    println("Enrollment number :$enrollment and Name :$name")
////}
//
//    }
abstract class Student(var enrollment:Long,var name:String){
    constructor():this(141,"Naitri"){
        println("Enrollment number is : $enrollment")
    }
}

fun main(){
//    var s=Student(141,"Nitri")
    //var s1=student(141,"Naitri");
}