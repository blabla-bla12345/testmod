package com.addis.testmod.thirst;

import net.minecraft.nbt.CompoundTag;

public class PlayerThirst {
    private int thirst;
    private static int MIN_THIRST = 0;
    private static int MAX_THIRST = 10;

    public int getThirst() {
        return thirst;
    }
    public void addThirst(int add){
        this.thirst = Math.min(thirst + add, MAX_THIRST);
    }
    public void subThirst(int sub){
        this.thirst = Math.max(thirst - sub, MIN_THIRST);
    }
    public void copyFrom(PlayerThirst source){
        this.thirst = source.thirst;
    }
    public void saveNBTData(CompoundTag nbt){
        nbt.putInt("thirst", thirst);
    }
    public void loadNBTData(CompoundTag nbt){
        thirst = nbt.getInt("thirst");
    }
}
