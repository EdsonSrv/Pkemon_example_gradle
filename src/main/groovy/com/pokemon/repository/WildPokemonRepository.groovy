package com.pokemon.repository

import com.pokemon.domain.WildPokemon
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WildPokemonRepository extends JpaRepository<WildPokemon, Integer> {
  List<WildPokemon> findByTrainerId(Integer trainerId)
}