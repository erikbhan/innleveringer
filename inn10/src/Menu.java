import java.util.ArrayList;

public class Menu {
    private final ArrayList<Recipe> recipes;
    private final int menuNumber; //Entydig nummer for å identifisere

    public Menu(int menuNumber) {
        this.recipes = new ArrayList<>();
        this.menuNumber = menuNumber;
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public void addRecipeToMenu(String recipeToSearchFor, ArrayList<Recipe> allRecipes) {
        Recipe recipeToAdd = null;

        //Find recipe in allRecipes
        for (Recipe recipe : allRecipes) {
            if (recipe.getName().equals(recipeToSearchFor)) {
                recipeToAdd = recipe;
                break;
            }
        }

        //If recipe is not found in allRecipes, cancel
        if (recipeToAdd == null) {
            System.out.println("Could not find recipe to add");
            return;
        }

        //Prevent adding recipes multiple times
        if (this.recipes.contains(recipeToAdd)) {
            System.out.println("Recipe already in menu");
            return;
        }

        System.out.println("Successfully added recipe to menu");
        this.recipes.add(recipeToAdd);
    }

    public void removeRecipeFromMenu(String recipeToRemove) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().equals(recipeToRemove)) {
                System.out.println("Removed: " + recipe);
                this.recipes.remove(recipe);

                //Return statement to ensure only removing one recipe at a time.
                return;
            }
            System.out.println("Could not find recipe in menu");
        }
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Recipe recipe : this.recipes) {
            sum += recipe.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        String returnString = "-- MENU #" + menuNumber + ", PRICE: " + getTotalPrice() + " --";

        if (this.recipes.isEmpty()) {
            return returnString + "\nEmpty\n";
        }

        for (Recipe recipe : this.recipes) {
            if (recipe == null) {
                continue;
            }
            returnString += "\n" + recipe;
        }

        return returnString + "\n";
    }
}