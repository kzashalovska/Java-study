package org.example.practice.practice2.easyTask;

import lombok.Data;

@Data
public class NameRank {
    private String rank;
    private String maleName;
    private String femaleName;

    public NameRank(String rank, String maleName, String femaleName) {
        this.rank = rank;
        this.maleName = maleName;
        this.femaleName = femaleName;
    }
}
