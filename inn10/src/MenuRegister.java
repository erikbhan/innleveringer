import java.util.ArrayList;
import java.util.Scanner;

public class MenuRegister {
    private ArrayList<Menu> menuRegister;
    private ArrayList<Recipe> allRecipes;
    private Scanner scanner;

    public MenuRegister() {
        this.menuRegister = new ArrayList<>();
        this.allRecipes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public ArrayList<Recipe> getAllRecipes() {
        return allRecipes;
    }

    public void addNewRecipe(String recipeName, String recipeType, double recipePrice) {
        this.allRecipes.add(new Recipe(recipeName, recipeType, recipePrice));
    }

    public Recipe findRecipeByName(String name) {
        for (Recipe recipe: allRecipes) {
            if (recipe.getName().equals(name)) {
                return recipe;
            }
        }
        return null;
    }

    public ArrayList<Recipe> findRecipesOfType(String type) {
        ArrayList<Recipe> recipesOfType = new ArrayList<>();

        for (Recipe recipe: allRecipes) {
            if (recipe.getType().equals(type)) {
                recipesOfType.add(recipe);
            }
        }

        return recipesOfType;
    }

    public void addNewMenu() {
        ArrayList<Recipe> menu = new ArrayList<>();
        while (true) {
            System.out.print("Recipe to add ('exit' to exit): ");
            String recipeName = scanner.nextLine();

            if (recipeName.equals("exit")) {
                break;
            }

            for (Recipe recipe: allRecipes) {
                if (recipe.getName().equals(recipeName)) {
                    menu.add(recipe);
                    break;
                }
            }
        }
        this.menuRegister.add(new Menu(menu));
    }

    public ArrayList<Menu> findMenusWithinPriceRange(double priceFrom, double priceTo) {
        ArrayList<Menu> menus = new ArrayList<>();

        for (Menu menu: menuRegister) {
            if (menu.getTotalPrice() > priceFrom &&
                menu.getTotalPrice() < priceTo) {
                menus.add(menu);
            }
        }
        return menus;
    }
}
