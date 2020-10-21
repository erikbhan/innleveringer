import java.util.ArrayList;

public class Menu {
    private ArrayList<Recipe> recipes;

    public Menu(ArrayList<Recipe> menu) {
        this.recipes = menu;
    }

    public void addRecipeToMenu(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Recipe recipe: recipes) {
            sum += recipe.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        String returnString = "-- MENU --";
        for (Recipe recipe: recipes) {
            returnString += "\n" + recipe;
        }
        return returnString;
    }
}
