public class MenuRegisterTest {
    public static void main(String[] args) {
        MenuRegister menuRegister = new MenuRegister();

        menuRegister.addNewRecipe("Sandwich", "lunch", 5);
        menuRegister.addNewRecipe("Fårikål", "middag", 10);
        menuRegister.addNewRecipe("Pommes frites", "tilbehør", 6);
        menuRegister.addNewRecipe("Salat", "tilbehør", 3);
        menuRegister.addNewRecipe("Iskrem", "dessert", 7);

        for (Recipe recipe: menuRegister.getAllRecipes()) {
            System.out.println(recipe);
        }

        menuRegister.addNewMenu();

        System.out.println(menuRegister.findRecipeByName("Salat"));
        System.out.println(new Menu(menuRegister.findRecipesOfType("middag")));
        System.out.print(menuRegister.findMenusWithinPriceRange(10, 15));

    }
}
