package com.tureceta.services.controller

import com.tureceta.services.model.Ingredients
import com.tureceta.services.service.RecipesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class NewRecipeController {
    @Autowired
    lateinit var recipesService: RecipesService

    @GetMapping("/new")
    fun new(name: String, description: String, ingredients: Array<Ingredients>): String {
       return recipesService.new(name, description, ingredients)

      }

    }