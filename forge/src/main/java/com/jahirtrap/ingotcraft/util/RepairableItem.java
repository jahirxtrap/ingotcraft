package com.jahirtrap.ingotcraft.util;

public interface RepairableItem {
    default boolean isRepairable() {
        return true;
    }
}
