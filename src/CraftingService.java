import java.util.List;

/**
 * CraftingService is an interface for crafting items in a game.
 *
 * @author Tobias Fetzer
 * @version 1.0
 * @date 12.10.2018
 */
public interface CraftingService {

    /**
     * adds a recipe to the crafting service, that can then be crafted
     *
     * @param recipe the recipe to be added
     */
    void addRecipe(Recipe recipe);

    /**
     * Returns the recipes which can be used with the given items
     *
     * @param items A List of items which are used or crafting
     * @return The list of recipes which can be used with the given items
     */
    List<Recipe> getRecipesForItems(List<Item> items);


    /**
     * Crafts one or more items out of the give items and the selected recipe. Can also be used to dismantle items with a different recipe
     *
     * @param recipe        the recipe used for the crafting
     * @param items the items used for crafting
     * @return The crafted item(s)
     */
    List<Item> craft(Recipe recipe, List<Item> items);

    /**
     * Returns all currently usable recipes
     *
     * @return List of all recipes
     */
    List<Recipe> getRecipes();

    /**
     * Checks if the items listed on the recipe match the input items
     * @param recipe    Recipe to be used in crafting
     * @param items Input items used in crafting
     * @return  Boolean, true if recipe can be used with given items
     */
    boolean checkCraftability(Recipe recipe, List<Item> items);

}
