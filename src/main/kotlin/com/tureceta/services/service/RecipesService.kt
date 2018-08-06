package com.tureceta.services.service

import com.tureceta.services.model.Ingredients
import com.tureceta.services.model.Recipes
import com.tureceta.services.repository.RecipesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

interface RecipesService {
    fun new(name: String, instructions: String, ingredients: List<Ingredients>): String
}

@Service("recipesService")
class RecipesServiceImpl : RecipesService {
    @Autowired
    lateinit var recipesRepository: RecipesRepository

    /*override fun list(): List<Recipes> =
            recipesRepository.*/

    override fun new(name: String, instructions: String, ingredients: List<Ingredients>): String {
        val recipe = recipesRepository.findById(name).orElse(Recipes(name, instructions, ingredients))
        recipesRepository.save(recipe)
        return recipe.name
    }
}
