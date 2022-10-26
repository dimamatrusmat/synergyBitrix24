# Bitrix24 Synergy
no official 

Взято с 
[bitrix24-java-api](bitrix24-java-api)

У автора не спрашивал, но надеюсь он не против >_<

Сделанно для тех кто делает через JavaFX т.к загруска через dependency выдает ошибку + добавлена сущность Deal, но не для вашего битрикса

Для работа нужно скачать и в пакете javastream в пакете configs, создать класс Configs и заполнить:  
```
package javastream.configs;

public class Configs {
    public static final String token = "dkk0nz23131dsvz";
    public static final String account = "corp.synergy.ru";
    public static final int restId = 23123;
}

// Как пример https://corp.synergy.ru/rest/23123/dkk0nz23131dsvz/profile/
```