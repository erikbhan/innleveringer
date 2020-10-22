public class MenuRegisterTest {
    public static void main(String[] args) {
        MenuRegister menuRegister = new MenuRegister();
        menuRegister.addNewRecipe("Sandwich", "lunch", 5);
        menuRegister.addNewRecipe("Fårikål", "middag", 10);
        menuRegister.addNewRecipe("Pommes frites", "tilbehør", 6);
        menuRegister.addNewRecipe("Salat", "tilbehør", 3);
        menuRegister.addNewRecipe("Iskrem", "dessert", 7);
        menuRegister.addNewMenu();
        menuRegister.addNewMenu();
        menuRegister.addNewMenu();
        System.out.println(menuRegister);
        menuRegister.addNewRecipeToMenu(1, "Fårikål");
        menuRegister.addNewRecipeToMenu(1, "Fårikål");
        menuRegister.addNewRecipeToMenu(1, "Iskrem");
        menuRegister.addNewRecipeToMenu(2, "Iskrem");
        System.out.println(menuRegister);
        menuRegister.removeRecipeFromMenu(1, "Iskrem");
        System.out.println(menuRegister);
        for (Menu menu: menuRegister.findMenusWithinPriceRange(7, 10)) {
            System.out.println(menu);
        }
        for (Recipe recipe: menuRegister.findRecipesOfType("Fårikål")) {
            System.out.println(recipe);
        }
        for (Recipe recipe: menuRegister.findRecipesOfType("dessert")) {
            System.out.println(recipe);
        }
        System.out.println(menuRegister.findRecipeByName("Fårikål"));
        System.out.println(menuRegister.findRecipeByName("Fårigjfkaskgj"));
    }   //TODO: Ingen UML fordi det ville vel bare vært en rett linje?
}
