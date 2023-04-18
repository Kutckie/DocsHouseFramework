#language:ru

@ModelObjectService
Функция: Lanit.ru DocsHouse Documents Service Test
	@1
	Сценарий: Создание набора атрибутов
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Модели данных
		Когда пользователь создаёт новый набор аттрибутов
		И пользователь заполняет все обязательные поля в форме создания модели данных
		И пользователь нажимает кнопку "СОХРАНИТЬ"
		Тогда система выдаёт сообщение "Сохранение данных выполнено успешно"
		
	@edit
	Сценарий: Редактирование набора атрибутов
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Модели данных
		Когда пользователь редактирует набор атрибутов
		И пользователь нажимает кнопку "СОХРАНИТЬ"
		Тогда система выдаёт сообщение "Сохранение данных выполнено успешно"
		
	@1 @2
	Сценарий: Создание атрибута
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Модели данных
		Когда пользователь создаёт новый атрибут
		И пользователь заполняет все обязательные поля нового атрибута
		Тогда система выдаёт сообщение "Атрибут удачно добавлен в набор"
		
	@2
	Сценарий: Редактирование набора атрибутов
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Модели данных
		Когда пользователь редактирует атрибут
		Тогда система выдаёт сообщение "Атрибут успешно обновлен"
		
	@3
	Сценарий: Удаление набора атрибутов
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Модели данных
		Когда пользователь нажимает на чекбокс элемента
		И пользователь нажимает кнопку "УДАЛИТЬ"
		Тогда система выдаёт сообщение "Удаление набора атрибутов произведено успешно"
	
	
	
#	@filter
#	Сценарий: Поиск в списке набора атрибутов
#		Дано пользователь авторизован
#		Дано пользователь находится на основной странице сервиса Модели данных
#		И жди 1
#		Когда пользователь использует функцию поиска
#		И жди 1
#		Тогда пользователь может наблюдать элементы, соответствующие критериям поиска