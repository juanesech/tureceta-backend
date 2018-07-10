package com.tureceta.services


import com.github.fakemongo.junit.FongoRule
import com.tureceta.services.model.Ingredients
import com.tureceta.services.model.Recipes
import com.tureceta.services.repository.RecipesRepository
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
abstract class NewRecipeTestWithFongo(val initializeTestData: Boolean = true) {
    @get:Rule
    val fongoRule = FongoRule()

    @Autowired
    lateinit var recipesRepository: RecipesRepository

    @Before
    fun setupTestDatabase() {
        if (initializeTestData) {
            recipesRepository.save(RECIPE1)
            recipesRepository.save(RECIPE2)
        }
    }

    companion object {
        val RECIPE1 = Recipes("Arroz con leche", "Agregue la leche al arroz", listOf(
                Ingredients("Arroz", "2 Libras"),
                Ingredients("Leche", "3 Litros")
            )
        )

        val RECIPE2 = Recipes("Leche con azucar", "Agregue azucar a la leche", listOf(
                Ingredients("Azucar", "1 cuchara"),
                Ingredients("Leche", "1 Vaso")
            )
        )



    }
}