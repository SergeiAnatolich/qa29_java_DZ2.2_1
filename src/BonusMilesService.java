public class BonusMilesService {
    public int calculate (int cost){
        int multiplicity = 20; //кратность начисления бонусов
        int bonusRate = 1; //бонусная ставка в милях
        int bonus = cost/multiplicity*bonusRate;
        return bonus;
    }
}
