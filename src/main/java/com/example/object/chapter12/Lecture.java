package com.example.object.chapter12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    // 이수 여부 기준 점수
    private int pass;
    // 과목 명
    private String title;
    // 학생 성적
    public List<Integer> scores = new ArrayList<>();

    public Lecture(int pass, String title, List<Integer> scores) {
        this.pass = pass;
        this.title = title;
        this.scores = scores;
    }

    /**
     * 전체 학생들의 평균 성적 반환
     */
    public double averate() {
        return this.scores.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
    }

    public List<Integer> getScores() {
        return Collections.unmodifiableList(this.scores);
    }

    public String evaluate() {
        return String.format("Pass : %d Fail : %d", passCount(), failCount());
    }

    private long passCount() {
        return this.scores.stream()
                .filter(score -> score >= pass).count();
    }

    private long failCount() {
        return this.scores.size() - passCount();
    }
}
