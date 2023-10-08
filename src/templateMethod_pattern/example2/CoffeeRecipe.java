package templateMethod_pattern.example2;

public class CoffeeRecipe extends AbstractRecipe{
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments(){
        // 후크 메서드 오버라이드 하여 커스터마이징
        return false;
    }
}
