package lessons.nine.files.task.csv;

import lessons.nine.files.task.csv.account.AcctTurn;


public class Main {

    public static void main(String[] args) {

        /*1.	Создать новый проект, который будет читать файл csv банковской выписки movementsList.csv и парсить полученные строки.
                Путь к файлу выписки храните в константе.
            2.	Код должен выводить сводную информацию по этой выписке: общий приход, общий расход и разбивку расходов.
            3.
            Примеры работы программы
            Сумма расходов: 398 563.39 руб.
            Сумма доходов: 289 890.06 руб.

            Суммы расходов по организациям:
            RUSMOSKVA56  SHLOVE REPUBLIC        1 081.53 руб.
            RUSMOSCOW42 SHCL ETOILE                     126.34 руб.
            RUSPUSHKINO105ZOOMAGAZIN 4             217.65 руб. */


        AcctTurn.loadTurnFromFile();
        AcctTurn.printTurns();
        AcctTurn.totalIncome();
        AcctTurn.totalExpense();
        AcctTurn.expenseByOrganization();

    }


}
