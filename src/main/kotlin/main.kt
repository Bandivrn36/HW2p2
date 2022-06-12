fun main() {
    val likes: Int = 231105557
    if(likes < 100) {
        if((likes == 11) || ((likes % 10) != 1)) {
            println("$likes людям")
        } else {
            println("$likes человеку")
        }
    } else {
        if (((likes % 100) == 11) || ((likes % 10) != 1)){
            println("$likes людям")
        } else {
            println("$likes человеку")
        }
    }
}
