import java.util.ArrayList;

public class MenuRegister {
    private final ArrayList<Menu> menuRegister;
    private final ArrayList<Recipe> allRecipes;

    public MenuRegister() {
        this.menuRegister = new ArrayList<>();
        this.allRecipes = new ArrayList<>();
    }

    public void addNewRecipe(String recipeName, String recipeType, double recipePrice) {
        this.allRecipes.add(new Recipe(recipeName, recipeType, recipePrice));
    }

    //Private helper-method to get Menu from menuNumber
    private Menu findMenu(int menuNumber) {
        for (Menu menu: this.menuRegister) {
            if (menu.getMenuNumber() == menuNumber) {
                return menu;
            }
        }
        return null;
    }

    //Private helper-method to check if a menuNumber is occupied
    private boolean menuNumberExists(int number) {
        for (Menu menu: this.menuRegister) {
            if (menu.getMenuNumber() == number) {
                return true;
            }
        }
        return false;
    }

    public void addNewMenu() {
        int menuNumber = 1;
        while (menuNumberExists(menuNumber)) {
            menuNumber++;
        }
        this.menuRegister.add(new Menu(menuNumber));
    }

    public void addNewRecipeToMenu(int menuNumber, String recipeName) {
        Menu menu = findMenu(menuNumber);
        if (menu == null) {
            System.out.println("Could not find menu number " + menuNumber + ", canceling...");
            return;
        }
        menu.addRecipeToMenu(recipeName, this.allRecipes);
    }

    public void removeRecipeFromMenu(int menuNumber, String recipeName) {
        Menu menu = findMenu(menuNumber);
        if (menu == null) {
            System.out.println("Could not find menu number " + menuNumber + ", canceling...");
            return;
        }
        menu.removeRecipeFromMenu(recipeName);
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

    //Inclusive search within a price interval
    public ArrayList<Menu> findMenusWithinPriceRange(double priceFrom, double priceTo) {
        if (priceTo < priceFrom) {
            System.out.println("Invalid interval");
            return null;
        }
        ArrayList<Menu> menus = new ArrayList<>();
        for (Menu menu: this.menuRegister) {
            double menuPrice = menu.getTotalPrice();
            if (priceFrom <= menuPrice && menuPrice <= priceTo) {
                menus.add(menu);
            }
        }
        return menus;
    }

    @Override
    public String toString() {
        String returnString = "\n-- RECIPES --";
        for (Recipe recipe: allRecipes) {
            returnString += "\n" + recipe;
        }
        returnString += "\n";
        for (Menu menu: this.menuRegister) {
            returnString += "\n" + menu;
        }
        returnString += "\n";
        return  returnString + "\n";
    }
}
