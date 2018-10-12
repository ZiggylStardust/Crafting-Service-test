import java.util.List;

/**
 * CraftingService is an interface for crafting items in a game.
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
     * @param craftingItems A List of items which are used or crafting
     * @return The list of recipes which can be used with the given items
     */
    List<Recipe> getRecipesForItems(List<CraftingItems> craftingItems);


    /**
     * Crafts one or more items out of the give items and the selected recipe. Can also be used to dismantle items with a different recipe
     *
     * @param recipe        the recipe used for the crafting
     * @param craftingItems the items used for crafting
     * @return The crafted item(s)
     */
    List<CraftingItems> craft(Recipe recipe, List<CraftingItems> craftingItems);

    /**
     * Returns all currently usable recipes
     *
     * @return List of all recipes
     */
    List<Recipe> getRecipes();

    /**
     * Checks if the items listed on the recipe match the input items
     * @param recipe    Recipe to be used in crafting
     * @param craftingItems Input items used in crafting
     * @return  Boolean, true if recipe can be used with given items
     */
    boolean checkCraftability(Recipe recipe, List<CraftingItems> craftingItems);

}
