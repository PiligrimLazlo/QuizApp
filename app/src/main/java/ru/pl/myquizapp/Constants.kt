package ru.pl.myquizapp

object Constants {

    const val USER_NAME: String = "userName"
    const val TOTAL_QUESTIONS: String = "totalQuestions"
    const val CORRECT_ANSWERS: String = "correctAnswers"


    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_ar,
            "Аргентина", "Автралия",
            "Армения", "Венесуэла",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_fj,
            "Замбия", "Кот-д’Ивуар",
            "ЮАР", "Фиджи",
            4
        )
        questionList.add(que2)

        val que3 = Question(
            3, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_au,
            "Аргентина", "Австрия",
            "Автралия", "Новая Зеландия",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            4, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_br,
            "Мексика", "Бразилия",
            "Индия", "Чили",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_de,
            "Бельгия", "Германия",
            "Польша", "Нидерланды",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_dk,
            "Швеция", "Великобритания",
            "Норвегия", "Дания",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            7, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_in,
            "Шри-Ланка", "Бангладеш",
            "Индия", "Непал",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_kw,
            "Египет", "Кувейт",
            "Пакистан", "Турция",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            9, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_be,
            "Испания", "Германия",
            "Франция", "Бельгия",
            4
        )
        questionList.add(que9)

        val que10 = Question(
            10, "Флаг какой страны изображен на рисунке?",
            R.drawable.ic_flag_of_ru,
            "Россия", "Словения",
            "Нидерланды", "Словакия",
            1
        )
        questionList.add(que10)

        return questionList

    }

}