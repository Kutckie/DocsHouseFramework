#language:ru
@storageService
Функция: Lanit.ru DocsHouse Storage Service Test
	
	@SmokeTest @StorageLayer
	Сценарий: Успешное создание нового хранилища
		Дано пользователь авторизован
		Дано пользователь находится на основной странице сервиса Хранилищ
		Когда пользователь заполняет все обязательные поля
		* пользователь нажимает кнопку "СОХРАНИТЬ"
		Тогда система выдаёт сообщение "Сохранение данных выполнено успешно"
		
	Сценарий: Успешное редактирование уже созданного хранилища
		Дано пользователь авторизован
		Дано пользователь находится на странице уже созданного Хранилища
		Когда пользователь редактирует поле
		* пользователь нажимает кнопку "СОХРАНИТЬ"
		Тогда система выдаёт сообщение "Сохранение данных выполнено успешно"
		
	Сценарий: Успешное удаление уже созданного хранилища
		Дано пользователь авторизован
		Дано пользователь находится на странице уже созданного Хранилища
		Когда пользователь удаляет хранилище
		Тогда система выдаёт сообщение "Удаление хранилища произведено успешно"
	
	
	
	
	
	
#	@SmokeTest @StorageLayer
#	Scenario: Testing Storage creation
#		Given user is logged in
#		Given user is on Storage Creation Form
#		When user fills all required fields
#		And I validate that all required fields are filled
#		And user clicks SAVE button
#		Then I validate that "Сохранение данных выполнено успешно" message is displayed

#		When user edits Storage fields
#		And user clicks SAVE button
#		Then I validate that "Сохранение данных выполнено успешно" message is displayed

#		Given user is on Storage Main Form
#		And user clicks Storage checkbox
#		* user clicks DELETE button
#		* user confirms Storage deletion
#		Then I validate that "Удаление хранилища произведено успешно" message is displayed


#
#	@SmokeTest @PoliciesLayer
#	Scenario: Testing Policy creation
#	Given user is logged in
#	Given user is on Policy Creation Form
#	When user fills all required fields on Policy Creation Form
#	And I validate that all required fields are filled
#	And user clicks SAVE button
#	Then I validate that "Сохранение данных выполнено успешно" message is displayed
#	#
#	@SmokeTest @PolicyCheckbox
#	Scenario: Policy debug
#	Given user is logged in
#	Given user is on Policy Creation Form
#	When user clicks ADD new policy button
#	And clicks checkbox
#
#	@1
#	Scenario: Testing Storage editing
#	Given user is logged in
#	Given user is on Storage Main Form
#	When user clicks Storage checkbox
#	And user clicks DELETE button
#	And user confirms Storage deletion
#
#
#	Scenario: проверка файлов
#	Given user is logged in
#	Given file page
#	And user clicks ADD button