# Avandy news founder
Search for all news in popular RssList:
Forbes, Yandex, Mail.ru, Lenta, Izvestiya, Vesti, Garant, Life, RBK, Gazeta.ru, Vedomosti, BBC, Poplulyarnaya mekhanika, Nauka i zhizn', RT, C-com.news.Main, Pravitel'stvo RF, Gosduma RF, Rossiyskaya gazeta, Rosteh, Kommersant, Expert, Nasa, Yandex.Kosmos, Astronews, Google, Finam, Aton, MMVB, Esquire, GQ, N+1, SmartLab

<b>new UI:</b>

![image](https://user-images.githubusercontent.com/45883640/146688376-a359aca2-9d15-4963-9aae-589152f2203f.png)


Program features:
- keyword search
- sending the search result to e-mail (+ the ability to choose to automatically send the results after each search)
- export of search results to Excel
- double-clicking on the news opens the news web page
- additional search by keywords. Words can be deleted, and new ones can be added instead (without restrictions)
- analysis of word usage in news headlines using com.news.SQLite database
- using the checkboxes, you can choose where to search for the keyword: in the title or in the link to the news
- display of the program operation log
- when the program is closed, all installed checkboxes, email address, keywords and search interval are saved
- automatic data refresh for basic or keyword searches every 60 seconds
- the ability to work in the com.news.SQLite database
- the ability to add a new source for search
- the ability to view the folder with program files
- the ability to exclude unnecessary words from the analysis table (and remove them from the excluded ones)
- work without UI with commands (in Linux-Crontab or Windows-PowerShell) like:

      30 10 * * * java -jar /home/dchernyavskij/news.jar rps_project@mail.ru 1440 amazon apple рефинанс штраф налог > /home/dchernyavskij/news.log


![Image alt](https://github.com/mrprogre/news_lite/blob/master/gui.gif)

Возможности программы:
- поиск по ключевым словам
- отправка результата поиска на электронную почту (+ возможность выбора автоматической отправки результатов после каждого поиска)
- экспорт результатов поиска в Excel
- двойной щелчок по новости открывает веб-страницу новости
- дополнительный поиск по ключевым словам. Слова можно удалять, а вместо них добавлять новые (без ограничений)
- анализ употребления слов в заголовках новостей с использованием базы данных SQLite
- с помощью флажков вы можете выбрать, где искать ключевое слово: в заголовке или в ссылке на новость
- отображение журнала работы программы
- при закрытии программы сохраняются все установленные чекбоксы, адрес электронной почты, ключевые слова и интервал поиска
- автоматическое обновление данных для основного поиска или поиска по ключевым словам каждые 60 секунд
- возможность работы в базе SQLite
- возможность добавления нового источника для поиска
- возможность просмотра папки с файлами программы
- возможность исключить ненужные слова из таблицы анализа (и удалить их из исключенных)
- jar можно выложить на сервер где установлен Linux и указать команду в Сrontab для круглосуточного вызова программы. Ни одна новость не будет упущена! Вот команда, которую указывал я (параметр № 1 - адресат, 2 - интервал (момент вызова минус 1440 минут (сутки), далее ключевые слова. Т.е. каждый день в 10:30 утра я получал все новости за сутки по указанным словам + записывал их в лог):

        30 10 * * * java -jar /home/dchernyavskij/news.jar rps_project@mail.ru 1440 выплат ипотек рефинанс штраф налог > /home/dchernyavskij/news.log

В Windows при вызове данной команды в PowerShell:

        java -jar .\news.jar rps_project@mail.ru 180 москв хлеб балаших
