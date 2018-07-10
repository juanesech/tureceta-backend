package com.tureceta.services.controller

import com.tureceta.services.model.Ingredients
import com.tureceta.services.service.RecipesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class NewRecipeController {
    @Autowired
    lateinit var recipesService: RecipesService

    data class NewRecipe(
            val name: String,
            val instructions: String,
            val ingredients: List<Ingredients>)

    @RequestMapping("/new")
    fun new(@RequestBody recipe: NewRecipe): String {
       recipesService.new(recipe.name, recipe.instructions, recipe.ingredients)
        return "${recipe.name} Saved"
      }

    }