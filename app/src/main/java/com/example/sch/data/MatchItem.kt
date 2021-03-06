package com.example.sch.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MatchItem(
    val begin_at: String,
    val detailed_stats: Boolean,
    val draw: Boolean,
    val end_at: String,
    val forfeit: Boolean,
    val game_advantage: String,
    val games: List<Game>,
    val id: Int,
    val league: League,
    val league_id: Int,
    val live: Live,
    val live_embed_url: String,
    val match_type: String,
    val modified_at: String,
    val name: String,
    val number_of_games: Int,
    val official_stream_url: String,
    val opponents: List<Opponent>,
    val original_scheduled_at: String,
    val rescheduled: Boolean,
    val results: List<Result>,
    val scheduled_at: String,
    val serie: Serie,
    val serie_id: Int,
    val slug: String,
    val status: String,
    val streams: Streams,
    val streams_list: List<Stream>,
    val tournament: Tournament,
    val tournament_id: Int,
    val videogame: Videogame,
    val videogame_version: String,
    val winner: Boolean,
    val winner_id: String
) : Parcelable