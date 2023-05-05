fun main(args: Array<String>) {
    test1(args)
    test2(args)
    test3(args)
    test4(args)
    test5(args)
}

fun test1(args: Array<String>) {
    // when을 식으로
    val test = args[0].toInt();
    println(
        when {
            test == 1 -> "하나"
            test == 2 -> "둘"
            else -> "없음"
        }
    )
}

fun test2(args: Array<String>) {
    // when을 문으로
    val test = args[0].toInt();
    when {
        test == 1 -> println("하나")
        test == 2 -> println("둘")
        else -> println("없음")
    }
}

fun test3(args: Array<String>) {
    // when을 문으로 + 대상 지정
    val test = args[0].toInt();
    when (test) {
        1 -> println("하나")
        2 -> println("둘")
        else -> println("없음")
    }
}

fun test4 (args: Array<String>){
    // 2중 for문 + 범위 정하기
    for (i in args[1].toInt()..4){ // 상수 말고도 값을 그냥 넣을 수 있다
        for(j in 1..4){
            println("$i $j ${i * j}")
        }
    }
}

fun test5 (args: Array<String>){
    val array = IntArray(args.size) {args[it].toInt()} // Array<String> 값을 이용해서 IntArray 초기화 하기
    println(array.contentToString());
    println(array.size);
    println(array.lastIndex);

    val array2 = arrayOf(args); // arrayOf로 바로 넣어서 초기화 해보기
    // val array2: Array<Array<String>> 의도한 것과 다르게 타입 추론
    println(array2.contentToString());

    val array3 = arrayOf(*args); // arrayOf와 *을 이용해서 초기화
    // val array3: Array<String> 의도한 것과 같게 타입 추론
    // * 연산자는 spread 연산자로, strArr의 모든 아이템을 개별적인 인수로 전달하는 역할
    println(array3.contentToString());

    val array4 = Array(10) {it + 1};
    println(array3.contentToString())
}
