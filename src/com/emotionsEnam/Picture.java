package com.emotionsEnam;

import com.emotionsEnam.EmotionColors;
import com.emotionsEnam.Emotions;
import com.emotionsEnam.ResourceName;

public class Picture {
    //    private static final double MIN_LEHGTH = 1080.00;
//    private static final double MAX_LEHGTH = 5400.00;
//    private static final double MIN_WIGTH = 864.00;
//    private static final double MAX_WIGTH = 4320.00;
//    private static final double MIN_FRAME = 20;
//    private static final double MAX_FRAME = 300;
    private double lehngth;
    private double wigth;
    private double frame;
    private EmotionColors color;
    private Emotions emotion;

//    public com.emotionsEnam.Picture() {
//        this.lehngth = 1080;
//        this.wigth = lehngth / 5 * 4;
//    }

    public Picture() {
        this.lehngth = 1080;
        this.wigth = lehngth / 5 * 4;
    }

    public Picture(ResourceName resourceName, double frame, Emotions emotion) {
        if (resourceName == ResourceName.INSTAGRAM_FEED_1_1) {
            this.lehngth = 1080;
            wigth = lehngth;
        }
        if (resourceName == ResourceName.FACEBOOK_PROFILE) {
            this.lehngth = 1600;
            wigth = lehngth;
        }
        if (resourceName == ResourceName.VKONTAKTE_PROFILE) {
            this.lehngth = 1200;
            wigth = lehngth;
        }
        if (resourceName == ResourceName.INSTAGRAM_FEED_4_5) {
            this.lehngth = 1080;
            wigth = lehngth / 5 * 4;
        }
        if (resourceName == ResourceName.FACEBOOK_FEED) {
            this.lehngth = 1600;
            wigth = lehngth / 5 * 4;
        }
        if (resourceName == ResourceName.VKONTAKTE_FEED) {
            this.lehngth = 1200;
            wigth = lehngth / 3 * 2;
        }
        if (resourceName == ResourceName.INSTAGRAM_STORIES
                || resourceName == ResourceName.FACEBOOK_STORIES
                || resourceName == ResourceName.VKONTAKTE_STORIES) {
            this.lehngth = 1920;
            wigth = lehngth / 16 * 9;
        }
        this.frame = frame;
        this.emotion = emotion;
    }

    public void fullness() {
        if (emotion == Emotions.ALARM) {
            color = EmotionColors.PALE_GREEN;
        }
        if (emotion == Emotions.ACCEPTANCE) {
            color = EmotionColors.PALE_YELLOW_GREEN;
        }
        if (emotion == Emotions.ADMIRATION) {
            color = EmotionColors.BRIGHT_YELLOW_GREEN;
        }
        if (emotion == Emotions.AGGRESSION) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.ALERTNESS) {
            color = EmotionColors.BRIGHT_ORANGE;
        }
        if (emotion == Emotions.AMAZEMENT) {
            color = EmotionColors.BRIGHT_BLUE_GREEN;
        }
        if (emotion == Emotions.ANGER) {
            color = EmotionColors.BRIGHT_RED;
        }
        if (emotion == Emotions.ANNOYANCE) {
            color = EmotionColors.PALE_RED;
        }
        if (emotion == Emotions.DISAPPOINTMENT) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.DISPLEASURE) {
            color = EmotionColors.LILAC;
        }
        if (emotion == Emotions.BOREDOM) {
            color = EmotionColors.PALE_LILAC;
        }
        if (emotion == Emotions.CONFIDENCE) {
            color = EmotionColors.YELLOW_GREEN;
        }
        if (emotion == Emotions.CONTEMPT) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.DELIGHT) {
            color = EmotionColors.BRIGHT_YELLOW;
        }
        if (emotion == Emotions.DISGUST) {
            color = EmotionColors.BRIGHT_LILAC;
        }
        if (emotion == Emotions.EXCITATION) {
            color = EmotionColors.PALE_BLUE_GREEN;
        }
        if (emotion == Emotions.EXPECTATION) {
            color = EmotionColors.ORANGE;
        }
        if (emotion == Emotions.FEAR) {
            color = EmotionColors.GREEN;
        }
        if (emotion == Emotions.HORROR) {
            color = EmotionColors.BRIGHT_GREEN;
        }
        if (emotion == Emotions.HUMILITY) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.JOY) {
            color = EmotionColors.YELLOW;
        }
        if (emotion == Emotions.INTEREST) {
            color = EmotionColors.PALE_ORANGE;
        }
        if (emotion == Emotions.LOVE) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.MALICE) {
            color = EmotionColors.RED;
        }
        if (emotion == Emotions.OPTIMISM) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.REPENTANCE) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.SADNESS) {
            color = EmotionColors.BLUE;
        }
        if (emotion == Emotions.SORROW) {
            color = EmotionColors.PALE_BLUE;
        }
        if (emotion == Emotions.SURPRISE) {
            color = EmotionColors.BLUE_GREEN;
        }
        if (emotion == Emotions.TRANQUILITY) {
            color = EmotionColors.PALE_YELLOW;
        }
        if (emotion == Emotions.TREMBLING) {
            color = EmotionColors.OTHER;
        }
        if (emotion == Emotions.WOE) {
            color = EmotionColors.BRIGHT_BLUE;
        }
    }

    public String getNameEmotion() {
        if (emotion == Emotions.ALARM) {
            return "Тревога. ";
        }
        if (emotion == Emotions.ACCEPTANCE) {
            return "Принятие. ";
        }
        if (emotion == Emotions.ADMIRATION) {
            return "Восхищение. ";
        }
        if (emotion == Emotions.AGGRESSION) {
            return "Агрессия. ";
        }
        if (emotion == Emotions.ALERTNESS) {
            return "Настороженность. ";
        }
        if (emotion == Emotions.AMAZEMENT) {
            return "Изумление. ";
        }
        if (emotion == Emotions.ANGER) {
            return "Гнев. ";
        }
        if (emotion == Emotions.ANNOYANCE) {
            return "Досада. ";
        }
        if (emotion == Emotions.DISAPPOINTMENT) {
            return "Разочарование. ";
        }
        if (emotion == Emotions.DISPLEASURE) {
            return "Неудовольствие. ";
        }
        if (emotion == Emotions.BOREDOM) {
            return "Скука. ";
        }
        if (emotion == Emotions.CONFIDENCE) {
            return "Доверие. ";
        }
        if (emotion == Emotions.CONTEMPT) {
            return "Презрение. ";
        }
        if (emotion == Emotions.DELIGHT) {
            return "Восторг. ";
        }
        if (emotion == Emotions.DISGUST) {
            return "Отвращение. ";
        }
        if (emotion == Emotions.EXCITATION) {
            return "Возбуждение. ";
        }
        if (emotion == Emotions.EXPECTATION) {
            return "Ожидание. ";
        }
        if (emotion == Emotions.FEAR) {
            return "Страх. ";
        }
        if (emotion == Emotions.HORROR) {
            return "Ужас. ";
        }
        if (emotion == Emotions.HUMILITY) {
            return "Покорность. ";
        }
        if (emotion == Emotions.JOY) {
            return "Радость. ";
        }
        if (emotion == Emotions.INTEREST) {
            return "Интерес. ";
        }
        if (emotion == Emotions.LOVE) {
            return "Любовь. ";
        }
        if (emotion == Emotions.MALICE) {
            return "Злость. ";
        }
        if (emotion == Emotions.OPTIMISM) {
            return "Оптимизм. ";
        }
        if (emotion == Emotions.REPENTANCE) {
            return "Раскаяние. ";
        }
        if (emotion == Emotions.SADNESS) {
            return "Грусть. ";
        }
        if (emotion == Emotions.SORROW) {
            return "Печаль. ";
        }
        if (emotion == Emotions.SURPRISE) {
            return "Удивление. ";
        }
        if (emotion == Emotions.TRANQUILITY) {
            return "Безмятежность. ";
        }
        if (emotion == Emotions.TREMBLING) {
            return "Трепет. ";
        }
        if (emotion == Emotions.WOE) {
            return "Горе. ";
        }
        else {
            return "Not found. ";
        }
    }

    public double getLehngth() {
        return lehngth;
    }

    public double getWigth() {
        return wigth;
    }

    public double getFrameThickness() {
        return frame;
    }

    public void setColors(EmotionColors color) {
        this.color = color;
    }

    public EmotionColors getColor() {
        return color;
    }

    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
    }

    public Emotions getEmotion() {
        return emotion;
    }
}
