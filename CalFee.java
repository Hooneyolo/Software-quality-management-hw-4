
/**
 * 렌탈 DVD 할인요금계산 소프트웨어
 * 
 * @author (2018315005 유제훈, 2018315033 태영준, 2017190038 키타야마요시아키) 
 * @version (2020.06.10)
 */
public class CalFee
{
    private double cost;
    private boolean old;
    /**
     * 할인대상을 확인해서 할인된 요금을 계산해주는 메소드
     * 
     * @param  age   나이
     * @param  old 구작(대여시작일로부터 6개월이상 경과된 작품)
     * 
     * @return cost  18세 이하는 10%할인, 65세이상은 20%할인
     *               구작(대여시작일로부터 6개월이상 경과된 작품)은 반액
     *               단, 2가지 이상의 할인적용조건이 중복되는 경우, 할인율이 높은 조건을 우선함.
     */
    public double Cal(int age, boolean old)
    {
        if(age >= 1 && age <= 18){
            this.cost = cost - (cost*0.1);
        }
        if(age >= 65){
            this.cost = cost - (cost*0.2);
        }
        if(old == true){
            this.cost = cost - (cost*0.5);
        }
        return cost;
    }
}
 