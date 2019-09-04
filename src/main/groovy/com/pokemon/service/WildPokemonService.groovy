package com.pokemon.service

import com.pokemon.domain.Trainer

interface WildPokemonService {
  List<Trainer> findByTrainer(int id)
}