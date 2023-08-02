package org.example.services.strategies.refilwritestrategy.factory;

import org.example.models.RefilType;
import org.example.services.strategies.refilwritestrategy.BallpointRefilWriteStrategy;
import org.example.services.strategies.refilwritestrategy.GelPointRefilWriteStrategy;
import org.example.services.strategies.refilwritestrategy.RefilWriteStrategy;

public class RefilPenWriteStrategyFactory {
    public static RefilWriteStrategy getStratefyForType(RefilType type) {
        if(type.equals(RefilType.BALL)) {
            return new BallpointRefilWriteStrategy();
        } else if(type.equals(RefilType.GEL)) {
            return new GelPointRefilWriteStrategy();
        } else {
            throw new IllegalArgumentException("Unknown refil type");
        }
    }
}
