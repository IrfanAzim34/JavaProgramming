package day09_IfStatement;

public class ChooseLanguage {

    public static void main(String[] args) {

        int num = 6; // 1 ~ 5

        if (num == 1){
            System.out.println("Hello, thank for your call.");
        } else if (num == 2) {
            System.out.println("Hola, gracian para llamar.");
        } else if (num == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkuler.");
        } else if (num == 4) {
            System.out.println("Privet, spasibo za vash zvonok.");
        } else if (num == 5) {
            System.out.println("Merci, pour votre appel.");
        }else {
            System.out.println("Please, choose a number between 1~5, Thank you:)");
        }

    }

}

/*
3. Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
Write a program that can select the language based on the number that's given in selection and prints
the following message:
            for 1: Hello, thank for your call
            for 2: Hola, gracias para llamar
            for 3: Merhaba, aradiginiz icin tesekkurler
            for 4: Privet, spasibo za vash zvonok
            for 5: Merci ,pour votre appel
 */