package Day_14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int hello = 2;
        if (hello==1) {
            System.out.println("Thanks for calling");
        }else if (hello==2){
            System.out.println("hola, grasias por llamar");
        }else if (hello==3) {
            System.out.println("merhaba, aradiginiz icin tesekkur");
        }else if (hello==4) {
            System.out.println("privet, spasibo za vash zvonok");
        }
        System.out.println("thanks for calling wrong number :P");
    }
}
