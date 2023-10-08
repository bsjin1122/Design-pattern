package templateMethod_pattern.example2;

/* 템플릿 메서드 패턴
 * 알고리즘의 각 단계를 확장할 수 있도록 하고, 특정 단계를 커스터마이징 하기 위한 특정 메서드를 제공
 */
public class Main {
    public static void main(String[] args) {
        AbstractRecipe teaRecipe = new TeaRecipe();
        teaRecipe.execute();
        System.out.println("-------------------");
        AbstractRecipe coffeeRecipe = new CoffeeRecipe();
        coffeeRecipe.execute();
    }
}
