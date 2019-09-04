package com.pokemon.service

import com.pokemon.domain.Trainer

interface TrainerService {
  List<Trainer> findAll()
  Trainer findById(int id)
}