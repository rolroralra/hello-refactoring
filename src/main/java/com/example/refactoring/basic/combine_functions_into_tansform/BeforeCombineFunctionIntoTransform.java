package com.example.refactoring.basic.combine_functions_into_tansform;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class BeforeCombineFunctionIntoTransform {

    public static double baseCharge(int usage) {
        return usage * 0.5;
    }

    public static double basePrice(int usage) {
        return Math.min(usage, 100) * 0.03 + Math.max(0, usage - 100) * 0.05;
    }

    public static double baseChargeWithPrice(int usage) {
        return baseCharge(usage) + basePrice(usage);
    }

    public static double taxableCharge(int usage) {
        return Math.max(0, usage - 50);
    }

    @Getter
    public static class UsageCost {
        private final int usage;
        private final double baseCharge;
        private final double taxableCharge;
        private final double basePrice;

        public UsageCost(int usage) {
            this.usage = usage;
            this.baseCharge = baseCharge(usage);
            this.basePrice = basePrice(usage);
            this.taxableCharge = taxableCharge(usage);
        }
    }
}
