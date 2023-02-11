package tictactoe

fun main() {
    var text = readln()
    var mutList: MutableList<Char> = mutableListOf()
    for (i in 0 until text.length) {
        mutList.add(i, text[i])

    }
    println("---------")
    println("| ${mutList[0]} ${mutList[1]} ${mutList[2]} |")
    println("| ${mutList[3]} ${mutList[4]} ${mutList[5]} |")
    println("| ${mutList[6]} ${mutList[7]} ${mutList[8]} |")
    println("---------")



    //checking amount of X's
    var x = 0
    for (i in mutList) {
        if (i == 'X') {
            x ++
        }
    }

    //checking amount of O's
    var o = 0
    for (i in mutList) {
        if (i == 'O') {
            o ++
        }
    }
    //checking _
    var blank = 0
    for (i in mutList) {
        if (i == '_') {
            blank ++
        }
    }

    // gorizontal & diagonal
    if  ((mutList[0] == 'X' && mutList[0].equals(mutList[1]) && mutList[0].equals(mutList[2])
        || mutList[1] == 'X' && mutList[1].equals(mutList[2]) && mutList[1].equals(mutList[3])
        || mutList[2] == 'X' && mutList[2].equals(mutList[3]) && mutList[2].equals(mutList[4])
        || mutList[3] == 'X' && mutList[3].equals(mutList[4]) && mutList[3].equals(mutList[5])
        || mutList[4] == 'X' && mutList[4].equals(mutList[5]) && mutList[4].equals(mutList[6])
        || mutList[5] == 'X' && mutList[5].equals(mutList[6]) && mutList[5].equals(mutList[7])
        || mutList[6] == 'X' && mutList[6].equals(mutList[7]) && mutList[6].equals(mutList[8])
                || mutList[0] == 'X' && mutList[0].equals(mutList[3]) && mutList[0].equals(mutList[6])
                || mutList[1] == 'X' && mutList[1].equals(mutList[4]) && mutList[1].equals(mutList[7])
            )
        &&
        (mutList[0] == 'O' && mutList[0].equals(mutList[2]) && mutList[0].equals(mutList[1])
        || mutList[1] == 'O' && mutList[1].equals(mutList[2]) && mutList[1].equals(mutList[3])
        || mutList[2] == 'O' && mutList[2].equals(mutList[3]) && mutList[2].equals(mutList[4])
        || mutList[3] == 'O' && mutList[3].equals(mutList[4]) && mutList[3].equals(mutList[5])
        || mutList[4] == 'O' && mutList[4].equals(mutList[5]) && mutList[4].equals(mutList[6])
        || mutList[5] == 'O' && mutList[5].equals(mutList[6]) && mutList[5].equals(mutList[7])
        || mutList[6] == 'O' && mutList[6].equals(mutList[7]) && mutList[6].equals(mutList[8])
                || mutList[0] == 'O' && mutList[0].equals(mutList[3]) && mutList[0].equals(mutList[6])
                || mutList[1] == 'O' && mutList[1].equals(mutList[4]) && mutList[1].equals(mutList[7]))
    ) {
        println("Impossible")
    }
         else if (mutList[0] == 'X' && mutList[0].equals(mutList[1]) && mutList[0].equals(mutList[2])
        || mutList[0].equals(mutList[3]) && mutList[0].equals(mutList[6])

        || mutList[3] == 'X' && mutList[3].equals(mutList[4]) && mutList[3].equals(mutList[5])
        || mutList[6] == 'X' && mutList[6].equals(mutList[7]) && mutList[6].equals(mutList[8])

        || mutList[1] == 'X' && mutList[1].equals(mutList[4]) && mutList[1].equals(mutList[7])
        || mutList[2] == 'X' && mutList[2].equals(mutList[5]) && mutList[2].equals(mutList[8])
        || mutList[0] == 'X' && mutList[0].equals(mutList[4]) && mutList[0].equals(mutList[8])
        || mutList[2] == 'X' && mutList[2].equals(mutList[4]) && mutList[2].equals(mutList[6])
        ) {
        println("X wins")


        //vertical & diagonal
    }  else if (mutList[0] == 'O' && mutList[0].equals(mutList[1]) && mutList[0].equals(mutList[2])
        || mutList[0].equals(mutList[3]) && mutList[0].equals(mutList[6])

        || mutList[3] == 'O' && mutList[3].equals(mutList[4]) && mutList[3].equals(mutList[5])
        || mutList[6] == 'O' && mutList[6].equals(mutList[7]) && mutList[6].equals(mutList[8])

        || mutList[1] == 'O' && mutList[1].equals(mutList[4]) && mutList[1].equals(mutList[7])
        || mutList[2] == 'O' && mutList[2].equals(mutList[5]) && mutList[2].equals(mutList[8])
        || mutList[0] == 'O' && mutList[0].equals(mutList[4]) && mutList[0].equals(mutList[8])
        || mutList[2] == 'O' && mutList[2].equals(mutList[4]) && mutList[2].equals(mutList[6])
        ) {
        println("O wins")

    }
    else if (blank == 0) {
        println("Draw")
    }
     else if (((x - o) > 1) || ((o - x) > 1)) {
        println("Impossible")

    } else {
        println("Game not finished")
    }
}

