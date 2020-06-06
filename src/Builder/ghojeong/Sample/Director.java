public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("SoCam");
        builder.makeString("고정완");
        builder.makeItems(new String[] { "영어 닉내임은 캔입니다.", "올해 목표: 뭔가 오픈소스 해보고 싶습니다.", });
        builder.makeString("유현석");
        builder.makeItems(new String[] { "영어 닉네임은 자비에 교수님입니다.", "올해 목표: 엑스맨 만들기" });
        builder.close(); // NOTE: close 를 해 주어야만 문서가 완성된다.
    }
}
