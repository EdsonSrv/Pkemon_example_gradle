package com.pokemon.service.impl

import com.pokemon.domain.Trainer
import com.pokemon.service.WildPokemonService
import com.pokemon.repository.WildPokemonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class WildPokemonServiceImpl implements WildPokemonService {

  @Autowired
  private final WildPokemonRepository wildPokemonRepository

  @Override
  List<Trainer> findByTrainer(int id) {
    wildPokemonRepository.findByTrainerId(id)
  }
}