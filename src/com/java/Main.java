package com.java;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        String str = "Hello";
        String student = "Спасибо Вам за лекции. Вот что значит дедлайн в 2 ночи)) С одной стороны у меня в голове, ой столько всего в домашке хотела сделать, такие планы были грандиозные, а тут 2,00 и уже как бы и не надо делать. Но я наверстаю в следующих домашках.";
        String studentNew = "А с другой стороны, это очень хорошо подобрано время. Ведь теперь реально можно заняться ГИТом, Чистым кодом и всем тем, чем не успела при выполнении ДЗ, а планировала";

        long l = 100;
        int b = (int) l;

        Person person = new Person();
        person.setName("Sveta");
        String name = person.getName();
        System.out.println(name);
    }
}
