package com.example.object.chapter12;

import java.util.List;

public class FormattedGradeLecture extends GradeLecture {

    public FormattedGradeLecture(int pass, String title, List<Grade> grades, List<Integer> scores) {
        super(pass, title, grades, scores);
    }

    public String formatAverage() {
        return String.format("Avg: %1.1f", super.averate());
    }
}
