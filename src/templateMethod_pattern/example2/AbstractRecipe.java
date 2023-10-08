package templateMethod_pattern.example2;

abstract class AbstractRecipe {
    public void execute(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourInCup(){
        System.out.println("Pouring into Cup");
    }

    // 후크 메서드(하위 클래스에서 선택적으로 오버라이드)
    boolean customerWantsCondiments(){
        return true;
    }
}
