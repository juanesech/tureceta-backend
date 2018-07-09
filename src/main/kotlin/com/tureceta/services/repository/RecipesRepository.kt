package com.tureceta.services.repository

import com.tureceta.services.model.Recipes
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.CrudRepository

interface RecipesRepository : MongoRepository<Recipes, String>