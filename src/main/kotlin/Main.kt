import kotlin.random.Random

fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    //1. Khai báo biến
    //1.1. Muteable: Khai báo biến và biến có thể thay đổi giá trị của biến
//    // Từ khóa khai báo biến là var
//    var name = " Phạm tấn phát"
//    name = "Phạm tấn phát 1"
//    print(name)

    //1.2. Immutable: Khai báo biến và biến không  thể thay đổi giá trị
    // từ khóa khai báo val
//    // constant => Hằng số
//    val pi =3.14
//    val address ="199 lý thường kiệt"

//    //2. Kiểu dữ liệu
//    // Kiểu String: Chuỗi
//    var text: String ="Hello"
//    // kiểu số nguyên: Int, Long
//    var age: Int =29
//    // Kiểu số thực: Float, Double
//    var weight: Float = 74.9f

//    var query = "SELECT * FROM tableName WHERE Id =1 ORDER BY DESC"
//    var query1 ="""
//        SELECT *FROM TableName
//        WHERE Id =1
//        ORDER BY DESC
//    """.trimIndent()
//    print(query1)


    //3. Toán tử

    // Dấu + mà xu lý với chuỗi thì mang tính chất là phép nối chuỗi
//    var number1= 5
//    var number2 = number1++
//    var number3 = ++number1
//    print("number2: +$number2" )
//    print("number3: +$number3")

//    number1 =number1+1
//    number1 +=1
//    ++number1
//    number1++

    //4. câu điều kiện => đưa ra các trường hợp để có thể giải quyết
    // so sánh 2 số nếu
    // a>b => in ra la 1
    // a<b => in ra là -1
    // a==b => in ra la 0
//    var a=5
//    var b=6
//    if(a>b)
//    { print("1")}
//    else if (a<b)
//    {print("-1")}
//    else {
//        print("0")
//    }

//    var weight = 77f
//    var height = 1.78f
//
//    var bmi = weight/(height*height)
//
//    if(bmi<18.5){
//        println(" gầy")
//    } else if(bmi<24.9){
//        print("Bình thường")
//
//    }else if (bmi<29.9){
//        print("Hơi béo")
//    }else if (bmi<29.9){
//        print("Hơi béo")
//    }else if (bmi<29.9){
//        print("Béo phì cấp độ 1")
//    }else if (bmi<39.9){
//        print("Béo phì cấp độ 2")
//    } else{
//        print ("Béo phì cấp độ 3")
//    }

//    var numberA =5
//    var numberB =10
//    var message: String = if (numberA > numberB)
//    {
//        "A lon hon B"
//    } else {
//        "A nho hon B"
//    }
//    print(message)
    // Toán tử && và ||
//    var account = "v"
//    var password = "v"
//    // Nếu như tài khoản và mật khẩu có giá trị thì mới cho đăng nhập
//    if (account.length > 0 && password.length > 0)
//    {
//        println(" Xử lý đăng nhập")
//    } else {
//        print(" chưa truyền đủ thông tin để xử lý")
//    }
//
//
//    if (account.length == 0 || password.length == 0)
//    {
//        print(" chưa truyền đủ thông tin để xử lý")
//    } else {
//        print(" xu lý đăng nhập")
//    }

    //4. Câu điều kiện when
//    var month =6
//    var message = when (month){
//        in 1..3 -> "Quý 1"
//        4, 5, 6 -> "Quý 2"
//        in 7 ..9 -> "Quý 3"
//        in 10 ..12-> "Quý 4"
//        else -> "không thuộc quý nào"
//    }
//    print(message)

    //5. Mảng
//    var arrNumbers = mutableListOf<Int>(1, 3, 5, 7, 9)
//    // thêm dữ liệu vào mảng
//    arrNumbers.add(11);
//    // xóa phần tử trong mảng
//    arrNumbers.removeAt(0)
//
//    // Sửa giá trị
//    arrNumbers[0] = 11
//
//    // In giá trị phần tử đầu tiên
//    println(" giá trị phần tử đầu tiên: ${arrNumbers[0]}")
//
//
//
//    // in giá trị phần tử cuối cùng
//    println( " giá trị phần tử cuối cùng: ${arrNumbers[arrNumbers.size - 1]}")

    //6. Vòng lặp for
//    // in : trong khoảng
//     for (item in  1 .. 100){
//         // kiểm tra giá trị chia hết cho 2 và 5
//         if (item % 2 == 0 && item % 5 ==0)
//         {
//             println(item)
//             break
//         }
//    }
//    println(" tiếp tục")


//    for ((index, item) in (1..10 step 2).withIndex() ){
//        println("Index: $index, Item: $item");
//    }

//    // until : bé hơn chứ không bằng
//    for (item in 1 until  10 ){
//        println(item)
//    }
//
//    // down to: đếm ngược
//    for (item in 10 downTo 1){
//        println(item);
//    }

//    var arr1 = mutableListOf(5, 4, 3, 2, 1)
//    var arr2 = mutableListOf(10, 20, 30, 40, 50)
    //50
    //40
    //30
    //20
    //10
    //100
    //80
    //..
    //50
//    for (elementArr1 in arr1)
//        {
//        for (elementArr2 in arr2) {
//            var result:Int = elementArr1 * elementArr2
//            println("$result")
//        }
//    }
    //7. while
//    var  count = Random.nextInt(10)
//    while (count % 2 ==0)
//    {
//        println("$count")
//        count = Random.nextInt(100)
//    }

    //8. phương thức
    //Unit: không giá trị trả về
    fun  showMessage ( message : String) : Unit{
        println(message)
    }

    showMessage(" Đỗ Trọng Toàn")
    var cat = Animal("Kitty",1.2)

    println("Name: ${cat.name} , weight: ${cat.weight.toString()} ")

    var cat2 = Animal("Doremon", 1.5)

    println("Name: ${cat2.name} , weight: ${cat2.weight.toString()} ")


}