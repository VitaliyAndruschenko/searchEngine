package searchengine.dto.statistics;


import lombok.Value;

@Value
public class StatisticsIndexDto {
    Long pageID;
    Long lemmaID;
    Float rank;
}
