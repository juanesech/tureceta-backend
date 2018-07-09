package com.tureceta.services.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias

@TypeAlias("recipe")
data class Recipes(@Id val name: String,
                  val description: String,
                  val ingredients: List<Ingredients> = listOf())

data class Ingredients(val ingredient: String,
                      val cant: String)
