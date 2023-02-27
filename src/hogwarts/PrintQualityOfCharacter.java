package hogwarts;

public class PrintQualityOfCharacter {
    public void print(Slizerin[] studies) {
        for (int i = 0; i < studies.length; i++) {
            Slizerin study = studies[i];
            int result = 0;
            result += study.getConjure() +
                    study.getMove() +
                    study.getCunning() +
                    study.getDetermination() +
                    study.getAmbition() +
                    study.getResourcefulness() +
                    study.getLustForPower();
            System.out.println(study.getName() +
                    " колдовство = " + study.getConjure() +
                    " баллов; трансгенерирование = " + study.getMove() +
                    " баллов; хитрость = " + study.getCunning() +
                    " баллов; решительность = " + study.getDetermination() +
                    " баллов; амбициозность = " + study.getAmbition() +
                    " баллов; находчивость = " + study.getResourcefulness() +
                    " баллов; жажда власти = " + study.getLustForPower() +
                    " баллов; итого = " + result + " баллов."
            );
        }
    }

}