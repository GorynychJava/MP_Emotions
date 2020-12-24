package com.emotionsEnam;

public class Main {
    public static void main(String[] args) {
        System.out.println("При создании картины необходимо ввести на английском: ");
        System.out.println("Наименование ресурса. Числовое значение толщины рамки. Желаемую эмоцию.");
//        System.out.println("Какую эмоцию вы хотите отразить в картине?");
//        Scanner scanner = new Scanner(System.in);
//        String nameEmotion = scanner.next("DELIGHT");
//        if (nameEmotion == "DELIGHT") {
//            com.emotionsEnam.Picture one = new com.emotionsEnam.Picture();
//            one.fullness();
//            System.out.println("Картина первая. " + one.getNameEmotion() + one.getLehngth() + " длиной, "
//                    + one.getWigth() + " шириной, с рамкой " + one.getFrameThickness()
//                    + " пикселей. Цвет картины - " + one.getColor() + ".");
//        }
//        else {
//            System.out.println("Неверный ввод!");
//        }

        Picture two = new Picture(ResourceName.FACEBOOK_FEED,15, Emotions.DELIGHT);
        two.fullness();
        System.out.println("Картина вторая. " + two.getNameEmotion() + two.getLehngth() + " длиной, "
                + two.getWigth() + " шириной, с рамкой " + two.getFrameThickness()
                + " пикселей. Цвет картины - " + two.getColor() + ".");

        Picture three = new Picture(ResourceName.INSTAGRAM_STORIES,0, Emotions.FEAR);
        three.fullness();
        System.out.println("Картина третья. " + three.getNameEmotion() + three.getLehngth() + " длиной, "
                + three.getWigth() + " шириной, с рамкой " + three.getFrameThickness()
                + " пикселей. Цвет картины - " + three.getColor() + ".");
    }
}
