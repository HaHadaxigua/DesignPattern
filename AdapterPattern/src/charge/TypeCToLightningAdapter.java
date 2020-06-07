package charge;

public class TypeCToLightningAdapter implements Lightning {
    TypeC typeC;

    public TypeCToLightningAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void chargeWithLightning() {
        System.out.print("装上了转接口。。。。。");
        typeC.chargeWithTypeC();
    }
}
