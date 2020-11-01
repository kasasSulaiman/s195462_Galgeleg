package com.example.s195462galgeleg.interfaces;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.s195462galgeleg.model.Player;

import java.util.List;

@Dao
public interface PlayerDAO {

    @Query("SELECT * FROM playerLog")
    List<Player> getAllPlayers();

    @Insert
    void insertAll(Player... players);

    @Delete
    void deletePlayer(Player player);
}