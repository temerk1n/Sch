package com.example.sch.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.time.Month

@Entity(tableName = "schedule_table")
data class MatchItemSimplified (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    val tournament_name : String,
    //val original_scheduled_at : MutableList<String>,
    val month: String,
    val monthDay : String,
    val hour : String,
    val minute : String,
    val firstOpponentName : String,
    val secondOpponentName : String,
    val firstOpponentImageURL: String?,
    val secondOpponentImageURL: String?,
)