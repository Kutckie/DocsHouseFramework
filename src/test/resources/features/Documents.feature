#language:ru
@DocumentsService
Функция: Lanit.ru DocsHouse Documents Service Test
	# https://docs.google.com/spreadsheets/d/1Z113Q6H09OH834RRiGKH3azTX8O8YqVtHnZMYeE4Sww/edit#gid=0
	# Уточнить:
	# 1.Открыть карточку и продемонстрировать превью загруженного файла
	Предыстория: http://dsud-conf.lanit:8090/pages/viewpage.action?pageId=149131717
	
	@DocumentsServiceProduct
	Сценарий: Продуктовая демонстрация сервиса "Документы"
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Документы
		Когда пользователь создаёт новый документ
		И пользователь заполняет необходимые атрибуты
		И пользователь загружает файл
		И пользователь нажимает кнопку "СОХРАНИТЬ"
		Тогда система выдаёт сообщение "Сохранение данных выполнено успешно"
		И пользователь может наблюдать созданный документ в списке документов
		
	Сценарий: Пользователь меняет атрибуты
		Дано пользователь авторизован
		Дано пользователь находится на странице уже созданного документа
		Когда пользователь редактирует документ
		И пользователь нажимает кнопку "СОХРАНИТЬ"
		#Тогда система выдаёт сообщение "Сохранение данных выполнено успешно"
		#Сообщение пока не добавлено на демо
		#Добавить валидацию
	
	Сценарий: Пользователь удаляет созданный документ
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Документы
		Когда пользователь нажимает на чекбокс элемента
		И пользователь нажимает кнопку "УДАЛИТЬ"
		Тогда система выдаёт сообщение "Удаление объекта произведено успешно"
	@123
	Сценарий: dm.Фильтрация документов
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Документы
		Когда пользователь использует функцию поиска
	
	
	
#	@Docs1
#	Сценарий: Пользователь вносит изменения в документ
#		Дано пользователь авторизован
#		Дано пользователь находится на странице уже созданного документа
